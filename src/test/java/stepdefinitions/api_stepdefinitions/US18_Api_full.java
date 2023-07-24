package stepdefinitions.api_stepdefinitions;

import api_pojo.StudentPutRequestPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;

public class US18_Api_full {
    /*
    sen get request with   https://managementonschools.com/app/studentInfo/get/933
     get the below response
    {
    "id": 933,
    "midtermExam": 97.0,
    "finalExam": 99.0,
    "absentee": 11,
    "infoNote": "you did a great job i appreciate you",
    "lessonName": "Cypress",
    "creditScore": 10,
    "educationTerm": "SPRING_SEMESTER",
    "average": 98.2,
    "studentResponse": {
        "userId": 1302,
        "username": "student_andrey",
        "name": "student_andrey",
        "surname": "kemal",
        "birthDay": "2001-03-02",
        "birthPlace": "VLISSINGEN",
        "phoneNumber": "345-655-3456",
        "gender": "MALE",
        "studentNumber": 2295,
        "motherName": "emke",
        "fatherName": "peter",
        "email": "asb@gmail.com",
        "active": true
    },
    "compulsory": true,
    "note": "AA"
}
     */
    Response response;
    StudentPutRequestPojo expectedData;
    @Given("send the get request by studentId")//https://managementonschools.com/app/studentInfo/get/933
    public void sendTheGetRequestByStudentId() {

        spec.pathParams("first","studentInfo","second","get","third",933);

        response= given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("validate the body")
    public void validate_the_body() {

    }



}
