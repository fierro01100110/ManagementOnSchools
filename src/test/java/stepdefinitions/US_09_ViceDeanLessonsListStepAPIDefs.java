package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Objects;

import static base_url.ManagementOnSchoolsBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_09_ViceDeanLessonsListStepAPIDefs {
    Response response;

    @Given("send get request by lesson_name {string}")
    public void send_get_request_by_lesson_name(String lesson_name) {
        //Set the url
        //https://managementonschools.com/app/lessons/getAll
        //https://managementonschools.com/app/guestUser/getAll?size=10000
        spec.pathParams("first", "lessons", "second", "getAll");

        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }
    @Then("body should contain lesson_name {string} ,compulsory {string}, credit_score {string}")
    public void body_should_contain_lesson_name_compulsory_credit_score(String lesson_name, String compulsory, String credit_score) {


        JsonPath jsonPath = response.jsonPath();

        String actcompulsory = jsonPath.getList("findAll{it.lessonName=='" + lesson_name + "'}.compulsory").get(0).toString();
        String actcredit_score = jsonPath.getList("findAll{it.lessonName=='" + lesson_name + "'}.creditScore").get(0).toString();
        String actlesson_name = jsonPath.getList("findAll{it.lessonName=='" + lesson_name + "'}.lessonName").get(0).toString();
        System.out.println(actlesson_name);
        System.out.println(actcompulsory);
        System.out.println(actcredit_score);


        assertEquals(200, response.statusCode());
        assertEquals(lesson_name, actlesson_name);
        assertEquals(compulsory, actcompulsory);
        assertEquals(credit_score, actcredit_score);
    }


    @Then("body must be empty with non existing lesson_name {string}")
    public void body_must_be_empty_with_non_existing_lesson_name(String lesson_name) {


        List<Objects> dataList = response.jsonPath().getList("findAll{it.lessonName=='" + lesson_name + "'}");
        assertTrue(dataList.isEmpty());

    }






}
