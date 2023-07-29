package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static utilities.DataBaseUtils.getResultSet;

public class US22_DBTesting {

    ResultSet resultSet;
    @Given("get admin by username {string}")
    public void get_admin_by_username(String username) {

        String sqlQuery = "SELECT * FROM admins WHERE username ='" + username + "'";
        resultSet = getResultSet(sqlQuery);


    }

  

    @Then("the body will contain name {string}, surname {string}, gender {string}, phoneNumber {string}, ssn {string}")
    public void theBodyWillContainNameSurnameGenderPhoneNumberSsn(String name, String surname, String gender, String phoneNumber, String ssn) throws SQLException {
        
        resultSet.next();
        String actName= resultSet.getString("name");
        String actSurname= resultSet.getString("surname");
        String actGender= resultSet.getString("gender");
        String actPhoneNum= resultSet.getString("phone_number");
        String actSSN= resultSet.getString("ssn");

        assertEquals(name, actName);
        assertEquals(surname, actSurname);
        assertEquals(gender, actGender);
        assertEquals(phoneNumber, actPhoneNum);
        assertEquals(ssn, actSSN);

    }
}
