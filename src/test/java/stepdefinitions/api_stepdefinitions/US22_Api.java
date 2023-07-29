package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US22_Api {

    Response response;
    @Given("user sends get request by admin {string}, getAll {string} and page {string}, size {string}, sort {string}, type {string}")
    public void user_sends_get_request_by_admin_get_all_and_page_size_sort_type(String admin, String getAll, String page, String size, String sort, String type) {
        setSpec();
        spec.pathParams("first", admin, "second", getAll).queryParams("page", page, "size", size, "sort", sort, "type", type);
        response=given(spec).get("{first}/{second}");
       response.prettyPrint();
    }




    @Then("the body should contain name {string}, surname {string}, gender {string}, phoneNumber {string}, ssn {string}, username {string}")
    public void theBodyShouldContainNameSurnameGenderPhoneNumberSsnUsername(String name, String surname, String gender, String phoneNumber, String ssn, String username) {
        JsonPath jsonPath = response.jsonPath();

        String actName = jsonPath.getList("content.findAll{it.username=='"+username+"'}.name").get(0).toString();

        String actsurName = jsonPath.getList("content.findAll{it.username=='"+username+"'}.surname").get(0).toString();

        String actGender = jsonPath.getList("content.findAll{it.username=='"+username+"'}.gender").get(0).toString();

        String actPhoneNum = jsonPath.getList("content.findAll{it.username=='"+username+"'}.phoneNumber").get(0).toString();

        String actSsn = jsonPath.getList("content.findAll{it.username=='"+username+"'}.ssn").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(name, actName);
        assertEquals(surname, actsurName);
        assertEquals(gender, actGender);
        assertEquals(phoneNumber, actPhoneNum);
        assertEquals(ssn, actSsn);





    }
}
