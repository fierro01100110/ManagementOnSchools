package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.US17_UI_Test_StepDefs.fakeAbsencees;
import static stepdefinitions.US17_UI_Test_StepDefs.stdName;


public class US17_APIStepDefs_Json {

    Response response;


    @Given("get request by id for Student Info Management_json")
    public void get_request_by_username_for_student_info_management_json() {
////set the url
//        //https://managementonschools.com/app/studentInfo/get/930
//
//        spec.pathParams("first","studentInfo", "second", "get", "third", 930);
////set the expected data


        //https://managementonschools.com/app/studentInfo/getAllForTeacher?page=100&size=1000

        spec.pathParams("first","studentInfo", "second", "getAllForTeacher").queryParams("page", 100, "size", 1000);



//send the request and get the response
        response= given(spec).get("{first}/{second}");
       response.prettyPrint();


    }







    @Then("body contain lesson {string}, name {string},  term {string},  Absences {string}, Midterm Exam {string}, Final Exam {string}, Info Note {string}, id {string} in Student Info Management_json")
    public void bodyContainLessonNameTermAbsencesMidtermExamFinalExamInfoNoteIdInStudentInfoManagement_json(String lessonName, String name, String term, String Absences, String MidTerm_Exam, String Final_Exam, String Info_Note, String id) {
       JsonPath jsonPath = response.jsonPath();


        String actLes = jsonPath.getString("lessonName");
        System.out.println("actLes = " + actLes);

//        String actStdName = jsonPath.getString("name");
//        System.out.println("actStdName = " + actStdName);

        String actName = jsonPath.getString("studentResponse.name");
        System.out.println("actName = " + actName);

        String actSurname = jsonPath.getString("surname");
        System.out.println("actSurname = " + actSurname);

        String actTerm = jsonPath.getString("educationTerm");
        System.out.println("actTerm = " + actTerm);

        String actAbsencees = jsonPath.getString("absentee");
        System.out.println("actAbsencees = " + actAbsencees);

        String actMidtermExam = jsonPath.getString("midtermExam");
        System.out.println("actMidtermExam = " + actMidtermExam);

        String actFinalExam = jsonPath.getString("finalExam");
        System.out.println("actFinalExam = " + actFinalExam);

        String infoNote = jsonPath.getString("infoNote");
        System.out.println("infoNote = " + infoNote);





        assertEquals(stdName, actName );

        assertEquals(fakeAbsencees,actAbsencees);
    }
}
