package stepdefinitions;
import io.cucumber.java.en.*;

import pages.AdminManagementPage;
import pages.LessonsPage;
import pages.SchoolHomePage;
import pages.SchoolLoginPage;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UI_US08_StepDefs {
    SchoolHomePage schoolHomePage = new SchoolHomePage();
    SchoolLoginPage schoolLoginPage = new SchoolLoginPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    LessonsPage lessonsPage=new LessonsPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);
    }
    @When("user click on login")
    public void user_click_on_login() {
        schoolHomePage.login.click();
    }
    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        schoolLoginPage.username.sendKeys(username);
        schoolLoginPage.password.sendKeys(password);
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        schoolLoginPage.loginButton.click();
    }
    @When("user click on menu")
    public void user_click_on_menu() {
        adminManagementPage.menuButton.click();

    }

    @When("user click on logout")
    public void user_click_on_logout() {
        adminManagementPage.logoutButton.click();

    }

    @When("user click on yes for logout")
    public void user_click_on_yes_for_logout() {
        adminManagementPage.yesLogoutButton.click();

    }
    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        schoolLoginPage.username.sendKeys(username);
        schoolLoginPage.password.sendKeys(password);
    }
    @Given("user click on lessons")
    public void user_click_on_lessons() {
        adminManagementPage.lessonsButton.click();
    }

    @When("user enters lesson name {string}")
    public void user_enters_lesson_name(String string) {
        lessonsPage.lessonName.sendKeys(string);

    }

    @When("user mark the course is compulsory")
    public void user_mark_the_course_is_compulsory() {
        lessonsPage.compulsory.click();

    }

    @When("user enter credit score {string}")
    public void user_enter_credit_score(String string) {
        lessonsPage.creditScore.sendKeys(string);

    }

    @When("user click on submit button")
    public void user_click_on_submit_button() {
        lessonsPage.lessonSubmitButton.click();

    }

    @Then("assert the alert")
    public void assert_the_alert() {
        WaitUtils.waitFor(2);
        assertTrue(lessonsPage.alert.getText().contains("Lesson Created"));
        //      assertEquals("Lesson Created",lessonsPage.alert.getText());
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

}