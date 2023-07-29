package stepdefinitions.api_stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class US14_APIStepDefs {
    Response response;
    @Given("send get request by{string}")
    public void send_get_request_by_teacherfehmi(String username) {
        //Set the url
        //https://managementonschools.com/app/teachers/getTeacherByName?name=Fehmi
        //https://managementonschools.com/app/vicedean/getAll
        //https://managementonschools.com/app/teachers/getAll
        setSpec();
        spec.pathParams("first","teachers","second","getAll");

        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();

    }
    @Then("body should contain  birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}")
    public void body_should_contain_birth_place_gender_name_phone_number_ssn_surname_username(String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) {

        JsonPath jsonPath = response.jsonPath();

        //Actual data
        //String actBirthday= jsonPath.getList("findAll{it.username=='"+username+"'}.birth_day").get(0).toString();
        String actBirthplace= jsonPath.getList("findAll{it.username=='"+username+"'}.birth_place").get(0).toString();
        String actGender= jsonPath.getList("findAll{it.username=='"+username+"'}.gender").get(0).toString();
        String actName= jsonPath.getList("findAll{it.username=='"+username+"'}.name").get(0).toString();
        String actPhonenumber= jsonPath.getList("findAll{it.username=='"+username+"'}.phone_number").get(0).toString();
        String actSsn= jsonPath.getList("findAll{it.username=='"+username+"'}.ssn").get(0).toString();
        String actSurname= jsonPath.getList("findAll{it.username=='"+username+"'}.surname").get(0).toString();
        String actUsername= jsonPath.getList("findAll{it.username=='"+username+"'}.username").get(0).toString();

        //Expected data
        assertEquals(200,response.statusCode());
        assertEquals(birth_place,actBirthplace);
        assertEquals(gender,actGender);
        assertEquals(name,actName);
        assertEquals(phone_number,actPhonenumber);
        assertEquals(ssn,actSsn);
        assertEquals(surname,actSurname);
        assertEquals(username,actUsername);


        System.out.println(jsonPath.getList("findAll{it.username=='Teacherfehmi'}").get(0));

        //System.out.println(jsonPath.getList("findAll{it.username=='Teacherfehmi'}").get(0));


    }
}
