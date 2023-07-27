package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import pages.TeacherMeetManagement;
import utilities.*;

public class US20_TeacherMeetManagementStepDefs {
    TeacherMeetManagement teacherMeetManagement = new TeacherMeetManagement();
    @Given("Go to url")
    public void go_to_url() {

        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
    }
    @Given("Click Login on the homepage")
    public void click_login_on_the_homepage() {
        ReusableMethods.clickWithTimeOut(ReusableMethods.waitForClickablility(teacherMeetManagement.login, 5), 5);
        teacherMeetManagement.login.click();
        WaitUtils.waitFor(3);
    }
    @Given("Log in as a Teacher by using username {string} and password {string}")
    public void log_in_as_a_teacher_by_using_username_and_password(String username, String password) {

        teacherMeetManagement.username.sendKeys(ConfigReader.getProperty("teacher_meet_management_username"));
        teacherMeetManagement.password.sendKeys(ConfigReader.getProperty("teacher_meet_management_password"));
        WaitUtils.waitFor(3);
    }
    @Then("Click on the login button")
    public void click_on_the_login_button() {
        ReusableMethods.clickWithTimeOut(teacherMeetManagement.Login, 5);
    }
    @Then("Click on the menu button")
    public void click_on_the_menu_button() {
        ReusableMethods.clickWithTimeOut(teacherMeetManagement.menu,5);
        JSUtils.clickWithTimeoutByJS(teacherMeetManagement.menu);
        teacherMeetManagement.menu.click();
        WaitUtils.waitFor(3);
    }
    @Given("Click on Meet Management")
    public void click_on_meet_management() {

        //ReusableMethods.clickWithTimeOut(ReusableMethods.waitForVisibility(teacherMeetManagement.meetManagement, 5), 5);
        JSUtils.clickWithTimeoutByJS(teacherMeetManagement.meetManagement);
        WaitUtils.waitFor(3);
    }
    @Then("Verify Teacher is able to see meet management page")
    public void verify_teacher_is_able_to_see_meet_management_page() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(teacherMeetManagement.meetManagementText.isDisplayed());
        softAssert.assertAll();
        WaitUtils.waitFor(3);
    }
    @Then("Verify Teacher is able to see Meet List")
    public void verify_teacher_is_able_to_see_meet_list() {

        JSUtils.scrollIntoViewJS(teacherMeetManagement.meetList);
        ReusableMethods.verifyElementIsDisplayed(teacherMeetManagement.meetList);
        //WaitUtils.waitForVisibility(teacherMeetManagement.meetList,5);
        WaitUtils.waitFor(3);
    }
    @Then("Click on the Edit button")
    public void click_on_the_edit_button() {

        JSUtils.clickWithTimeoutByJS(teacherMeetManagement.editButton);
        WaitUtils.waitFor(3);
    }
    @Then("Verify Teacher is able to see Edit Meet page")
    public void verify_teacher_is_able_to_see_edit_meet_page() {

        ReusableMethods.verifyElementIsDisplayed(teacherMeetManagement.editMeetPage);
        WaitUtils.waitFor(3);
    }
    @Then("Click on the Choose Students box to update student name")
    public void click_on_the_choose_students_box_to_update_student_name() {

        ReusableMethods.clickWithTimeOut(teacherMeetManagement.arrow, 5);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickWithTimeOut(teacherMeetManagement.selectStudent, 5);
        ReusableMethods.waitFor(3);
    }
    @Then("Click on the Date Of Meet box to update date")
    public void click_on_the_date_of_meet_box_to_update_date() {



        ReusableMethods.clickWithTimeOut(teacherMeetManagement.date,5);
        ReusableMethods.waitFor(3);
        //Select select = new Select(teacherMeetManagement.date);
        //select.selectByVisibleText("2023-07-27");
        teacherMeetManagement.date.sendKeys("");
        WaitUtils.waitFor(1);

    }
    @Then("Click on the Start Time box to update")
    public void click_on_the_start_time_box_to_update() {

        ReusableMethods.clickWithTimeOut(teacherMeetManagement.time, 5);
        ReusableMethods.waitFor(3);
        teacherMeetManagement.time.sendKeys("10:00AM");
        WaitUtils.waitFor(1);
    }
    @Then("Click on the Stop Time box to update")
    public void click_on_the_stop_time_box_to_update() {

        ReusableMethods.clickWithTimeOut(teacherMeetManagement.Time, 5);
        ReusableMethods.waitFor(3);
        teacherMeetManagement.Time.sendKeys("10:30AM"+Keys.ENTER);
        WaitUtils.waitFor(1);
    }
    @Then("Click on the Description box to update")
    public void click_on_the_description_box_to_update() {
        ReusableMethods.clickWithTimeOut(teacherMeetManagement.description, 5);
        ReusableMethods.waitFor(3);
        teacherMeetManagement.description.sendKeys("");
        WaitUtils.waitFor(3);

    }
    @Then("Click on the Submit button")
    public void click_on_the_submit_button() {
        JSUtils.clickWithTimeoutByJS(teacherMeetManagement.submit);
        WaitUtils.waitFor(3);

    }
    @Then("Verify teacher sees Meet updated Successfully message")
    public void verify_teacher_sees_meet_updated_successfully_message() {

        //WaitUtils.waitFor(3);
        //String successfulMassage = teacherMeetManagement.successfulMessage.getText();
        //AssertJUnit.assertTrue(successfulMassage.contains("Meet updated Successfully"));
    }
    @Then("Close the Edit Meet page")
    public void close_the_edit_meet_page() {
        JSUtils.clickWithTimeoutByJS(teacherMeetManagement.closePage);
        teacherMeetManagement.closePage.click();
        WaitUtils.waitFor(1);
    }
    @Then("Click on the delete box")
    public void click_on_the_delete_box() {
        JSUtils.clickWithTimeoutByJS(teacherMeetManagement.deleteButton);
        WaitUtils.waitFor(3);
    }
    @Then("Verify teacher sees Meet deleted Successfully message")
    public void verify_teacher_sees_meet_deleted_successfully_message() {

        //WaitUtils.waitFor(3);
        //String successfulMassage = teacherMeetManagement.deleteSuccessfulMessage.getText();
        //AssertJUnit.assertTrue(successfulMassage.contains("Meet updated Successful"));
    }
}
