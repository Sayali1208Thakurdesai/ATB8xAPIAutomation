package Restassured_Basics_GET;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest_005_BDDstyleGET {

    @Description("TC1- BDDstyle-Positive Testcase")

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_BDDGET_requestPositive() {

        String pincode = "388620";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .log().all().get()
                .then()
                .log().all()
                .statusCode(200);


    }


    @Description("TC1- BDDstyle-Negative Testcase")

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_BDDGET_requestNegative() {

        String pincode = "-1";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .log().all().get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
