package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;
import static utilities.DataBaseUtils.getResultSet;

public class US24_DB_testing {
    ResultSet resultSet;

    @Given("send get request via id {string}")
    public void sendGetRequestViaId(String id) {
        String sqlQuery = "SELECT * FROM teacher WHERE id ='" + id + "'";
        resultSet = getResultSet(sqlQuery);
    }

    @Then("body must contain id {string}, name {string}, surname {string}, birth_place {string}, email {string}, phone_number {string}, gender {string}, birth_day {string}, ssn {string}, username {string}, message{string}")
    public void bodyMustContainIdNameSurnameBirthPlaceEmailPhoneNumberGenderBirthDaySsnUsernameMessage(String id, String name, String surname, String birth_place, String email, String phone_number, String gender, String birth_day, String ssn, String username, String message) throws SQLException {

        resultSet.next();
        String actId = resultSet.getString("id");
        String actName = resultSet.getString("name");
        String actSurname = resultSet.getString("surname");
        String actBirthPlace = resultSet.getString("birth_place");
        String actEmail = resultSet.getString("email");
        String actPhoneNumber = resultSet.getString("phone_number");
        String actGender = resultSet.getString("gender");
        String actBirthDay = resultSet.getString("birth_day");
        String actSsn = resultSet.getString("ssn");
        String actUsername = resultSet.getString("username");


        assertEquals(id,actId);
        assertEquals(name,actName);
        assertEquals(surname,actSurname);
        assertEquals(birth_place,actBirthPlace);
        assertEquals(email,actEmail);
        assertEquals(phone_number,actPhoneNumber);
        assertEquals(gender,actGender);
        assertEquals(birth_day,actBirthDay);
        assertEquals(ssn,actSsn);
        assertEquals(username,actUsername);
    }
}
