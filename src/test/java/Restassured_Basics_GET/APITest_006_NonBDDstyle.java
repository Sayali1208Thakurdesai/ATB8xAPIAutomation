package Restassured_Basics_GET;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest_006_NonBDDstyle {

    @Description("TC1- NonBDDstyle-Positive Testcase")

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_NonbddstyleGETPositive() {

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/388620");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);

    }


    @Description("TC2- NonBDDstyle-Negative Testcase")

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_NonbddstyleGETNegative() {


        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);


    }



    }
