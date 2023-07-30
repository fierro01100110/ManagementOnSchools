package stepdefinitions.database;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static utilities.DataBaseUtils.getResultSet;

public class US25_admin_added_student_db_StepDefs {
    Connection connection;
    ResultSet resultSet;

    @Given("send get request student Hakan db by {string}")
    public void sendGetRequestStudentHakanDbBy(String username) {




        // Write code here that turns the phrase above into concrete actions
        String sqlQuery = "SELECT * FROM dean WHERE username ='" + username + "'";



        resultSet = getResultSet(sqlQuery);

    }
    @Then("body should contain userId {string}, username {string}, name {string}, surname {string}, birthDay {string}, birthPlace {string}, phoneNumber {string}, gender {string}, motherName {string}, fatherName {string}, email {string}")
    public void bodyShouldContainUserIdUsernameNameSurnameBirthDayBirthPlacePhoneNumberGenderMotherNameFatherNameEmail(String userId, String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String motherName, String fatherName, String email) throws SQLException {



        resultSet.next();

        //String actBirth_day = resultSet.getString("birthDay");
        String actBirth_place = resultSet.getString("birthPlace");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phoneNumber");
        String actSurname = resultSet.getString("surname");
        String actMotherName = resultSet.getString("motherName");
        String actFatherName = resultSet.getString("fatherName");
        String actEmail = resultSet.getString("email");
        String actUsername = resultSet.getString("username");

        //assertEquals(birthDay, actBirth_day);
        assertEquals(birthPlace, actBirth_place);
        assertEquals(gender, actGender);
        assertEquals(name, actName);
        assertEquals(phoneNumber, actPhone_number);
        assertEquals(surname, actSurname);
        assertEquals(motherName, actMotherName);
        assertEquals(fatherName, actFatherName);
        assertEquals(email, actEmail);
        assertEquals(username, actUsername);

    }



}
