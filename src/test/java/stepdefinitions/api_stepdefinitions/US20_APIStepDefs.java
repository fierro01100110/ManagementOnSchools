package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class US20_APIStepDefs {
    Response response;

    @Given("Send get request by\"{int}\"")
    public void send_get_request_by(Integer id) {

        //https://managementonschools.com/app/meet/getMeetById/1030
        spec.pathParams("first","meet","second","getMeetById", "third", 1030);

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        //response.prettyPrint();

    }
    @Then("Body should contain id {string}, date {string}, description {string}, startTime {string}, stopTime {string}")
    public void body_should_contain_id_date_description_startTime_stopTime(String id, String date, String description, String startTime, String stopTime) {
        //Do assertion
        JsonPath jsonPath = response.jsonPath();

        assertTrue(jsonPath.getList("object.students.meetList.description").toString().contains(description));
        assertTrue(jsonPath.getList("object.students.meetList.date").toString().contains(date));
        //assertTrue(jsonPath.getList("object.students.meetList.startTime").toString().contains(startTime));
        //assertTrue(jsonPath.getList("object.students.meetList.stopTime").toString().contains(stopTime));

//
//        //String actId = jsonPath.getList("object.findAll{it.id=='" + id + "'}.id").toString();
//        String actDate = jsonPath.getList("object.findAll{it.description=='" + description+ "'}.date").toString();
//        String actDescription = jsonPath.getList("object.findAll{it.description=='" + description + "'}.description").toString();
//        String actStartTime = jsonPath.getList("object.findAll{it.description=='" + description + "'}.startTime").toString();
//        String actStopTime = jsonPath.getList("object.findAll{it.description=='" + description + "'}.stopTime").toString();
//
//        assertEquals(200, response.statusCode());
//        //assertEquals(id, actId);
//        assertEquals(date, actDate);
//        assertEquals(description, actDescription);
//        assertEquals(startTime, actStartTime);
//        assertEquals(stopTime, actStopTime);


    }

}

