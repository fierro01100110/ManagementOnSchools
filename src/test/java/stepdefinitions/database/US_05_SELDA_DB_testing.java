package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

import static org.junit.Assert.assertEquals;
import static utilities.DataBaseUtils.getResultSet;

public class US_05_SELDA_DB_testing {
    ResultSet resultSet;
    @Given("send get request via {string}")
    public void send_get_request_via(String ssn) {

        String sqlQuery = "SELECT * FROM dean WHERE ssn ='" + ssn + "'";
        resultSet = getResultSet(sqlQuery);
    }

    @Then("body contains name {string}, gender {string}, phone_number {string}, ssn {string}, username{string}")
    public void bodyContainsNameGenderPhoneNumberSsnUsername(String name, String gender, String phone_number, String ssn, String username) throws SQLException {

        resultSet.next();
        String actName = resultSet.getString("name");
        String actGender = resultSet.getString("gender");
        String actPhoneNumber = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actUsername = resultSet.getString("username");

        assertEquals(name,actName);
        assertEquals(gender,actGender);
        assertEquals(phone_number,actPhoneNumber);
        assertEquals(ssn,actSsn);
        assertEquals(username,actUsername);

    }
}
