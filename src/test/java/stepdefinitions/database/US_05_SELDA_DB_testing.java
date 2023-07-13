package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class US_05_SELDA_DB_testing {

    @Given("send get request via {string}")
    public void send_get_request_via(String ssn) throws SQLException {
        //Create connection
        Connection connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        //Create Statement
        Statement statement = connection.createStatement();

    }
    @Then("body contains name {string}, gender {string}, phoneNumber {string}, ssn {string}, username\"everette.olson\"")
    public void body_contains_name_gender_phone_number_ssn_username_everette_olson(String string, String string2, String string3, String string4) {

    }






}
