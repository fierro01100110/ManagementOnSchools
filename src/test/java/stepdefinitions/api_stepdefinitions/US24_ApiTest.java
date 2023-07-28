package stepdefinitions.api_stepdefinitions;

import base_url.Base_Url;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class US24_ApiTest extends Base_Url {

    Response response;

    @Given("send get request by userId {string}")
    public void sendGetRequestById(String string) {
        //https://managementonschools.com/app/teachers/getSavedTeacherById/31
        setSpec();
        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", 31);


        response = given(spec).get("{first}/{second}/{third}");
//        response.prettyPrint();
    }

//    {
//        "object": {
//                "userId": 31,
//                "username": "TeacherSefa",
//                "name": "sefa",
//                "surname": "sefa",
//                "birthDay": "1990-12-12",
//                "ssn": "555-12-1234",
//                "birthPlace": "turkey",
//                "phoneNumber": "555-111-9900",
//                "gender": "MALE",
//                "email": "sefasefa@sefa.com"
//                },
//                "message": "Teacher successfully found",
//                "httpStatus": "OK"
//                }

}