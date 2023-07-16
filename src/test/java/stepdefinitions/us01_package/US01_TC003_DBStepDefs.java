package stepdefinitions.us01_package;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DataBaseUtils;

import java.sql.*;

import static org.testng.AssertJUnit.assertEquals;
import static stepdefinitions.us01_package.US01_TC001_StudentRegisterStepDefs.*;
import static utilities.DataBaseUtils.getResultSet;

public class US01_TC003_DBStepDefs {
    Faker faker = new Faker();
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("get guest user with username {string}")
    public void getGuestUserWithUsername(String fakeUsername) {
        String sqlQuery ="SELECT * FROM guest_user WHERE username = '"+fakeUsername+"'";
        resultSet=getResultSet(sqlQuery);
    }

    @Then("body contains name {string}, surname {string}, birth_place {string}, phone_number {string}, gender {string}, birth_day {string}, ssn {string}, username {string}")
    public void bodyContainsNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsername(String fakeName, String fakeSurname, String fakeBirthPlace, String fakePhone, String fakeGender, String fakeBirthDate, String fakeSSN, String fakeUserName) throws SQLException {

//        resultSet.next();
//
//            String actName = resultSet.getString("name");
//            String actSurname = resultSet.getString("surname");
//            String actBirth_place = resultSet.getString("birth_place");
//            String actPhone_number = resultSet.getString("phone_number");
////            String actGender = resultSet.getString("gender");
//            String actBirth_day = resultSet.getString("birth_day");
//            String actSsn = resultSet.getString("ssn");
//            String actUsername = resultSet.getString("username");
//
//
//            assertEquals(fakeName,actName);
//            assertEquals(fakeSurname,actSurname);
//            assertEquals(fakeBirthPlace,actBirth_place);
//            assertEquals(fakePhone,actPhone_number);
////            assertEquals(fakeGender,actGender);
//            assertEquals(fakeBirthDate,actBirth_day);
//            assertEquals(fakeSSN,actSsn);
//            assertEquals(fakeUserName,actUsername);


        if (resultSet.next()) {
            String actName = resultSet.getString("name");
            String actSurname = resultSet.getString("surname");
            String actBirth_place = resultSet.getString("birth_place");
            String actPhone_number = resultSet.getString("phone_number");
            String actBirth_day = resultSet.getString("birth_day");
            String actSsn = resultSet.getString("ssn");
            String actUsername = resultSet.getString("username");

            assertEquals(fakeName, actName);
            assertEquals(fakeSurname, actSurname);
            assertEquals(fakeBirthPlace, actBirth_place);
            assertEquals(fakePhone, actPhone_number);
            assertEquals(fakeBirthDate, actBirth_day);
            assertEquals(fakeSSN, actSsn);
            assertEquals(fakeUserName, actUsername);
        } else {
            System.out.println("fail");
        }
        }

}
//
//    public US01_TC003_DBStepDefs() throws SQLException {
//
//    }