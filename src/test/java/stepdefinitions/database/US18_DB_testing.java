package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static utilities.DataBaseUtils.getResultSet;

public class US18_DB_testing {
    Connection connection;
    ResultSet resultSet;
    @Given("get student info via id {string}")
    public void get_student_info_via_id(String id) {

        String sqlQuery = "SELECT * FROM guest_user WHERE id ='" + id + "'";

        resultSet = getResultSet(sqlQuery);


    }
    @Then("body contains lesson_name {string}, absentee {string}, midterm {string}, final {string}, note {string}, info_note {string}, average {string}")
    public void body_contains_lesson_name_absentee_midterm_final_note_info_note_average(String lesson_name, String absentee, String midterm, String finalExam, String note, String info_note, String average) throws SQLException {

        resultSet.next();  //very importsny  to move the pointer to the necxt record from the header
        System.out.println(resultSet.getString("lesson_name"));//2023-07-01
        String actLesson_name=resultSet.getString("lesson_name");
        String actAbsentee=resultSet.getString("absentee");
        String actMidterm=resultSet.getString("midterm");
        String actFinalExam=resultSet.getString("finalExam");
        String actNote=resultSet.getString("note");
        String actInfo_note=resultSet.getString("info_note");
        String actAverage=resultSet.getString("average");

        assertEquals(lesson_name, actLesson_name);
        assertEquals(absentee, actAbsentee);
        assertEquals(midterm, actMidterm);
        assertEquals(finalExam, actFinalExam);
        //    assertEquals(phone_number, actPhone_number);
        assertEquals(note, actNote);
        assertEquals(info_note, actInfo_note);
        assertEquals(average, actAverage);

    }

    @Given("get guest user via username {string}")
    public void get_guest_user_via_username(String username) throws SQLException {
        assertFalse(resultSet.next());

    }
    @Then("body should be empty")
    public void body_should_be_empty() {


    }


}
