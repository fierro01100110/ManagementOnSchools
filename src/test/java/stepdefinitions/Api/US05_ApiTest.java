package stepdefinitions.Api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static base_url.MOSBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US05_ApiTest {
    Response response;
    @Given("send get request by ssn {string}")
    public void send_get_request_by_ssn(String string) {
        //https://managementonschools.com/app/dean/getAll
        spec.pathParams("first","dean","second", "getAll");
        response = given(spec).get("{first}/{second}");
       // response.prettyPrint();
    }

    @Then("body should contain name {string}, gender {string}, phoneNumber {string}, ssn {string}, username{string}")
    public void bodyShouldContainNameGenderPhone_numberSsnUser_Name(String name, String gender, String phoneNumber, String ssn, String username) {
        JsonPath jsonPath = response.jsonPath();
        List<String> mylist = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}");

        // Actual Data
        String actName = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.name").get(0).toString();
        String actGender = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.gender").get(0).toString();
        String actPhoneNumber = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.phoneNumber").get(0).toString();
        String actSsn = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.ssn").get(0).toString();
        String actUserName = jsonPath.getList("findAll{it.ssn=='" + ssn + "'}.username").get(0).toString();

        //Expected Data
        //  System.out.println(mylist);
        assertEquals(name, actName);
        assertEquals(gender, actGender);
        assertEquals(phoneNumber, actPhoneNumber);
        assertEquals(ssn, actSsn);
        assertEquals(username, actUserName);
    }
}
