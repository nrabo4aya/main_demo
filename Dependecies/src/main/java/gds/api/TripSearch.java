package gds.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TripSearch {
    public static Response executeSearch(String token, String fromId, String toId, String date, String lang, String passCount, String url) {
        return RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .param("from_id", fromId)
                .param("to_id", toId)
                .param("date", date)
                .param("lang", lang)
                .param("pass_count", passCount)
                .when()
                .get(url);
    }
}
