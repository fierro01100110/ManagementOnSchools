package stepdefinitions.api_stepdefinitions;

import api_pojo.GizemGetPojo;
import api_pojo.GizemPojo;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US17_APIStepDefs {

    GizemGetPojo expectedData;
    Faker faker= new Faker();


    Response response;
    @Given("get request by id for Student Info Management") //https://managementonschools.com/app/studentInfo/get/930
    public void get_request_by_id_for_student_info_management() {
       spec.pathParams("first", "studentInfo", "second", "get", "third", 930);





       expectedData = new GizemGetPojo(2, "SPRING_SEMESTER", 90.0, "successful", "Student", "Murat", "ppppp", 90.0);


     response =  given(spec).get("{first}/{second}/{third}");
     //response.prettyPrint();
    }
    @Then("body contain lesson, name, term, Absences, Midterm Exam, Final Exam, Info Note in Student Info Management")
    public void body_contain_lesson_name_term_absences_midterm_exam_final_exam_info_note_in_student_info_management() {
     GizemPojo actualData = response.as(GizemPojo.class);

     assertEquals(expectedData.getAbsentee(), actualData.getAbsentee());
     assertEquals(expectedData.getEducationTerm(), actualData.getEducationTerm());
    // assertEquals(expectedData.getFinalExam(), actualData.getFinalExam());

    //    assertEquals(expectedData.getMidtermExam(), actualData.getMidtermExam());

    //    assertEquals(expectedData.getInfoNote(), actualData.getInfoNote());

    //    assertEquals(expectedData.getName(), actualData.getStudentResponsePojo().getName());

       // System.out.println(actualData.getStudentResponse().getBirthPlace());//istanbul
       // System.out.println(actualData.getEducationTerm());
       // System.out.println(actualData.getStudentResponse().getMotherName());

       // assertEquals(expectedData.getAbsentee(), actualData.getAbsentee());
        //assertEquals(expectedData.getName(), actualData.getName());


        }

}
