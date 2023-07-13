package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import utilities.ContactMessagePojo;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US03_ApiStepDefs {
    Response response;
    @Given("send get request by {string}")
    public void send_get_request_by(String string) {
        //set the url
//https://managementonschools.com/app/contactMessages/searchByEmail?email=andreytest0102%40gmail.com&size=1000
        spec.pathParams("first","contactMessages","second","searchByEmail").queryParam("email","andreytest0102@gmail.com");

        //Set the expected data
        //my scenario outline datas stands for my expectating data

        //send the get request and get the response
       response=given(spec).get("{first}/{second}");
       response.prettyPrint();

    }
    @Then("body should contain name {string}, subject {string}, message {string},email {string}")
    public void body_should_contain_name_subject_message(String name, String subject, String massage, String email) {
//      ContactMessagePojo actualData= response.as(ContactMessagePojo.class);
//      assertEquals(200,response.statusCode());
//      assertEquals(name,actualData.getName());
//
        JsonPath jsonPath = response.jsonPath();
        String actName = jsonPath.getList("content.findAll{it.email}.name").get(0).toString();
        System.out.println("********");
        System.out.println("actual name is "+actName);
        System.out.println("********");
        assertEquals(name,actName);






    }
}
