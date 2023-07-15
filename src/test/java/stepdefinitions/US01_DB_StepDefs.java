package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;

public class US01_DB_StepDefs {
    Faker faker = new Faker();
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("get guest user with username {string}")
    public void get_guest_user_with_username(String username) throws SQLException {

//        Create connection
         connection =  DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

//        Create Statement

         statement = connection.createStatement();

//        Create ResultSet
        String sqlQuery ="SELECT * FROM guest_user WHERE username = '"+username+"'";
         resultSet = statement.executeQuery(sqlQuery);



    }


    @Then("body contains name, {string}, surname, {string}, birth_place, {string}, phone_number, {string}, gender, {string}, birth_day, {string}, ssn, {string}, username,{string}")
    public void body_contains_name_surname_birth_place_phone_number_gender_birth_day_ssn_username(String name, String surname, String birth_place, String phone_number, String gender, String birth_day, String ssn, String username) throws SQLException {

        resultSet.next();

        String actName = resultSet.getString("name");
        String actSurname = resultSet.getString("surname");
        String actBirth_place = resultSet.getString("birth_place");
        String actPhone_number = resultSet.getString("phone_number");
        String actGender = resultSet.getString("gender");
        String actBirth_day = resultSet.getString("birth_day");
        String actSsn = resultSet.getString("ssn");
        String actUsername = resultSet.getString("username");


        assertEquals(name,actName);
        assertEquals(surname,actSurname);
        assertEquals(birth_place,actBirth_place);
        assertEquals(phone_number,actPhone_number);
        assertEquals(gender,actGender);
        assertEquals(birth_day,actBirth_day);
        assertEquals(ssn,actSsn);
        assertEquals(username,actUsername);



    }


}
