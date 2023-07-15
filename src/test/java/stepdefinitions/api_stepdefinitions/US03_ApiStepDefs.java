package stepdefinitions.api_stepdefinitions;

import com.google.gson.Gson;
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
    public void send_get_request_by(String email) {
        //set the url
//https://managementonschools.com/app/contactMessages/searchByEmail?email=andreytest0102%40gmail.com&size=1000
        spec.pathParams("first","contactMessages","second","searchByEmail").queryParam("email",email);

        //Set the expected data
        //my scenario outline datas stands for my expectating data

        //send the get request and get the response
       response=given(spec).get("{first}/{second}");
       response.prettyPrint();

    }
    @Then("body should contain name {string}, subject {string}, message {string},email {string}")
    public void body_should_contain_name_subject_message(String name, String subject, String massage, String email) {

//        JsonPath jsonPath = response.jsonPath();
//        String actName = jsonPath.getList("content.findAll{it.email}.name").get(0).toString();
//        String actSubject = jsonPath.getList("content.findAll{it.email}.subject").get(0).toString();
//        String actMessage = jsonPath.getList("content.findAll{it.email}.message").get(0).toString();
//
//        System.out.println("********");
//        System.out.println("actual name is "+actName);
//        System.out.println("********");
//        assertEquals(200,response.statusCode());
//        assertEquals(name,actName);
//        assertEquals(subject,actSubject);
//        assertEquals(actMessage,actMessage);

        //2nd way  by POJO CLASS
//        ContactMessagePojo actContactMessagePojo=response.as(ContactMessagePojo.class);
//        System.out.println(actContactMessagePojo);//a huge list
//        System.out.println(actContactMessagePojo.getContent().get(0).getName());  //Andrey
//        assertEquals(name,actContactMessagePojo.getContent().get(0).getName());


        //3rd way by Gson
        ContactMessagePojo actualDataGson=new Gson().fromJson(response.asString(),ContactMessagePojo.class);
        assertEquals(200,response.statusCode());
        assertEquals(name,actualDataGson.getContent().get(0).getName());
        System.out.println(actualDataGson.getContent().get(0).getName());   //Andrey
        System.out.println("");

    }
}
