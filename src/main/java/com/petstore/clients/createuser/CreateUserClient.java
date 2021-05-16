package com.petstore.clients.createuser;

import com.petstore.model.createuser.request.CreateUserRequest;
import com.petstore.model.createuser.response.CreateUserResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Reporter;

import static io.restassured.RestAssured.given;

public class CreateUserClient {

    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {

        String host = "https://petstore.swagger.io";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(createUserRequest)
                .when()
                .post(host + "/v2/user");

        Reporter.log(String.format("(POST)CreateUser Response --- {%s} %s", response.getStatusCode(), response.asString()), true);

        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        createUserResponse.setHttpStatusCode(response.getStatusCode());

        return createUserResponse;
    }
}
