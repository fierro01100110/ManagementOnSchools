package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.internal.runners.statements.Fail;
import org.testng.asserts.SoftAssert;
import pages.DeanContactMessage;
import pages.DeanManagement;
import pages.HomePage;
import pages.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.io.IOException;

import static utilities.MediaUtils.takeScreenshotOfTheEntirePage;
import static utilities.ReusableMethods.getElementsText;
import static utilities.ReusableMethods.verifyElementIsDisplayed;

public class DeanContactMessageStepDefs {

    HomePage homePage = new HomePage();
    Login login = new Login();
    DeanManagement deanManagement = new DeanManagement();
    DeanContactMessage deanContactMessage = new DeanContactMessage();

    @Given("user navigates to url")
    public void user_navigates_to_url() {

        Driver.getDriver().get(ConfigReader.getProperty("login_url"));

    }
    @Then("user logs in as dean")
    public void user_logs_in_as_dean() {

        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("jason_dean_username"));
        login.password.sendKeys(ConfigReader.getProperty("jason_dean_password"));
        login.login.click();

    }

    @Given("dean navigates to menu")
    public void dean_navigates_to_menu() {
        JSUtils.clickWithTimeoutByJS(deanManagement.menu);


    }
    @When("dean clicks to contact get all")
    public void dean_clicks_to_contact_get_all() {
        JSUtils.clickWithTimeoutByJS(deanManagement.contactGetAll);
    }
    @Then("verify dean is able see delete button")
    public void verify_dean_is_able_see_delete_button() throws IOException {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(deanContactMessage.deleteButton.isDisplayed(),"Fail there is no delete button");
        softAssert.assertAll();

    }

    @Then("verify dean is able to see messages")
    public void verify_dean_is_able_to_see_messages() {

        verifyElementIsDisplayed(deanContactMessage.message);
    }
    @Then("verify dean is able to see authors")
    public void verify_dean_is_able_to_see_authors() {
        verifyElementIsDisplayed(deanContactMessage.name);
    }
    @Then("verify dean is able to see emails")
    public void verify_dean_is_able_to_see_emails() {
        verifyElementIsDisplayed(deanContactMessage.email);
    }
    @Then("verify dean is able to see sending dates")
    public void verify_dean_is_able_to_see_sending_dates() {
        verifyElementIsDisplayed(deanContactMessage.date);
    }
    @Then("verify dean is able to see subject information")
    public void verify_dean_is_able_to_see_subject_information() {
        verifyElementIsDisplayed(deanContactMessage.subject);
    }

    @And("verify all the table one by one")
    public void verifyAllTheTableOneByOne() throws IOException {
        System.out.println(getElementsText(deanContactMessage.tableBody));

    }

    @Then("verify dean can delete messages")
    public void verifyDeanCanDeleteMessages() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(deanContactMessage.deleteButton.isDisplayed(),"Fail dean can not delete messages");
        softAssert.assertAll();

    }
}
