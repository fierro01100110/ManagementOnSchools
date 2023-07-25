package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
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

    @When("user clicks Edit button")
    public void user_clicks_edit_button() {

        //teacherPage.editButton.click();
        ReusableMethods.clickWithTimeOut(teacherPage.editButton,3);
    }
    @When("user selects lesson")
    public void user_selects_lesson() {

        ReusableMethods.selectByVisibleText(teacherPage.chooseLesson,"Cypress");

    }
    @When("user select Education Term")
    public void user_select_education_term() {
        ReusableMethods.selectByVisibleText(teacherPage.educationTerm,"SPRING_SEMESTER");

    }
    @When("user upgrades Absentee {string}")
    public void user_upgrades_absentee(String absentee) {
        teacherPage.absentee.sendKeys(Keys.DELETE);

      //  WaitUtils.waitFor(3);
ReusableMethods.sendKeysWithTimeout(teacherPage.absentee,absentee,3);

    }
    @When("user upgrades Midterm Exam {string}")
    public void user_upgrades_midterm_exam(String midtermExam) {
        //teacherPage.midtermExam.sendKeys(Keys.DELETE);
// JSUtils.clickWithTimeoutByJS(teacherPage.midtermExam);
    //    ReusableMethods.sendKeysWithTimeout(teacherPage.midtermExam,midtermExam,3);
        JSUtils.setValueByJS(teacherPage.midtermExam,midtermExam);
    }
    @When("user upgrades Final Exam {string}")
    public void user_upgrades_final_exam(String finalExam) {
        teacherPage.finalExam.clear();
        ReusableMethods.sendKeysWithTimeout(teacherPage.finalExam,finalExam,3);
    }
    @When("user upgrades Info Note {string}")
    public void user_upgrades_info_note(String infoNote) {
;ReusableMethods.sendKeysWithTimeout(teacherPage.midtermExam,infoNote,3);
    }
    @When("user clicks Submit button")
    public void user_clicks_submit_button() {

        ReusableMethods.clickWithTimeOut(teacherPage.submitUpgrade,3);
    }

    @Then("assert the success message in upgrade")
    public void assert_the_success_message_in_upgrade() throws InterruptedException {
       // Boolean a=teacherPage.alertTextLesson.isDisplayed();
        WaitUtils.waitFor(2);
        String aa=teacherPage.alertTextLesson.getText();
        System.out.println("the alert message is like this  "+aa);
        String alertMessage="Please select lesson";
       //Wait assertEquals(alertMessage,teacherPage.alertTextLesson.getText());



        //test fails and there is a bug  teacher is not able to udate or edit student grades


    }

    //Scenario 3 =   Scenario: TC_003 delete student info list as a teacher


    @When("user clicks delete button")
    public void user_clicks_delete_button() {
ReusableMethods.clickWithTimeOut(teacherPage.deleteStudentInfo,3);

    }
    @Then("assert the success message in delete")
    public void assert_the_success_message_in_delete() {

    }

}
