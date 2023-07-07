package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LessonProgramPage;
import pages.Login;
import pages.ViceDeanManagement;
import utilities.ReusableMethods;

public class US10_ViceDeanLessonScheduleStepDefs {


    HomePage homePage = new HomePage();
    Login login = new Login();
    ViceDeanManagement viceDeanManagement = new ViceDeanManagement();
    LessonProgramPage lessonProgramPage = new LessonProgramPage();

    @And("user clicks on Login on homepage")
    public void userClicksOnLoginOnHomepage() {
        ReusableMethods.clickWithTimeOut(ReusableMethods.waitForClickablility(homePage.login, 5), 3);

    }
    @Then("user logs in as vice dean by entering username {string} and password {string}")
    public void userLogsInAsViceDeanByEnteringUsernameAndPassword(String username, String password) {

        login.username.sendKeys(username);
        login.password.sendKeys(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        ReusableMethods.clickWithTimeOut(login.login, 5);

    }
    @Given("user clicks on Menu")
    public void user_clicks_on_menu() {
        ReusableMethods.clickWithTimeOut(viceDeanManagement.menu, 5);

    }
    @Given("user selects Lesson Management from the menu")
    public void user_selects_lesson_management_from_the_menu() {

        ReusableMethods.clickWithTimeOut(ReusableMethods.waitForVisibility(viceDeanManagement.lessonManagement, 5), 5);
    }
    @Given("user selects Lesson Program Management")
    public void user_selects_lesson_program_management() {
        ReusableMethods.clickWithTimeOut(lessonProgramPage.lessonProgramSection, 5);

    }
    @Given("user selects a lesson from Choose Lessons")
    public void user_selects_a_lesson_from_choose_lessons() {

//        lessonProgramPage.chooseLesson.sendKeys("JavaScript");


        ReusableMethods.waitFor(2);

    }
    @Given("user selects a semester")
    public void user_selects_a_semester() {


        Select select = new Select(lessonProgramPage.educationTerm);
        select.selectByVisibleText("SPRING_SEMESTER");


    }
    @Given("user selects a day from Choose Day")
    public void user_selects_a_day_from_choose_day() {

        Select select = new Select(lessonProgramPage.chooseDay);
        select.selectByVisibleText("TUESDAY");
    }
    @Given("user selects Start Time")
    public void user_selects_start_time() {
        lessonProgramPage.startTime.sendKeys("12:00PM");

    }
    @Given("user selects Stop Time")
    public void user_selects_stop_time() {
        lessonProgramPage.stopTime.sendKeys("02:00PM");

    }
    @When("user clicks on Submit button")
    public void user_clicks_on_submit_button() {
       ReusableMethods.clickWithTimeOut(ReusableMethods.waitForClickablility(lessonProgramPage.submitButton, 5),5);

    }
    @Then("user sees Created lesson program success message")
    public void user_sees_created_lesson_program_success_message() {

        ReusableMethods.verifyElementIsDisplayed(lessonProgramPage.successMessage);
    }


    //NEGATIVE TEST CASE TC_002
    @Then("Verify that new lesson program can not be created")
    public void verifyThatNewLessonProgramCanNotBeCreated() {

    }


    //NEGATIVE TEST CASE TC_003
    @Then("Verify that new lesson can't be created due to lesson section")
    public void verifyThatNewLessonCanTBeCreatedDueToLessonSection() {

    }
}
