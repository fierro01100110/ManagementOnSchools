package stepdefinitions.database;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.sql.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static utilities.DataBaseUtils.getResultSet;

public class US20_DBStepDefs {
    ResultSet resultSet;
    @Given("get meet via description {string}")
    public void get_meet_via_description(String description) {
        String sqlQuery ="SELECT * FROM meet WHERE description ='"+description+"'";

        resultSet = getResultSet(sqlQuery);
    }
    @Then("the body contains date {string}, description {string}, start_time {string}, stop_time {string}")
    public void the_body_contains_date_description_start_time_stop_time(String date, String description, String start_time, String stop_time) throws SQLException {
        resultSet.next();

        String actDate = resultSet.getString("date");
        String actDescription = resultSet.getString("description");
        String actStart_time = resultSet.getString("start_time");
        String actStop_time = resultSet.getString("stop_time");

        assertEquals(date, actDate);
        assertEquals(description, actDescription);
        assertEquals(start_time, actStart_time);
        assertEquals(stop_time, actStop_time);

    }
    @Then("Body should be empty")
    public void body_should_be_empty() throws SQLException {
        assertFalse(resultSet.next());

    }
}
