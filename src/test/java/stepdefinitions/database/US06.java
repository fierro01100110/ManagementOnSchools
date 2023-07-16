package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.DataBaseUtils.getResultSet;

public class US06 {
    ResultSet resultSet;

    @Given("get vice dean via username {string}")
    public void get_vice_dean_via_username(String username) {


      //Create ResultSet
        String sqlQuery = "SELECT * FROM vice_dean WHERE username = '"+username+"'";
       resultSet = getResultSet(sqlQuery);



    }
    @Then("body contains birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}")
    public void body_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) throws SQLException {
        resultSet.next();

        String actBirthDay = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");

        assertEquals(birth_day,actBirthDay);
        assertEquals(birth_place,actBirth_place);
        assertEquals(gender,actGender);
        assertEquals(name,actName);
        assertEquals(phone_number,actPhone_number);
        assertEquals(ssn,actSsn);
        assertEquals(surname,actSurname);
        assertEquals(username,actUsername);




    }

    @Then("body must be empty")
    public void bodyMustBeEmpty() throws SQLException {

       assertFalse(resultSet.next());
    }

    @Given("get vica dean via birth_place {string}")
    public void getVicaDeanViaBirth_place(String birth_place) {
        String sql = "SELECT * FROM vice_dean WHERE birth_place = 'New York'";
       resultSet = getResultSet(sql);
    }

    @Then("There must be at least {int} users")
    public void thereMustBeAtLeastUsers(int number) throws SQLException {
        int numOfUsers = 0;

        while (resultSet.next()){
            System.out.println(resultSet.getString("ssn"));
            numOfUsers++;

        }
        System.out.println("numOfUsers = " + numOfUsers);
        assertTrue(numOfUsers> number);
    }
}
