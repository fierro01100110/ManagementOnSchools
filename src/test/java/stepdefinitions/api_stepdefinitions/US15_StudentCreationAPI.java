package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;
import static stepdefinitions.ViceDeanStudentCreationStepDefs.*;


public class US15_StudentCreationAPI {

    Response response;
    @Given("send get request by student id")
    public void send_get_request_by_student_id() {
        setSpec();
        spec.pathParams("first","students","second","getStudentByName").queryParam("name",studentName);

        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }


    @Then("validate the body student creation after upgrade")
    public void validate_the_body_student_creation_after_upgrade() {

        JsonPath jsonPath = response.jsonPath();

        String actualSurName = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.surname").get(0).toString();
        System.out.println("actualName = " + actualSurName);
        assertEquals(lastName,actualSurName);


        String actualPhoneNumber = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.phoneNumber").get(0).toString();
        assertEquals(phoneNumber,actualPhoneNumber);

        String actualEmail = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.email").get(0).toString();
        assertEquals(email,actualEmail);

        String actualName = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.name").get(0).toString();
        assertEquals(studentName,actualName);

        String actualBirthPlace = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.birthPlace").get(0).toString();
        assertEquals(birthPlace,actualBirthPlace);

        String actualMotherName = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.motherName").get(0).toString();
        assertEquals(motherName,actualMotherName);

        String actualFatherName = jsonPath.getList("findAll{it.username=='"+ fierroUserName +"'}.fatherName").get(0).toString();
        assertEquals(fatherName,actualFatherName);


    }




}
