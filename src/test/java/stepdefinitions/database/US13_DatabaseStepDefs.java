package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static utilities.DataBaseUtils.getResultSet;

public class US13_DatabaseStepDefs {

    ResultSet resultSet;

    @Given("get teacher information via username {string}")
    public void get_teacher_information_via_username(String username) {

        String sqlQuery = "SELECT * FROM teacher WHERE username ='" + username + "'";

        resultSet = getResultSet(sqlQuery);

    }
    @Then("body contains that birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}, email {string}, is_advisor {string}")
    public void body_contains_that_birth_day_birth_place_gender_name_phone_number_ssn_surname_username_email_is_advisor(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username, String email, String is_advisor) throws SQLException {
        resultSet.next();

        String actBirth_day = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");
        String actEmail = resultSet.getString("email");
        String actIsAdvisor = resultSet.getString("is_advisor");

        assertEquals(birth_day, actBirth_day);
        assertEquals(birth_place, actBirth_place);
        assertEquals(gender, actGender);
        assertEquals(name, actName);
        assertEquals(phone_number, actPhone_number);
        assertEquals(ssn, actSsn);
        assertEquals(surname, actSurname);
        assertEquals(username, actUsername);
        assertEquals(email, actEmail);
        assertEquals(is_advisor, actIsAdvisor);


    }

    @Then("body should be empty list")
    public void bodyShouldBeEmptyList() throws SQLException {
        assertFalse(resultSet.next());
    }
}

