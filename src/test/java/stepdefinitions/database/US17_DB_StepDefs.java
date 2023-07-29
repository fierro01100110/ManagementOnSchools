package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.ResultSet;
import java.sql.SQLException;


import static org.junit.Assert.assertEquals;
import static stepdefinitions.US17_UI_Test_StepDefs.*;
import static utilities.DataBaseUtils.getResultSet;

public class US17_DB_StepDefs {

ResultSet resultSet;
    @Given("get all students info")
    public void get_all_students_info() {
        String sqlQuery = "select * from student_info where info_note= '"+fakeInfoNote+"' ";
     resultSet=getResultSet(sqlQuery);

    }

    @Then("validate the body for Student Info")
    public void validate_the_body_for_student_info() throws SQLException {
       // System.out.println("infoNote"+fakeInfoNote);
 resultSet.next();
 String actAbsentee= resultSet.getString("absentee");
 assertEquals(fakeAbsencees, actAbsentee);
 String actFinalExam = resultSet.getString("final_exam");
 assertEquals(fakeFinalExam, actFinalExam);
 String actMidtermExam= resultSet.getString("midterm_exam");
 assertEquals(fakeMidtermExam, actMidtermExam);

 }

    }




