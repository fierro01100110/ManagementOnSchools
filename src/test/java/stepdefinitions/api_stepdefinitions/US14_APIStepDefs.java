package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Objects;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US14_APIStepDefs {
    Response response;
    @Given("send get request by{string}")
    public void send_get_request_by_teacherfehmi(String username) {
        //Set the url
        //https://managementonschools.com/app/teachers/getTeacherByName?name=Fehmi
        setSpec();
        spec.pathParams("first","teachers","second","getTeacherByName").queryParam("name","Fehmi");

        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        //response.prettyPrint();


    }
    @Then("body should contain birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}")
    public void body_should_contain_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username ) {
        //Do assertion
        JsonPath jsonPath = response.jsonPath();
        List<String> mylist=jsonPath.getList("findAll{it.username=='"+username+"'}");
        //Actual data
        String actBirth_day= jsonPath.getList("findAll{it.username=='"+username+"'}.birth_day").get(0).toString();
        String actBirth_place= jsonPath.getList("findAll{it.username=='"+username+"'}.birth_place").get(0).toString();
        String actGender= jsonPath.getList("findAll{it.username=='"+username+"'}.gender").get(0).toString();
        String actName= jsonPath.getList("findAll{it.username=='"+username+"'}.name").get(0).toString();
        String actPhone_number= jsonPath.getList("findAll{it.username=='"+username+"'}.phone_number").get(0).toString();
        String actSsn= jsonPath.getList("findAll{it.username=='"+username+"'}.ssn").get(0).toString();
        String actSurname= jsonPath.getList("findAll{it.username=='"+username+"'}.surname").get(0).toString();
        String actUsername= jsonPath.getList("findAll{it.username=='"+username+"'}.username").get(0).toString();

        //Expected data
        System.out.println(mylist);

        assertEquals(200,response.statusCode());
        assertEquals(birth_day,actBirth_day);
        assertEquals(birth_place,actBirth_place);
        assertEquals(gender,actGender);
        assertEquals(name,actName);
        assertEquals(phone_number,actPhone_number);
        assertEquals(ssn,actSsn);
        assertEquals(surname,actSurname);
        assertEquals(username,actUsername);

        //System.out.println(jsonPath.getList("findAll{it.username=='Teacherfehmi'}").get(0));
    }
    @Given("get teacher by username {string}")
    public void get_teacher_by_username(String username) {

        List<Objects> myList= response.jsonPath().getList("findAll{it.username=='"+username+"'}");
        assertTrue(myList.isEmpty());

    }
}
