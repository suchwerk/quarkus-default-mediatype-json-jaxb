package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.specification.RequestSpecification;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ReactiveGreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        var response = given().accept("application/json, text/plain, */*").get("/hello");
        var contentType = response.header("Content-Type"); 
        System.out.println("##########################: " + contentType); 
        //   .when().get("/hello")
        //   .then()
        //      .statusCode(200)                   
    }

}