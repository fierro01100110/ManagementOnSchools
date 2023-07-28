package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.Login;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import static org.junit.Assert.*;

public class US_18_TeacherViewStudentInfo_UI_Test {
    HomePage homePage=new HomePage();
    Login login =new Login();
    TeacherPage teacherPage=new TeacherPage();
    @Given("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        ReusableMethods.clickWithTimeOut(homePage.login,3);
        login.username.sendKeys(ConfigReader.getProperty("andrey_teacher_name"));
        login.password.sendKeys(ConfigReader.getProperty("andrey_teacher_password"));
        login.login.click();
    }
    @Then("assert that user sees the student info list")
    public void assert_that_user_sees_the_student_info_list() {
        ReusableMethods.verifyElementIsDisplayed(teacherPage.studentInfoList);

    }
    //Scenario 2 = Scenario Outline: TC_002 update student grade as a teacher



    //Scenario 3 =   Scenario: TC_003 delete student info list as a teacher


    @When("user clicks delete button")
    public void user_clicks_delete_button() {
        ReusableMethods.clickWithTimeOut(teacherPage.deleteStudentInfo,3);

    }
    @Then("assert the success message in delete")
    public void assert_the_success_message_in_delete() {

    }

}
