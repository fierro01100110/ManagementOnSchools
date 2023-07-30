package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;
import static stepdefinitions.ViceDeanStudentCreationStepDefs.*;
import static utilities.DataBaseUtils.getResultSet;

public class US15_DB {


    ResultSet resultSet;
    @Given("send get request by student username")
    public void send_get_request_by_student_username() {
        String sqlQuery = "SELECT * FROM student WHERE username = '"+fierroUserName+"'";

        resultSet = getResultSet(sqlQuery);
    }
    @Then("validate the student body creation by birth_place, name, phone_number, ssn, username, email, father_name, mother_name")
    public void validate_the_student_body_creation_by_birth_place_name_phone_number_ssn_username_email_father_name_mother_name() throws SQLException {

        resultSet.next();

       String actBirthPlace = resultSet.getString("birth_place");
       assertEquals(birthPlace,actBirthPlace);

       String actualName = resultSet.getString("name");
       assertEquals(studentName,actualName);

       String actualSSN = resultSet.getString("ssn");
       assertEquals(fakeSSN,actualSSN);

       String actualUsername = resultSet.getString("username");
       assertEquals(fierroUserName,actualUsername);

       String actualFatherName = resultSet.getString("father_name");
       assertEquals(fatherName,actualFatherName);

       String actualMotherName = resultSet.getString("mother_name");
       assertEquals(motherName,actualMotherName);




    }

}
