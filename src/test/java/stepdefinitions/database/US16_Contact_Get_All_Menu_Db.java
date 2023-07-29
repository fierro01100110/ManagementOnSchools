package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static utilities.DataBaseUtils.getResultSet;

public class US16_Contact_Get_All_Menu_Db {
    Connection connection;
    ResultSet resultSet;

    @Given("get contact message info via {string}")
    public void get_contact_message_info_via_id(String email) {
        String sqlQuery = "SELECT * FROM contact_message WHERE email ='" + email + "'";

        resultSet = getResultSet(sqlQuery);

    }
    @Then("body contains name {string}, email {string}, date {string}, subject {string}, message {string}")
    public void body_contains_name_email_date_subject_message(String name, String email, String date, String subject, String message) throws SQLException {
        resultSet.next();

        String act_name=resultSet.getString("name");
        String act_email=resultSet.getString("email");
        String act_date=resultSet.getString("date");
        String act_subject=resultSet.getString("subject");
        String act_message=resultSet.getString("message");


        assertEquals(name, act_name);
        assertEquals(email, act_email);
        assertEquals(date, act_date);
        assertEquals(subject, act_subject);
        assertEquals(message, act_message);
    }



}
