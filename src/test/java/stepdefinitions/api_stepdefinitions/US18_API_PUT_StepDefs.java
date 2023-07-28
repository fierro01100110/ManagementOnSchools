package stepdefinitions.api_stepdefinitions;

import api_pojo.StudentInfoUpgradePojo;
import api_pojo.StudentObjectPojo;
import api_pojo.StudentPutRequestPojo;
import api_pojo.UpgradeStudentInfoPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utilities.ObjectMapperUtils;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US18_API_PUT_StepDefs {
    /*
  given
    {
  "absentee": 16,
  "educationTermId":1,
  "finalExam": 90,
  "infoNote": "i appriciate your hard work, you re doing great",
  "lessonId": 1,
  "midtermExam": 80
}

then
{
    "object": {
        "id": 933,
        "midtermExam": 80.0,
        "finalExam": 90.0,
        "absentee": 16,
        "infoNote": "i appriciate your hard work, you re doing great",
        "lessonName": "Cypress",
        "creditScore": 10,
        "educationTerm": "SPRING_SEMESTER",
        "average": 86.0,
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
    },
    "message": "Student Info updated Successfully",
    "httpStatus": "CREATED"
}

     */
    Response response;
    StudentPutRequestPojo expectedData;
    @Given("send put request by id")
    public void send_put_request_by_id() {
//https://managementonschools.com/app/studentInfo/update/933
        spec.pathParams("first","studentInfo","second","update","third",933);
       expectedData= new StudentPutRequestPojo(1,1,90,"i appriciate your hard work, you re doing great",1,80);

        System.out.println("hellooo  "+expectedData);
        //send the out rquest get the response  ,,i need to create expected data bcs i need to send a body for put request
        //  System.out.println("heyyy this is the info message   "+expectedData);
        response= given(spec).body(expectedData).log().all().put("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("validate the body after upgade by put request")
    public void validate_the_body_after_upgade_by_put_request() {
        StudentInfoUpgradePojo actualData=ObjectMapperUtils.convertJsonToObject(response.asString(), StudentInfoUpgradePojo.class);
        System.out.println("^^^^");
        System.out.println(actualData.objectPojo.studentResponse.getBirthPlace());
        assertEquals(expectedData.getAbsentee().toString(),actualData.objectPojo.absentee);






//  StudentObjectPojo actualData= response.as(StudentObjectPojo.class);
//        System.out.println("^^^^^");
//        System.out.println(actualData.infoNote);
    }
}
