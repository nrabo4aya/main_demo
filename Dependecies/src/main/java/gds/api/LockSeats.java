package gds.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LockSeats {
    public static Response executeLockSeats(String token, String fromId, String toId, String date, String lang, String passCount, String url){
        return RestAssured.given()
                .header("Authorization", "Bearer" + token)
    }
}
