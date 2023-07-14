package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Ma;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LessonManagement;
import pages.Login;
import pages.MainMenu;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import static utilities.ReusableMethods.verifyElementIsDisplayed;

public class ViceDeanLessonProgramStepDefs {

    HomePage homePage = new HomePage();
    Login login = new Login();
    LessonManagement lessonManagement = new LessonManagement();
    MainMenu mainMenu = new MainMenu();


    @Then("user logs in as vice dean")
    public void user_logs_in_as_vice_dean() {
        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("jayson_tatum_username"));
        login.password.sendKeys(ConfigReader.getProperty("jayson_tatum_password"));
        login.login.click();
    }
    @Then("user clicks to Lesson Program")
    public void user_clicks_to_lesson_program() {
        JSUtils.clickWithTimeoutByJS(lessonManagement.lessonProgram);

    }
    @Then("verify vice dean is able to see lesson")
    public void verify_vice_dean_is_able_to_see_lesson() {
        verifyElementIsDisplayed(lessonManagement.lesson);
    }
    @Then("verify vice dean is able to see day")
    public void verify_vice_dean_is_able_to_see_day() {
        verifyElementIsDisplayed(lessonManagement.day);
    }
    @Then("verify vice dean is able to see start time")
    public void verify_vice_dean_is_able_to_see_start_time() {
        verifyElementIsDisplayed(lessonManagement.startTime);
    }
    @Then("verify vice dean is able to see stop time")
    public void verify_vice_dean_is_able_to_see_stop_time() {
        verifyElementIsDisplayed(lessonManagement.stopTime);

    }

    @Then("verify vice dean is able to update list")
    public void verifyViceDeanIsAbleToUpdateList() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(lessonManagement.updateButton.isDisplayed(),"This button is not existing. FAIL");
        softAssert.assertAll();

    }

    @Then("verify vice dean is able to delete something from list")
    public void verifyViceDeanIsAbleToDeleteSomethingFromList() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(lessonManagement.deletingButton.isDisplayed(),"This button is not existing. FAIL");
        softAssert.assertAll();
    }

    @Given("user clicks to the lesson management page on menu")
    public void userClicksToTheLessonManagementPageOnMenu() {
        JSUtils.clickWithTimeoutByJS(mainMenu.lessonManagementPage);
    }
}
