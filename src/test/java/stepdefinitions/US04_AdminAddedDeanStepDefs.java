package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.DeanManagement;
import pages.HomePage;
import pages.Login;
import pages.StudentManagement;
import utilities.*;


import static utilities.ReusableMethods.*;

public class  US04_AdminAddedDeanStepDefs {
    HomePage homePage = new HomePage();
    Login login = new Login();
    DeanManagement deanManagement = new DeanManagement();
    StudentManagement studentManagement = new StudentManagement();

    @Given("user goes to url")
    public void user_goes_to_url() {


        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

    }
    @Then("user logs in as admin")
    public void user_logs_in_as_admin() {

        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("adminCreate_username"));
        login.password.sendKeys(ConfigReader.getProperty("adminCreate_password"));
        login.login.click();


    }

    @Given("admin clicks on menu button")
    public void admin_clicks_on_menu_button() {

        JSUtils.clickWithTimeoutByJS(deanManagement.menu);


    }
    @When("admin clicks to dean management")
    public void admin_clicks_to_dean_management() {
        JSUtils.clickWithTimeoutByJS(deanManagement.deanManagementMenu);
    }

    @Then("verify admin is able see submit button")
    public void verify_admin_is_able_see_submit_button() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(deanManagement.deanSubmit.isDisplayed(),"Fail there is no submit button");
        softAssert.assertAll();
        WaitUtils.waitFor(1);

    }

    @Then("admin enters dean name")
    public void admin_enters_dean_name() {
        deanManagement.deanName.sendKeys("Hakan");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean surname")
    public void admin_enters_dean_surname(){
        deanManagement.deanSurname.sendKeys("Mollaoglu");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean birthplace")
    public void admin_enters_dean_birthplace() {
        deanManagement.deanBirthPlace.sendKeys("Toronto");
        WaitUtils.waitFor(1);
    }

    @Then("admin clicks on gender male")
    public void admin_clicks_on_gender_male() {
        deanManagement.deanGenderMale.click();
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean birthday")
    public void admin_enters_dean_birthday() {
        deanManagement.deanBirthday.sendKeys("001970-10-10");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean phone number")
    public void admin_enters_dean_phone_number() {
        deanManagement.deanPhoneNumber.sendKeys("333-999-2222");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean ssn")
    public void admin_enters_dean_ssn(){
        deanManagement.deanSsn.sendKeys("333-44-6666");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean username")
    public void admin_enters_dean_username(){
        deanManagement.deanUsername.sendKeys("hakanmollaoglu4");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters dean password")
    public void admin_enters_dean_password(){
        deanManagement.deanPassword.sendKeys("Deanisthedean2023");
        WaitUtils.waitFor(1);
    }

    @Then("admin clicks on submit button")
    public void admin_clicks_on_submit_button(){
        deanManagement.deanSubmit.click();
        WaitUtils.waitFor(1);
    }


    @Then("admin sees dean saved")
    public void admin_sees_dean_saved(){
        ReusableMethods.waitForVisibility(deanManagement.deanSaved,2000);
        verifyElementIsDisplayed(deanManagement.deanSaved);
    }


}
