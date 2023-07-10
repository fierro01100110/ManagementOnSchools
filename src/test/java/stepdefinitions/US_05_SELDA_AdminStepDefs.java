package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AdminManagementPage;
import pages.DeanManagement;
import pages.HomePage;
import pages.MainMenuPage;
import utilities.*;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class US_05_SELDA_AdminStepDefs {
    HomePage homePage = new HomePage();
    MainMenuPage mainMenuPage = new MainMenuPage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    DeanManagement deanManagement = new DeanManagement();

    //Test Case 001 Scenario: TC_001 Admin should be able to see Name, Gender, Phone Number, SSN and User Name information of Deans
    @Given("navigates to {string}")
    public void navigates_to(String url) {
        Driver.getDriver().get(url);
    }
    @Then("click on login")
    public void click_on_login() {
        homePage.homeLoginButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("add user name")
    public void add_user_name() {
        homePage.userName.sendKeys("AdminProject");
        WaitUtils.waitFor(1);
    }
    @Then("add password")
    public void add_password() throws IOException {
        homePage.userPassword.sendKeys("12345678");
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("click on login button")
    public void click_on_login_button() {
        homePage.loginSubmitButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("verify admin is able to see name")
    public void verify_admin_is_able_to_see_name() {
        ReusableMethods.verifyElementIsDisplayed(mainMenuPage.name);
    }
    @Then("verify admin is able to see gender")
    public void verify_admin_is_able_to_see_gender() {
        ReusableMethods.verifyElementIsDisplayed(mainMenuPage.gender);
    }
    @Then("verify admin is able to see phone number")
    public void verify_admin_is_able_to_see_phone_number() {
        ReusableMethods.verifyElementIsDisplayed(mainMenuPage.phoneNumber);
    }
    @Then("verify admin is able to see ssn")
    public void verify_admin_is_able_to_see_ssn() {
        ReusableMethods.verifyElementIsDisplayed(mainMenuPage.ssn);
    }
    @Then("verify admin is able to see user name information")
    public void verify_admin_is_able_to_see_user_name_information() throws IOException {
        ReusableMethods.verifyElementIsDisplayed(mainMenuPage.userName);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }


    //Test Case 002 Scenario: TC_002 Admin should be able to delete Deans
    @Given("click on the menu")
    public void click_on_the_menu() {
        mainMenuPage.menu.click();
        WaitUtils.waitFor(1);
    }
    @Given("click on Admin Management")
    public void click_on_admin_management() {
        mainMenuPage.adminManagement.click();
    }
    @Then("click on delete button")
    public void click_on_delete_button() throws IOException {
        JSUtils.clickWithTimeoutByJS(adminManagementPage.deleteButton);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("verify that message is Admin deleted successful")
    public void verify_that_message_is_admin_deleted_successful() throws IOException {
        ReusableMethods.verifyElementIsDisplayed(ReusableMethods.waitForVisibility(adminManagementPage.deletedSuccessfulMessage,3));
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    //Test case 003 Scenario: TC_003 Admin should be able to update Deans

    @Then("click on edit button")
    public void click_on_edit_button() {
        //mosDeanManagementPage.editButton.click();
        JSUtils.clickWithTimeoutByJS(deanManagement.editButton);
    }
    @Then("change surname")
    public void change_surname() {
        deanManagement.surname.isSelected();
        deanManagement.surname.clear();
        WaitUtils.waitForVisibility(deanManagement.surname,3);
        deanManagement.surname.sendKeys("Beyaz");
    }
    @Then("Enter admin password")
    public void enter_admin_password() {
        deanManagement.deanManagementEditPassword.sendKeys("12345678");
    }
    @Then("click on submit button")
    public void click_on_submit_button() throws IOException {
        deanManagement.deanManagementSubmitButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("verify Deans information updated")
    public void verify_deans_information_updated() throws IOException {
        ReusableMethods.verifyElementIsDisplayed(deanManagement.deanUpdatedSuccessful);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
}
