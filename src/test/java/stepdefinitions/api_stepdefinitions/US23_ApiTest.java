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
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class US23_ApiTest {

    Response response;

    @Given("us23 should send get request by orhan {string}")
    public void us23_should_send_get_request_by_orhan(String username) {

        //Set the url
        //https://managementonschools.com/app/vicedean/getAll
        setSpec();
        spec.pathParams("first","vicedean", "second","getAll" );
        response =  given(spec).get("{first}/{second}");

    }
    @Then("us23 body should contain name {string}, surname {string},birth_place {string},gender {string},birth_day {string},phone_number {string},ssn {string},username {string}")
    public void us23_body_should_contain_name_surname_birth_place_gender_birth_day_phone_number_ssn_username(String name, String surname, String birth_place, String gender, String birth_day, String phone_number, String ssn, String username) {

        JsonPath jsonPath = response.jsonPath();

        String actName= jsonPath.getList("findAll{it.username=='"+username+"'}.name").get(0).toString();
        String actSurname= jsonPath.getList("findAll{it.username=='"+username+"'}.surname").get(0).toString();
        String actBirthPlace= jsonPath.getList("findAll{it.username=='"+username+"'}.birthPlace").get(0).toString();
        String actGender= jsonPath.getList("findAll{it.username=='"+username+"'}.gender").get(0).toString();
        String actBirthDay= jsonPath.getList("findAll{it.username=='"+username+"'}.birthDay").get(0).toString();
        String actPhoneNumber= jsonPath.getList("findAll{it.username=='"+username+"'}.phoneNumber").get(0).toString();
        String actSsn= jsonPath.getList("findAll{it.username=='"+username+"'}.ssn").get(0).toString();
        String actUsername= jsonPath.getList("findAll{it.username=='"+username+"'}.username").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(name, actName);
        assertEquals(surname,actSurname);
        assertEquals(birth_place,actBirthPlace);
        assertEquals(gender,actGender);
        assertEquals(birth_day,actBirthDay);
        assertEquals(phone_number,actPhoneNumber);
        assertEquals(ssn,actSsn);
        assertEquals(username,actUsername);
    }

    @Then("US twenty three body must be empty with non existing username {string}")
    public void USTwentyThreeBodyMustBeEmptyWithNonExistingUsername(String username) {

        List<Objects> dataList= response.jsonPath().getList("findAll{it.username=='"+username+"'}");
        assertTrue(dataList.isEmpty());

    }
}
