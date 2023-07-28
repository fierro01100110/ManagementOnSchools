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

    @Given("Get student information by username {string}")
    public void get_student_information_by_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        String sqlQuery = "SELECT * FROM dean WHERE username ='" + username + "'";



        resultSet = getResultSet(sqlQuery);

    }
    @Then("body should contain userId {string}, username {string}, name {string}, surname {string}, birthDay {string}, birthPlace {string}, phoneNumber {string}, gender {string}, motherName {string}, fatherName {string}, email {string}")
    public void bodyShouldContainUserIdUsernameNameSurnameBirthDayBirthPlacePhoneNumberGenderMotherNameFatherNameEmail(String userId, String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String motherName, String fatherName, String email) throws SQLException {


        //@Then("body contains username {string}, birth_day {string}, birth_place {string},gender {string}, name {string},phone_number {string}, ssn {string},surname {string}")
    //public void bodyContainsUsernameBirth_dayBirth_placeGenderNamePhone_numberSsnSurname(String username, String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) throws SQLException {
        // Write code here that turns the phrase above into concrete actions
        resultSet.next();

        String actBirth_day = resultSet.getString("birthDay");
        String actBirth_place = resultSet.getString("birthPlace");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phoneNumber");
        String actSurname = resultSet.getString("surname");
        String actMotherName = resultSet.getString("motherName");
        String actFatherName = resultSet.getString("fatherName");
        String actEmail = resultSet.getString("email");
        String actUsername = resultSet.getString("username");

        assertEquals(birthDay, actBirth_day);
        assertEquals(birthPlace, actBirth_place);
        assertEquals(gender, actGender);
        assertEquals(name, actName);
        assertEquals(phoneNumber, actPhone_number);
        assertEquals(surname, actSurname);
        assertEquals(username, actUsername);

    }


}
