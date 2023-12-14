package gds.api;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Login {

    public static Response executeLogin(String userName, String password, String url) {

        Response response = RestAssured.given()
                .param("username", userName)
                .param("password", password)
                .post(url);

        return response;
    }
}
