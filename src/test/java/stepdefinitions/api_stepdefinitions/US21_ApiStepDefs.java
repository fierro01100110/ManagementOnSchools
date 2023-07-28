package stepdefinitions.api_stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US21_ApiStepDefs {

    Response response;
    @Given("send the get request by student {string}")
    public void sendTheGetRequestByStudent(String string) {
        //https://managementonschools.com/app/students/getSavedStudentById/1386
        setSpec();
        spec.pathParams("first", "students", "second", "getSavedStudentById", "third", 1386);

        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
    }

    @Then("body should contain those birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}")
    public void bodyShouldContainThoseBirth_dayBirth_placeGenderNamePhone_numberSsnSurnameUsername(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) {
        //Do assertion



    }
    //  For negative testing
}
