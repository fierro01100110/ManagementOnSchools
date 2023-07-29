package stepdefinitions.api_stepdefinitions;

import api_pojo.GetStudentInfoPojo;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import utilities.ObjectMapperUtils;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US21_ApiWithPojo {
    /*
    {
        "userId": 1386,
            "username": "evelinevelin",
            "name": "Evelin",
            "surname": "Carillo",
            "birthDay": "2005-02-15",
            "birthPlace": "New York",
            "phoneNumber": "975-345-2233",
            "gender": "FEMALE",
            "studentNumber": 2379,
            "motherName": "Daniela",
            "fatherName": "David",
            "email": "evelin@carillo.com",
            "active": true
    }
*/
    Response response;
    @Given("send the get request by student id")
    public void sendTheGetRequestByStudentId() {
        //https://managementonschools.com/app/students/getSavedStudentById/1386
        spec.pathParams("first", "students", "second", "getSavedStudentById", "third", 1386);

        //Set the expected data
        GetStudentInfoPojo expectedData = new GetStudentInfoPojo(1386,"evelinevelin","Evelin","Carillo","2005-02-15","New York","975-345-2233","FEMALE",2379,"Daniela","David","evelin@carillo.com",true);
        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        Response response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

        //Do assertion
        GetStudentInfoPojo actualData = ObjectMapperUtils.convertJsonToJavaObject(response.asString(), GetStudentInfoPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.getUserId(), actualData.getUserId());
        assertEquals(expectedData.getUsername(), actualData.getUsername());
        assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getSurname(), actualData.getSurname());
        assertEquals(expectedData.getBirthDay(), actualData.getBirthDay());
        assertEquals(expectedData.getBirthPlace(), actualData.getBirthPlace());
        assertEquals(expectedData.getPhoneNumber(), actualData.getPhoneNumber());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getStudentNumber(), actualData.getStudentNumber());
        assertEquals(expectedData.getMotherName(), actualData.getMotherName());
        assertEquals(expectedData.getFatherName(), actualData.getFatherName());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
    }
}
