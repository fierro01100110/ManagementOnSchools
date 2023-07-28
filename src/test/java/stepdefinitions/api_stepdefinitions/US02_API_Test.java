package stepdefinitions.api_stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US02_API_Test {

    Response response;
//    @Given("send get request by username2{string}")
//    public void send_get_request_by_username2(String string) {
//        //set the url
//        //https://managementonschools.com/app/guestUser/getAll?page=&size=10&sort=name&type=desc
//
//        spec.pathParams("first", "guestUser", "second", "getAll");
//
//        //set expected data
//
//       //send request and get the response
//        response=given(spec).get("{first}/{second}");
//      // response.prettyPrint();
//
//    }


    @Given("send get request by username for guest user")
    public void sendGetRequestByUsernameForGuestUser() {

        //set the url
        //https://managementonschools.com/app/guestUser/getAll?page=&size=10&sort=name&type=desc

        spec.pathParams("first", "guestUser", "second", "getAll");

        //set expected data

        //send request and get the response
        response=given(spec).get("{first}/{second}");
        // response.prettyPrint();
    }

    @Then("body should contain , name {string}, ssn {string}, username {string} phone_number {string}")
    public void bodyShouldContainNameSsnUsernamePhone_number(String name, String ssn, String username, String phoneNumber) {
        JsonPath jsonPath = response.jsonPath();
        String actSsn = jsonPath.getList("content.findAll{it.username=='" + username + "'}.ssn").get(0).toString();
        String actName = jsonPath.getList("content.findAll{it.username=='" + username + "'}.name").get(0).toString();
        String actUsername = jsonPath.getList("content.findAll{it.username=='" + username + "'}.username").get(0).toString();
        String actPhoneNumber = jsonPath.getList("content.findAll{it.username=='" + username + "'}.phoneNumber").get(0).toString();

        assertEquals(ssn, actSsn);
        assertEquals(name, actName);
        assertEquals(username, actUsername);
        assertEquals(phoneNumber, actPhoneNumber);

    }
}
