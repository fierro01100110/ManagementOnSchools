package stepdefinitions.us01_package;

import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pages.Register;
import utilities.US01_Pojo;


import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.us01_package.US01_TC001_StudentRegisterStepDefs.*;


public class US01_TC002_ApiStepDefs {
    Response response;

    @Given("send get request by username")
    public void send_get_request_by_username() {

//        Set the url
        spec.pathParams("first", "guestUser", "second","getAll" ).queryParams("size","1000");

//        Set the expected data

//        Send the request and get the response

            System.out.println((fakeName));
            System.out.println((fakeSurname));
            System.out.println((fakeBirthPlace));
            System.out.println((fakePhone));
            System.out.println((fakeGender) );
            System.out.println((fakeBirthDate));
            System.out.println((fakeSSN));
            System.out.println((fakeUserName));
            System.out.println((fakePassword));


        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }

    @Then("body should contain name, surname, birth_place, phone_number, gender, birth_day, ssn, username, password")
    public void bodyShouldContainNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsernamePassword() {
//        //        Do assertion
        JsonPath jsonPath = response.jsonPath();
//
//        US01_Pojo actualDataGson=new Gson().fromJson(response.asString(),US01_Pojo.class);
//         assertEquals(fakeName,actualDataGson.getContent().get(0).getName());
//         assertEquals(fakeSurname,actualDataGson.getContent().get(0).getSurname());


        US01_Pojo actContactMessagePojo=response.as(US01_Pojo.class);
        System.out.println(actContactMessagePojo);//a huge list
        System.out.println(actContactMessagePojo.getContent().get(0).getName());
        assertEquals(fakeName,actContactMessagePojo.getContent().get(0).getName());












//
//        System.out.println(jsonPath.getList("ACTUAL NAME IS THIS"+"content.findAll{it.username=='"+fakeUserName+"'}.name").get(0).toString());
//        String actName = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.name").get(0).toString();
//        String actSurname = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.surname").get(0).toString();
//        String actBirth_name = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.birth_place").get(0).toString();
//        String actPhone_number= jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.phone_number").get(0).toString();
//        String actGender = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.gender").get(0).toString();
//        String actBirth_place = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.birth_day").get(0).toString();
//        String actSSN = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.ssn").get(0).toString();
//        String actUsername = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.username").get(0).toString();
////        String actPassword = jsonPath.getList("content.findAll{it.username=='"+fakeUserName+"'}.password").get(0).toString();
//
//
//        assertEquals(fakeName,actName);
//        assertEquals(fakeSurname,actSurname);

    }
}
