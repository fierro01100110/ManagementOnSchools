package stepdefinitions.api_stepdefinitions;

import base_url.Base_Url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class US10_ApiStepDefs extends Base_Url {

    Response response;

    @Given("send get request")
    public void send_get_request() {
        setSpec();
        spec.pathParams("first", "lessonPrograms", "second", "getAllUnassigned");

        response=given(spec).get("{first}/{second}");
        response.prettyPrint();
    
    }
    @Then("body should contain lessonName {string}, educationTerm {string}, day {string}, startTime {string}, stopTime {string}")
    public void body_should_contain_lesson_name_education_term_day_start_time_stop_time(String lessonName, String string2, String day, String startTime, String string5) {

        JsonPath jsonPath = response.jsonPath();
        String actLessonName = jsonPath.getList("findAll{it.day=='"+day+"'}.lessonName").toString();
        assertTrue(actLessonName.contains(lessonName));
        assertTrue(actLessonName.contains(startTime));
        System.out.println("actLessonName = " + actLessonName);

    }

   
 

}
