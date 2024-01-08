package gds.api.tests;

import classes.lockSeats.*;
import gds.api.LockSeats;
import gds.api.Login;
import gds.api.TripSearch;
import tripSearchApi.SegmentsItem;
import tripSearchApi.TripSearchResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseTests {

    public static final String USER_NAME = "ITRdevagent";
    public static final String USER_PASSWORD = "12345678qQ";
    public static final String BASE_URL = "https://gds-test.gillbus.com";
    public static String token;


    @Test
    public void testLoginInvalid() {
        Response response = Login.executeLogin(USER_NAME, "password", BASE_URL + "/v2.1/login");
        assertThat(response.getStatusCode()).isEqualTo(403);
    }

    @Test
    public void testLoginValid() {
        Response response = Login.executeLogin(USER_NAME, USER_PASSWORD, BASE_URL + "/v2.1/login");
        token = response.getBody().jsonPath().getString("access_token");
        assertThat(response.getStatusCode()).isEqualTo(200);
        assertThat(token).isNotNull();
    }

    @Test
    public void testSearch() {

        Response loginResponse = Login.executeLogin(USER_NAME, USER_PASSWORD, BASE_URL + "/v2.1/login");
        token = loginResponse.getBody().jsonPath().getString("access_token");
        assertThat(loginResponse.getStatusCode()).isEqualTo(200);
        assertThat(token).isNotNull();

        String fromId = "1750";
        String toId = "1326";
        String date = "2024-01-11";
        String lang = "en";
        String passCount = "1";
        String searchUrl = BASE_URL + "/search/v2.1/trips";

        Response searchResponse = TripSearch.executeSearch(token, fromId, toId, date, lang, passCount, searchUrl);
        assertThat(searchResponse.getStatusCode()).isEqualTo(200);
        TripSearchResponse tripSearchResponse = searchResponse.getBody().as(TripSearchResponse.class);
        System.out.println(tripSearchResponse);
        SegmentsItem segmentsItem = tripSearchResponse.getSegments().get(0);
        String tripId = segmentsItem.getId();

        LockSeatsRequest lockSeatsBody = new LockSeatsRequest();
        lockSeatsBody.setPassengerCount(1);
        lockSeatsBody.setTripId(tripId);
        String departureDateString = segmentsItem.getDepartureDateTime();

        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date dateTime;
        try {
            dateTime = inputFormat.parse(departureDateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateWithoutTime = outputFormat.format(dateTime);


        lockSeatsBody.setTripDate(dateWithoutTime);


        List<PassengersItem> passengersList = new ArrayList<>();
        PassengersItem passenger = new PassengersItem();
        passenger.setPassengerNum(0);
        passenger.setPassengerAge(25);
        passengersList.add(passenger);


        lockSeatsBody.setPassengers(passengersList);

        SeatsItem seatsItem = new SeatsItem();
        seatsItem.setSegmentId(tripId);
        seatsItem.setSeatClass(segmentsItem.getClasses().get(0).getJsonMemberClass());

        List<SegmentSeatsItem> seatList = new ArrayList<>();
        SegmentSeatsItem seat = new SegmentSeatsItem();
        seat.setPassengerNum(0);
        seat.setTariffCode(segmentsItem.getClasses().get(0).getPriceList().get(0).getTariffCode());
        seatList.add(seat);

        seatsItem.setSegmentSeats(seatList);

        lockSeatsBody.setSeats(List.of(seatsItem));
        String lockSeatsUrl = BASE_URL + "/sale/v2.1/lockseats";

        Response response = LockSeats.executeLockSeats(lockSeatsBody, token, lockSeatsUrl);
        assertThat(response.getStatusCode()).isEqualTo(200);
        LockSeatsResponse lockSeatsResponse = response.getBody().as(LockSeatsResponse.class);

    }
}
