package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static base_url.MOSBaseUrl.spec;
import static io.restassured.RestAssured.given;

public class US03_User_contact_message_API_test {


    @Given("send the request")
    public void send_the_request() {
        Response response;

        //set the url
        //https://managementonschools.com/app/contactMessages/searchByEmail?email=andreytest0102%40gmail.com&page=0&size=10&sort=date&type=desc
        spec.pathParams("first","app","second","contactMessages","third","searchByEmail?email=andreytest0102%40gmail.com&page=0&size=10&sort=date&type=desc");
        response=given().get("{first}/{second}/{third}");
        response.prettyPrint();

    }
    @Then("validate the body")
    public void validate_the_body() {

    }

}