package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import org.testng.annotations.Test;

public class APITesting014_DELETE_NONBddStyle {

    @Test
    public void test_delete_non_bdd() {

        String token = "e04652ffe586c28";
        String bookingid = "3995";


        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        requestSpecification.log().all();

        Response response = requestSpecification.when().delete();

        ValidatableResponse validatableResponse = response.then().log().all();

         validatableResponse.statusCode(200);
        //validatableResponse.statusCode(201);
    }
}
