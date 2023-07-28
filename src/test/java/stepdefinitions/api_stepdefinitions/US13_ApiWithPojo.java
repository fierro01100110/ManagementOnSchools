package stepdefinitions.api_stepdefinitions;

import api_pojo.GetStudentInfoPojo;
import api_pojo.GetTeacherInfoPojo;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import utilities.ObjectMapperUtils;

import static base_url.Base_Url.setSpec;
import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US13_ApiWithPojo {
    /*
    {
        "userId": 1211,
        "username": "claraclara",
        "name": "Clara",
        "surname": "David",
        "birthDay": "1995-07-10",
        "ssn": "345-44-3467",
        "birthPlace": "Montreal",
        "phoneNumber": "908-675-3412",
        "gender": "FEMALE",
        "email": "clara@david.com"
    }
     */
    Response response;

    @Given("send the get request by teacher Id")
    public void send_the_get_request_by_teacher_id() {
        //https://managementonschools.com/app/teachers/getSavedTeacherById/1211
        spec.pathParams("first", "teachers", "second", "getSavedTeacherById", "third", 1211);

        //Set the expected data
        GetTeacherInfoPojo expectedData = new GetTeacherInfoPojo(1211,"claraclara","Clara","David","1995-07-10","345-44-3467","Montreal","908-675-3412","FEMALE","clara@david.com");
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        Response response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

        //Do assertion
        GetTeacherInfoPojo actualData = ObjectMapperUtils.convertJsonToJavaObject(response.asString(), GetTeacherInfoPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getUserId(), actualData.getUserId());
        assertEquals(expectedData.getUsername(), actualData.getUsername());
        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getSurname(), actualData.getSurname());
        assertEquals(expectedData.getBirthDay(), actualData.getBirthDay());
        assertEquals(expectedData.getSsn(), actualData.getSsn());
        assertEquals(expectedData.getBirthPlace(), actualData.getBirthPlace());
        assertEquals(expectedData.getPhoneNumber(), actualData.getPhoneNumber());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getEmail(), actualData.getEmail());

    }
}
