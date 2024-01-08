package gds.api;

import classes.lockSeats.LockSeatsRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LockSeats {
    public static Response executeLockSeats(LockSeatsRequest body, String token, String url) {
        return RestAssured.given()
                .header("Authorization", "Bearer " + token)
                .contentType(ContentType.JSON)
                .body(body)
                .post(url);
    }
}
