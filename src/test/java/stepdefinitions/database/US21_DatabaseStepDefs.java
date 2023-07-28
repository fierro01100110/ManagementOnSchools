package stepdefinitions.database;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static utilities.DataBaseUtils.getResultSet;


public class US21_DatabaseStepDefs {

    ResultSet resultSet;
    @Given("get student information via username {string}")
    public void getStudentInformationViaUsername(String username) {
        String sqlQuery = "SELECT * FROM student WHERE username ='" + username + "'";

        resultSet = getResultSet(sqlQuery);
    }

    @Then("body contains those birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}, email {string}")
    public void bodyContainsThoseBirth_dayBirth_placeGenderNamePhone_numberSsnSurnameUsernameEmail(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username, String email) throws SQLException {
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

        assertEquals(birth_day, actBirth_day);
        assertEquals(birth_place, actBirth_place);
        assertEquals(gender, actGender);
        assertEquals(name, actName);
        assertEquals(phone_number, actPhone_number);
        assertEquals(ssn, actSsn);
        assertEquals(surname, actSurname);
        assertEquals(username, actUsername);
        assertEquals(email, actEmail);
    }

    @Then("body should be empty student list")
    public void bodyShouldBeEmptyStudentList() throws SQLException {
        assertFalse(resultSet.next());
    }
}
