package gds.api.tests;

import gds.api.Login;
import gds.api.TripSearch;
import tripSearchApi.SegmentsItem;
import tripSearchApi.TripSearchResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

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
        String date = "2023-12-29";
        String lang = "en";
        String passCount = "1";
        String url = BASE_URL + "/search/v2.1/trips";

        Response searchResponse = TripSearch.executeSearch(token, fromId, toId, date, lang, passCount, url);
        assertThat(searchResponse.getStatusCode()).isEqualTo(200);
        TripSearchResponse tripSearchResponse = searchResponse.getBody().as(TripSearchResponse.class);
        System.out.println(tripSearchResponse);
        SegmentsItem segmentsItem = tripSearchResponse.getSegments().get(0);
        String tripId = segmentsItem.getId();

    }
}
