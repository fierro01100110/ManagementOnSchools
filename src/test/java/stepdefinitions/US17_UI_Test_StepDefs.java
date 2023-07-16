package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StudentInfoManagement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US17_UI_Test_StepDefs {

    StudentInfoManagement studentInfoManagement= new StudentInfoManagement();


    @Given("user navigates to the url")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

    }
    @When("user clicks on log in on home page")
    public void user_clicks_on_log_in_on_home_page() {
        studentInfoManagement.loginIcon.click();

    }


    @And("user enters a user name {string}")
    public void userEntersAUserName(String userName) {
        WaitUtils.waitFor(2);
        studentInfoManagement.username.sendKeys(userName);
    }




    @And("user enters password {string}")
    public void userEntersPassword(String psw) {
        WaitUtils.waitFor(2);
        studentInfoManagement.password.sendKeys((psw));

    }



    @When("user clicks on log in")
    public void user_clicks_on_log_in() {
        WaitUtils.waitFor(2);
        studentInfoManagement.login.click();


    }
    @Given("user clicks on menu")
    public void user_clicks_on_menu() {
        WaitUtils.waitFor(2);
        studentInfoManagement.menu.click();

    }
    @When("user clicks on Student Info Management")
    public void user_clicks_on_student_info_management() {
        WaitUtils.waitFor(2);
        studentInfoManagement.studentInfoMng.click();

    }
    @When("user choose a lesson {string}")
    public void user_choose_a_lesson(String lesson) {

        WaitUtils.waitFor(3);
        //new Select(studentInfoManagement.lesson).selectByVisibleText(lesson);
       // studentInfoManagement.lesson.click();
       // studentInfoManagement.java.click();

        ReusableMethods.selectByVisibleText(studentInfoManagement.lesson, "java");

    }
    @When("user choose a student name {string}")
    public void user_choose_a_student_name(String stdName) {
        //WaitUtils.waitFor(2);
       // new Select(studentInfoManagement.studentName).selectByVisibleText(stdName);

        ReusableMethods.selectByVisibleText(studentInfoManagement.studentName, "Student Murat");
    }
    @When("user choose a education term {string}")
    public void user_choose_a_education_term(String term) {
        WaitUtils.waitFor(2);
       // new Select(studentInfoManagement.term).selectByVisibleText(term);
       // studentInfoManagement.clickOnTerm.click();
       // studentInfoManagement.chooseTerm.click();

        ReusableMethods.selectByVisibleText(studentInfoManagement.clickOnTerm, "SPRING_SEMESTR");

    }
    @When("user enters absences {string}")
    public void user_enters_absences(String absentee) {
        WaitUtils.waitFor(2);
        studentInfoManagement.absentee.sendKeys(absentee);



    }
    @When("user enters midterm exam {string}")
    public void user_enters_midterm_exam(String midTerm) {
        WaitUtils.waitFor(2);
        studentInfoManagement.midtermExam.sendKeys(midTerm);
    }


    @When("user enters final exam {string}")
    public void user_enters_final_exam(String finalExam) {
        studentInfoManagement.finalExam.sendKeys(finalExam);

    }
    @When("user enters info note {string}")
    public void user_enters_info_note(String infoNote) {
        studentInfoManagement.infoNote.sendKeys(infoNote);

    }


    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        ReusableMethods.clickWithTimeOut(studentInfoManagement.submit, 2);

    }
    @Then("verify student info is visible on the student info list")
    public void verify_student_info_is_visible_on_the_student_info_list() {

    }


   /* @Then("close the app")
    public void close_the_app() {

    }*/



}
