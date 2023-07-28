package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;

public class US25_AdminAddedStudentApiStepDefs {

    Response response;

    @Given("send get request student by {string}")
    public void send_get_request_student_by(String username) {
        // Write code here that turns the phrase above into concrete actions
        //Set the URL
        setSpec();
        spec.pathParams("first", "students", "second", "getStudentByName").queryParam("name","Hasan");
        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();


    }

    @Then("body should contain userId {string}, username {string}, name {string}, surname {string}, birthDay {string}, birthPlace {string}, phoneNumber {string}, gender {string}, motherName {string}, fatherName {string}, email {string}")
    public void bodyShouldContainUserIdUsernameNameSurnameBirthDayBirthPlacePhoneNumberGenderMotherNameFatherNameEmail(String userId, String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String motherName, String fatherName, String email) {

        //@Then("body should contain username {string}, name {string }, surname {string}, birthDay {string}, birthPlace {string}, phoneNumber {string}, gender {gender}, motherName {string}, fatherName {string}, email {string}")
        //@Then("body should contain username {string}, name {string}, surname {string}, birth_place {string}, email {string}, phone_number {string}, gender {string}, birth_day {string}, ssn {string}, father_name {string}, mother_name {string}, password {string}")
        //@Then("body should contain username {string}, birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string},ssn {string}, surname {string}")
        //public void bodyShouldContainUsernameNameSurnameBirthDayBirthPlacePhoneNumberGenderMotherNameFatherNameEmail(String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String fatherName, String motherName, String email) {
        // Write code here that turns the phrase above into concrete actions
        JsonPath jsonPath = response.jsonPath();


        String actUserId = jsonPath.getList("content.findAll{it.username='" + username + "'}.userId").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.username='" + username + "'}.name").get(0).toString();
        String actSurname = jsonPath.getList("content.findAll{it.username='" + username + "'}.surname").get(0).toString();
        String actBirthday = jsonPath.getList("content.findAll{it.username='" + username + "'}.birthDay").get(0).toString();
        String actBirthplace = jsonPath.getList("content.findAll{it.username='" + username + "'}.birthPlace").get(0).toString();
        String actPhoneNumber = jsonPath.getList("content.findAll{it.username='" + username + "'}.phoneNumber").get(0).toString();
        String actGender = jsonPath.getList("content.findAll{it.username='" + username + "'}.gender").get(0).toString();
        String actMotherName = jsonPath.getList("content.findAll{it.username='" + username + "'}.motherName").get(0).toString();
        String actFatherName = jsonPath.getList("content.findAll{it.username='" + username + "'}.fatherName").get(0).toString();
        String actUsername = jsonPath.getList("content.findAll{it.username='" + username + "'}.username").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(userId,actUserId);
        assertEquals(name, actName);
        assertEquals(surname, actSurname);
        assertEquals(birthDay, actBirthday);
        assertEquals(birthPlace, actBirthplace);
        assertEquals(phoneNumber, actPhoneNumber);
        assertEquals(gender, actGender);
        assertEquals(motherName, actMotherName);
        assertEquals(fatherName, actFatherName);
        assertEquals(username, actUsername);

        throw new io.cucumber.java.PendingException();
    }
}



