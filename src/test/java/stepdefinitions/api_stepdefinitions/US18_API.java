package stepdefinitions.api_stepdefinitions;

import api_pojo.*;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_url.Base_Url.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US18_API {
    Response response;
    UpgradeStudentInfoPojo expectedData;
    @Given("send get request by id")  ///https://managementonschools.com/app/studentInfo/getByStudentId/1302
    public void send_get_request_by_id() {
        spec.pathParams("first","studentInfo","second","getByStudentId","third",1302);

      // expectedData= new StudentPutRequestPojo(13,1,99,"you did a great job i appreciate you",1,97);
        expectedData= new UpgradeStudentInfoPojo("Cypress","SPRING_SEMESTER",11,97,88,"you did a great job i appreciate you");
        //send the out rquest get the response  ,,i need to create expected data bcs i need to send a body for put request
      //  System.out.println("heyyy this is the info message   "+expectedData);
        response= given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();

    }
    @Then("validate the body after upgade")
    public void validate_the_body_after_upgade() {
//        JsonPath jsonPath=response.jsonPath();
//        System.out.println("***");
//        System.out.println(jsonPath.getList("studentResponse.name").get(0));//student_andrey
//        System.out.println(jsonPath.getList("studentResponse.birthPlace").get(0));  //VLISSINGEN
//        System.out.println("**");
//        System.out.println(jsonPath.getList("infoNote").get(0));
//          String actInfoNote=jsonPath.getList("infoNote").get(0).toString();
//          String actMidtermExam=jsonPath.getList("midtermExam").get(0).toString();
//
//           assertEquals(expectedData.getInfoNote(),actInfoNote);


        List<ReadStudentInfoPojo> actualData=response.as(ReadStudentInfoPojo.class);
        System.out.println("****");

        System.out.println("actualData = " + actualData);
//        actualData.getStudentResponse().
//        System.out.println(actualData.getStudentResponse().getBirthPlace().toString());

//


//        US18ApiPojo actualData=response.as(US18ApiPojo.class);
//        System.out.println("****");
//        System.out.println("actualData = " + actualData);
//       // System.out.println(actualData.getMyResponseList());
//
//


//        Map<String, Object> actualData=response.as(HashMap.class);
//        System.out.println("***");
//        System.out.println(actualData.get("absentee"));
//         StudentObjectPojo actualData= response.as(StudentObjectPojo.class);
//        System.out.println("****");
//        System.out.println(actualData.absentee);
    }

}
