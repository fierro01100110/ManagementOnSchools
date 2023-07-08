package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Login;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_18_TeacherViewStudentInfo_UI_Test {
    HomePage homePage=new HomePage();
    Login login =new Login();
    TeacherPage teacherPage=new TeacherPage();
    @Given("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        homePage.login.click();
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
  teacherPage.editButton.click();
    }
    @When("user selects lesson")
    public void user_selects_lesson() {
 ReusableMethods.selectByVisibleText(teacherPage.chooseLesson,"Java");
    }
    @When("user select Education Term")
    public void user_select_education_term() {
        ReusableMethods.selectByVisibleText(teacherPage.educationTerm,"SPRING_SEMESTER");

    }
    @When("user upgrades Absentee {string}")
    public void user_upgrades_absentee(String absentee) {
ReusableMethods.sendKeysWithTimeout(teacherPage.absentee,absentee,3);

    }
    @When("user upgrades Midterm Exam {string}")
    public void user_upgrades_midterm_exam(String midtermExam) {
        ReusableMethods.sendKeysWithTimeout(teacherPage.midtermExam,midtermExam,3);
    }
    @When("user upgrades Final Exam {string}")
    public void user_upgrades_final_exam(String finalExam) {
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
    public void assert_the_success_message_in_upgrade() {
ReusableMethods.verifyElementIsDisplayed(teacherPage.upgradeSuccessMessage);

    }

    //Scenario 3 =   Scenario: TC_003 delete student info list as a teacher


    @When("user clicks delete button")
    public void user_clicks_delete_button() {
ReusableMethods.clickWithTimeOut(teacherPage.deleteStudentInfo,3);

    }
    @Then("assert the success message in delete")
    public void assert_the_success_message_in_delete() {
//ReusableMethods.verifyElementIsDisplayed(teacherPage.);
    }

}
