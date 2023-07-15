package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static stepdefinitions.US01_TC001_StudentRegisterStepDefs.*;

public class US01_ApiStepDefs {
    Response response;

    @Given("send get request by username")
    public void send_get_request_by_username() {

//        Set the url
        spec.pathParams("first", "guestUser", "second","getAll" ).queryParams("size","1000");

//        Set the expected data

//        Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

        System.out.println("name = "+ name());
        System.out.println("surname = " + surname());
        System.out.println("birthPlace = " + birthPlace());
        System.out.println("phoneNumber = " + phoneNumber());
        System.out.println("gender = " + gender());
        System.out.println("birthDate = " + birthDate());
        System.out.println("ssn = " + ssn());
        System.out.println("username = " + username());
        System.out.println("password = " + password());


    }


    @Then("body should contain name, surname, birth_place, phone_number, gender, birth_day, ssn, username, password")
    public void bodyShouldContainNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword() {
//        //        Do assertion
        JsonPath jsonPath = response.jsonPath();

        System.out.println(jsonPath.getList("content.findAll{it.username=='shavonda.ferry'}"));

    }
}
