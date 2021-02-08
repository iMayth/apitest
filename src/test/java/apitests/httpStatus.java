package apitests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.baseURI;

public class httpStatus {

    @BeforeClass
    public void beforeclass(){
        baseURI= "http://generator.swagger.io/api/swagger.json";
    }

    @Test
    public void post() {

        Response response = given().accept(ContentType.JSON)
                .when().get(baseURI);

        System.out.println(response.statusCode());

        Assert.assertEquals(response.statusCode(),200);


    }


}
