package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.MOSAdminManagementPage;
import pages.MOSDeanManagementPage;
import pages.MOSHomePage;
import pages.MOSMainMenuPage;
import utilities.*;

import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class US_05_StepDefs {
    MOSHomePage mosHomePage = new MOSHomePage();
    MOSMainMenuPage mosMainMenuPage = new MOSMainMenuPage();
    MOSAdminManagementPage mosAdminManagementPage = new MOSAdminManagementPage();
    MOSDeanManagementPage mosDeanManagementPage = new MOSDeanManagementPage();

    //Test Case 001 Scenario: TC_001 Admin should be able to see Name, Gender, Phone Number, SSN and User Name information of Deans
    @Given("navigates to {string}")
    public void navigates_to(String url) {
        Driver.getDriver().get(url);
    }
    @Then("click on login")
    public void click_on_login() {
        mosHomePage.homeLoginButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("add user name")
    public void add_user_name() {
        mosHomePage.userName.sendKeys("AdminProject09");
        WaitUtils.waitFor(1);
    }
    @Then("add password")
    public void add_password() throws IOException {
        mosHomePage.userPassword.sendKeys("12345678");
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("click on login button")
    public void click_on_login_button() {
        mosHomePage.loginSubmitButton.click();
        WaitUtils.waitFor(1);
    }


    @Then("verify admin is able to see name")
    public void verify_admin_is_able_to_see_name() {
        ReusableMethods.verifyElementIsDisplayed(mosMainMenuPage.name);
    }
    @Then("verify admin is able to see gender")
    public void verify_admin_is_able_to_see_gender() {
        ReusableMethods.verifyElementIsDisplayed(mosMainMenuPage.gender);
    }
    @Then("verify admin is able to see phone number")
    public void verify_admin_is_able_to_see_phone_number() {
        ReusableMethods.verifyElementIsDisplayed(mosMainMenuPage.phoneNumber);
    }
    @Then("verify admin is able to see ssn")
    public void verify_admin_is_able_to_see_ssn() {
        ReusableMethods.verifyElementIsDisplayed(mosMainMenuPage.ssn);
    }
    @Then("verify admin is able to see user name information")
    public void verify_admin_is_able_to_see_user_name_information() throws IOException {
        ReusableMethods.verifyElementIsDisplayed(mosMainMenuPage.userName);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }


    //Test Case 002 Scenario: TC_002 Admin should be able to delete Deans
    @Given("click on the menu")
    public void click_on_the_menu() {
        mosMainMenuPage.menu.click();
        WaitUtils.waitFor(1);
    }

    @Given("click on Admin Management")
    public void click_on_admin_management() {
        mosMainMenuPage.adminManagement.click();
    }
    @Then("click on delete button")
    public void click_on_delete_button() throws IOException {
        JSUtils.clickWithTimeoutByJS(mosAdminManagementPage.deleteButton);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("verify that message is Admin deleted successful")
    public void verify_that_message_is_admin_deleted_successful() throws IOException {
        ReusableMethods.verifyElementIsDisplayed(ReusableMethods.waitForVisibility(mosAdminManagementPage.deletedSuccessfulMessage,3));
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    //Test case 003 Scenario: TC_003 Admin should be able to update Deans
    @Then("click on edit button")
    public void click_on_edit_button() {
        //mosDeanManagementPage.editButton.click();
        JSUtils.clickWithTimeoutByJS(mosDeanManagementPage.editButton);
    }
    @Then("change surname")
    public void change_surname() {
        mosDeanManagementPage.surname.isSelected();
        mosDeanManagementPage.surname.clear();
        WaitUtils.waitForVisibility(mosDeanManagementPage.surname,2);
        mosDeanManagementPage.surname.sendKeys("Beyaz");


    }
    @Then("Enter admin password")
    public void enter_admin_password() {
        mosDeanManagementPage.deanManagementEditPassword.sendKeys("12345678");
    }
    @Then("click on submit button")
    public void click_on_submit_button() throws IOException {
        mosDeanManagementPage.deanManagementSubmitButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
    @Then("verify Deans information updated")
    public void verify_deans_information_updated() throws IOException {
        ReusableMethods.verifyElementIsDisplayed(mosDeanManagementPage.deanUpdatedSuccessful);
        MediaUtils.takeScreenshotOfTheEntirePage();
    }
}
