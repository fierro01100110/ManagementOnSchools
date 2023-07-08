package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.DeanContactMessage;
import pages.DeanManagement;
import pages.HomePage;
import pages.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.time.Duration;


import static utilities.ReusableMethods.*;

public class AdminAddedDeanStepDefs {
    HomePage homePage = new HomePage();
    Login login = new Login();
    DeanManagement deanManagement = new DeanManagement();

    @Given("user goes to url")
    public void user_goes_to_url() {


        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

    }
    @Then("user logs in as admin")
    public void user_logs_in_as_admin() {

        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("admin_username"));
        login.password.sendKeys(ConfigReader.getProperty("admin_password"));
        login.login.click();


    }

    @Given("admin clicks on menu button")
    public void admin_clicks_on_menu_button() {


        JSUtils.clickWithTimeoutByJS(deanManagement.menuButton2);


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
    }

    @Then("admin enters dean name")
    public void admin_enters_dean_name() {
        deanManagement.deanName.sendKeys("Hakan");
    }

    @Then("admin enters dean surname")
    public void admin_enters_dean_surname(){
        deanManagement.deanSurname.sendKeys("Mollaoglu");
    }

    @Then("admin enters dean birthplace")
    public void admin_enters_dean_birthplace() {
        deanManagement.deanBirthday.sendKeys("London");
    }

    @Then("admin clicks on gender male")
    public void admin_clicks_on_gender_male() {
        deanManagement.deanGenderMale.click();
    }

    @Then("admin enters dean birthday")
    public void admin_enters_dean_birthday() {
        deanManagement.deanBirthday.sendKeys("1980-10-10");
    }

    @Then("admin enters dean phone number")
    public void admin_enters_dean_phone_number() {
        deanManagement.deanPhoneNumber.sendKeys("633-999-0055");
    }

    @Then("admin enters dean ssn")
    public void admin_enters_dean_ssn(){
        deanManagement.deanSsn.sendKeys("323-55-6743");
    }

    @Then("admin enters dean username")
    public void admin_enters_dean_username(){
        deanManagement.deanUsername.sendKeys("hakanmollaoglu");
    }

    @Then("admin enters dean password")
    public void admin_enters_dean_password(){
        deanManagement.deanPassword.sendKeys("Deanisthedean2023");
    }

    @Then("admin clicks on submit button")
    public void admin_clicks_on_submit_button(){
        deanManagement.deanSubmit.click();
    }

    @Then("admin clicks on last page of dean list")
    public void admin_clicks_on_last_page_of_dean_list(){
        deanManagement.lastPageDeanList.click();
    }

    @Then("admin sees dean Hakan on dean list")
    public void admin_sees_dean_hakan_on_dean_list(){
        verifyElementIsDisplayed(deanManagement.deanHakanOnDeanList);
    }


}
