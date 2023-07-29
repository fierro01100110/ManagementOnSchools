package stepdefinitions.api_stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US16_Contact_Get_All_Menu_Api {
    Response response;
    @Given("sends get request by {string}")
    public void sends_get_request_by(String email) {
         //Set the url

        //https://managementonschools.com/app/contactMessages/getAll?page=0&size=1000&sort=date&type=desc

        spec.pathParams("first", "contactMessages", "second", "getAll").queryParam("size", "1000");

        //Set the expected data

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        //response.prettyPrint();

    }

    @Then("body should contain name {string}, email {string}, date {string}, subject {string}, message {string}")
    public void body_should_contain_name_email_date_subject_message(String name, String email, String date, String subject, String message)
    {

        JsonPath jsonPath = response.jsonPath();


        String actEmail = jsonPath.getList("content.findAll{it.email=='" + email + "'}.email").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.email=='" + email + "'}.name").get(0).toString();
        String actDate = jsonPath.getList("content.findAll{it.email=='" + email + "'}.date").get(0).toString();
        String actSubject = jsonPath.getList("content.findAll{it.email=='" + email + "'}.subject").get(0).toString();
        String actMessage = jsonPath.getList("content.findAll{it.email=='" + email + "'}.message").get(0).toString();


        assertEquals(200,response.statusCode());
        assertEquals(name,actName);
        assertEquals(email,actEmail);
        assertEquals(date,actDate);
        assertEquals(subject,actSubject);
        assertEquals(actMessage,actMessage);
    }
}
