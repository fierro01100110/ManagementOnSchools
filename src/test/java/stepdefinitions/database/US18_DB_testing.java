package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.plugin.event.Node;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static utilities.DataBaseUtils.getResultSet;

public class US18_DB_testing {
    //String name, String lesson_name, String absentee, String midterm_exam, String final_exam, String note, String info_note, String exam_average
    /*
     System.out.println(resultSet.getString("absentee"));
       String actAbsentee= resultSet.getString("absentee");
        assertEquals(absentee,actAbsentee );

           String sqlQuery = "SELECT * FROM student_list WHERE info_note ='" + info_note + "'";
        resultSet = getResultSet(sqlQuery);//it create connection and statement and returns a resultset
     */
    ResultSet resultSet;
    @Given("get student info via info_note {string}")
    public void get_student_info_via_info_note(String info_note) {
        String sqlQuery = "SELECT * FROM student_info WHERE info_note ='" + info_note + "'";
        resultSet = getResultSet(sqlQuery);//it create connection and statement and returns a resultset
    }
    @Then("body contains name {string} lesson_name {string}, absentee {string}, midterm_exam {string}, final_exam {string}, note {string}, info_note {string}, exam_average {string}")
    public void body_contains_name_lesson_name_absentee_midterm_exam_final_exam_note_info_note_exam_average(String name, String lesson_name, String absentee, String midterm_exam, String final_exam, String note, String info_note, String exam_average) throws SQLException {
       resultSet.next();
        System.out.println(resultSet.getString("absentee"));
        String actAbsentee= resultSet.getString("absentee");
        assertEquals(absentee,actAbsentee );
    }
    @Then("body should be empty")
    public void body_should_be_empty() throws SQLException {
        assertFalse(resultSet.next());
    }
}
