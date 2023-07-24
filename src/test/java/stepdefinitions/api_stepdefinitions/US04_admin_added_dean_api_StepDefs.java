package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;


import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class US04_admin_added_dean_api_StepDefs {
    Response response;

    @Given("send get request dean by {string}")
    public void send_get_request_dean_by(String username) {
        // Write code here that turns the phrase above into concrete actions
        //Set the URL
        setSpec();
        spec.pathParams("first","dean","second", "getAll").queryParam("size","10000");
        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();


    }
    @Then("body should contain username {string}, birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string},ssn {string}, surname {string}")
    public void bodyShouldContainUsernameBirth_dayBirth_placeGenderNamePhone_numberSsnSurname(String username, String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) {
        // Write code here that turns the phrase above into concrete actions
        JsonPath jsonPath = response.jsonPath();
        String actBirthday = jsonPath.getList("content.findAll{it.username='"+username+"'}.birth_day").get(0).toString();
        String actBirthplace = jsonPath.getList("content.findAll{it.username='"+username+"'}.birth_place").get(0).toString();
        String actGender = jsonPath.getList("content.findAll{it.username='"+username+"'}.gender").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.username='"+username+"'}.name").get(0).toString();
        String actPhoneNumber = jsonPath.getList("content.findAll{it.username='"+username+"'}.phone_number").get(0).toString();
        String actSsn = jsonPath.getList("content.findAll{it.username='"+username+"'}.ssn").get(0).toString();
        String actSurname = jsonPath.getList("content.findAll{it.username='"+username+"'}.surname").get(0).toString();
        String actUsername = jsonPath.getList("content.findAll{it.username='"+username+"'}.username").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(birth_day, actBirthday);
        assertEquals(birth_place,actBirthplace);
        assertEquals(gender,actGender);
        assertEquals(name, actName);
        assertEquals(phone_number, actPhoneNumber);
        assertEquals(ssn,actSsn);
        assertEquals(surname, actSurname);
        assertEquals(username,actUsername);

        throw new io.cucumber.java.PendingException();
    }


}
