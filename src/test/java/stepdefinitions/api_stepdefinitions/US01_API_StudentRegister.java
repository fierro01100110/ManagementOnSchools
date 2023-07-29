package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.Collections;
import java.util.List;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.US01_UI_StudentRegister.*;

public class US01_API_StudentRegister { Response response;

    @Given("send get request by username")
    public void send_get_request_by_username() {

//        Set the url
        spec.pathParams("first", "guestUser", "second","getAll").queryParams("size",2000);

//        Set the expected data

//        Send the request and get the response

        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

    @Then("body should contain name, surname, birth_place, phone_number, gender, birth_day, ssn, username, password")
    public void bodyShouldContainNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword() {
        //        Do assertion

        JsonPath jsonPath = response.jsonPath();

        List<Integer> ids = jsonPath.getList("content.id");
        Collections.sort(ids);
        System.out.println("contentids" + ids);

        String actName = jsonPath.getList("content.findAll{it.id=="+ids.get(ids.size()-1)+"}.name").get(0).toString();
        String actSurname = jsonPath.getList("content.findAll{it.id=="+ids.get(ids.size()-1)+"}.surname").get(0).toString();
        String actSsn = jsonPath.getList("content.findAll{it.id=="+ids.get(ids.size()-1)+"}.ssn").get(0).toString();
        String actBirthPlace = jsonPath.getList("content.findAll{it.id=="+ids.get(ids.size()-1)+"}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("content.findAll{it.id=="+ids.get(ids.size()-1)+"}.phoneNumber").get(0).toString();
        String actUsername = jsonPath.getList("content.findAll{it.id=="+ids.get(ids.size()-1)+"}.username").get(0).toString();
        System.out.println("actName = " + actName);



        assertEquals(fakeName,actName);
        assertEquals(fakeSurname,actSurname);
        assertEquals(fakeSSN,actSsn);
        assertEquals(fakeBirthPlace,actBirthPlace);
        assertEquals(fakePhone,actPhoneNumber);
        assertEquals(fakeUserName,actUsername);

        System.out.println("fakeName = " + fakeName);
        System.out.println("fakeSurname = " + fakeSurname);
        System.out.println("fakeSSN = " + fakeSSN);
        System.out.println("fakeBirthPlace = " + fakeBirthPlace);
        System.out.println("fakePhone = " + fakePhone);
        System.out.println("fakeUserName = " + fakeUserName);

    }
}
