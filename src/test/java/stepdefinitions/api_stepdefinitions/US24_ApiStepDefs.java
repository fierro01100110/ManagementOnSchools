package stepdefinitions.api_stepdefinitions;

import api_pojo.SeldaExpectedPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US24_ApiStepDefs {
    Response response;
    SeldaExpectedPojo expectedData;

    @Given("send the get request by userId")
    public void sendTheGetRequestByUserId() {
        // https://managementonschools.com/app/teachers/getSavedTeacherById/31

        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", 31);

//set the expected date
        expectedData=new SeldaExpectedPojo("nelle.zbon","John","Doe","1999-05-01","408-85-8397","Germany","683-103-7713","MALE","clarice.cummerata@gmail.com");
        System.out.println(expectedData);

        System.out.println("Hello");
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("assert the body after added the new teacher")
    public void assertTheBodyAfterAddedTheNewTeacher() {
        Map<String,Object> actualData =response.as(HashMap.class);

        System.out.println("Hello World");
        System.out.println(actualData.get("message"));
        System.out.println( ( (Map) actualData.get("object") ).get("birthPlace").toString() );
//do assertion
        // assertEquals(expectedData.getUsername(),((Map) actualData.get("object") ).get("username").toString() );
        assertEquals(expectedData.getSurname(),((Map) actualData.get("object") ).get("surname").toString() );
        assertEquals(expectedData.getName(),((Map) actualData.get("object") ).get("name").toString() );
        assertEquals(expectedData.getBirthDay(),((Map) actualData.get("object") ).get("birthDay").toString() );
        // assertEquals(expectedData.getSsn(),((Map) actualData.get("object") ).get("ssn").toString() );
        assertEquals(expectedData.getBirthPlace(),((Map) actualData.get("object") ).get("birthPlace").toString() );
        //assertEquals(expectedData.getPhoneNumber(),((Map) actualData.get("object") ).get("phoneNumber").toString() );
        assertEquals(expectedData.getGender(),((Map) actualData.get("object") ).get("gender").toString() );
        //assertEquals(expectedData.getEmail(),((Map) actualData.get("object") ).get("email").toString() );
    }
}
