package gds.api.tests;

import gds.api.Login;
import gds.api.TripSearch;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseTests {

    public static final String USER_NAME = "ITRdevagent";
    public static final String USER_PASSWORD = "12345678qQ";
    public static final String BASE_URL = "https://gds-dev1.gillbus.com";


    @Test
    public void testLoginInvalid() {
        Response response = Login.executeLogin(USER_NAME, "password", BASE_URL + "/v2.1/login");
        assertThat(response.getStatusCode()).isEqualTo(403);
    }

    @Test
    public void testLoginValid() {
        Response response = Login.executeLogin(USER_NAME, USER_PASSWORD, BASE_URL + "/v2.1/login");
        String token = response.getBody().jsonPath().getString("access_token");
        assertThat(response.getStatusCode()).isEqualTo(200);
        assertThat(token).isNotNull();
    }

    @Test
    public void testSearch() {

        Response loginResponse = Login.executeLogin(USER_NAME, USER_PASSWORD, BASE_URL + "/v2.1/login");
        String token = loginResponse.getBody().jsonPath().getString("access_token");
        assertThat(loginResponse.getStatusCode()).isEqualTo(200);
        assertThat(token).isNotNull();

        String fromId = "1611";
        String toId = "1611";
        String date = "2023-12-22";
        String lang = "en";
        String passCount = "1";
        String url = BASE_URL + "/search/v2.1/trips";

        Response searchResponse = TripSearch.executeSearch(token, fromId, toId, date, lang, passCount, url);
        assertThat(searchResponse.getStatusCode()).isEqualTo(204);

    }
}
