package Restassured_Basics_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class apitesting_Get_Testng {



    @Test
    public static void test_get_Request(){


        RestAssured
            .given()
            .baseUri("https://restful-booker.herokuapp.com")
            .basePath("/booking")
            .when()
            .get()
            .then().log().all()
            .statusCode(200);



    }










}
