package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static stepdefinitions.US01_UI_StudentRegister.*;
import static utilities.DataBaseUtils.getResultSet;

public class US01_DB_StudentRegister {
    ResultSet resultSet;

    public  static  String actUsername ;

    @Given("get guest user db with username")
    public void getGuestUserDbWithUsername() {
        String sqlQuery ="SELECT * FROM guest_user WHERE username = '"+fakeUserName+"' ";
        resultSet=getResultSet(sqlQuery);

    }
    @Then("body contains db name, surname, birth_place, phone_number, gender, birth_day, ssn, username")
    public void bodyContainsDbNameSurnameBirth_placePhone_numberGenderBirth_daySsnUsername() throws SQLException {

        resultSet.next();
        String actName = resultSet.getString("name");
        String actSurname = resultSet.getString("surname");
        String actBirthPlace = resultSet.getString("birth_place");
        String actPhoneNumber = resultSet.getString("phone_number");
        String actSSN = resultSet.getString("ssn");
        actUsername = resultSet.getString("username");

        assertEquals(fakeName, actName);
        assertEquals(fakeSurname, actSurname);
        assertEquals(fakeBirthPlace, actBirthPlace);
        assertEquals(fakePhone, actPhoneNumber);
        assertEquals(fakeSSN, actSSN);
        assertEquals(fakeUserName, actUsername);
    }
}
