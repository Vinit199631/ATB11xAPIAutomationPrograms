package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab08_GET_BDD_Style {
    String pincode = "110048";
    @Test
    public void test_GET_POSITIVE_TC1(){
        pincode ="110048";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
}
