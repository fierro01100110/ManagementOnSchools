package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static utilities.DataBaseUtils.getResultSet;

public class US04_admin_added_dean_db_StepDefs {
    Connection connection;
    ResultSet resultSet;

    @Given("Get dean information by username {string}")
    public void get_dean_information_by_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        String sqlQuery = "SELECT * FROM dean WHERE username ='" + username + "'";
        //SELECT * FROM "public".dean WHERE username ='hakanmollaoglu4'


        resultSet = getResultSet(sqlQuery);

    }
    @Then("body contains username {string}, birth_day {string}, birth_place {string},gender {string}, name {string},phone_number {string}, ssn {string},surname {string}")
    public void bodyContainsUsernameBirth_dayBirth_placeGenderNamePhone_numberSsnSurname(String username, String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) throws SQLException {
        // Write code here that turns the phrase above into concrete actions
        resultSet.next();

        String actBirth_day = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");

        assertEquals(birth_day, actBirth_day);
        assertEquals(birth_place, actBirth_place);
        assertEquals(gender, actGender);
        assertEquals(name, actName);
        assertEquals(phone_number, actPhone_number);
        assertEquals(ssn, actSsn);
        assertEquals(surname, actSurname);
        assertEquals(username, actUsername);

    }


}


