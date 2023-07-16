package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.Login;
import pages.ViceDeanManagement;
import utilities.*;

import static utilities.Driver.driver;

public class US_06_TC_01_StepDefs {
    Login login = new Login();
    ViceDeanManagement viceDeanManagement = new ViceDeanManagement();
    Faker faker = new Faker();


    @Given("user navigates to login url")
    public void user_navigates_to_login_url() {
        Driver.getDriver().get(ConfigReader.getProperty("login_url"));
    }

    @When("user login in as admin")
    public void user_login_in_as_admin() {
        login.username.sendKeys(ConfigReader.getProperty("jason_dean_username"));
        login.password.sendKeys(ConfigReader.getProperty("jason_dean_password"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);

        login.login.click();


    }

    @Then("Go to Menu button")
    public void click_on_menu_button() {
        JSUtils.clickWithTimeoutByJS(viceDeanManagement.menu);


    }

    @Then("Click on Vice Dean Management")
    public void click_on_vice_dean_management() {
        WaitUtils.waitFor(1);
        viceDeanManagement.viceDManagment.click();


    }

    @Then("Admin enters Vice Dean's Name")
    public void admin_enters_vice_dean_s_name() {
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);
        viceDeanManagement.name.sendKeys("haydi");

    }

    @Then("Admin enters Vice Dean's Surname")
    public void admin_enters_vice_dean_s_surname() {
        WaitUtils.waitFor(1);
        viceDeanManagement.surName.sendKeys("soyle");

    }

    @Then("Admin enters Vice Dean's Birthplace")
    public void admin_enters_vice_dean_s_birthplace() {
        WaitUtils.waitFor(1);
        viceDeanManagement.birthPlace.sendKeys("NYC");
    }

    @Then("Admin clicks on Gender")
    public void adminClicksOnGender() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);
        viceDeanManagement.gender.click();
    }
    @Then("Admin enters Vice Dean's Date Of Birth as {string}")
    public void adminEntersViceDeanSDateOfBirthAs(String arg0) {
        viceDeanManagement.birthDay.sendKeys("01.01.1990");
    }

    @Then("Admin enters Vice Dean's Phone number")
    public void admin_enters_vice_dean_s_phone_number() {
        WaitUtils.waitFor(1);
        String phoneNumber = faker.phoneNumber().cellPhone();
        viceDeanManagement.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("Admin enters Vice Dean's SSN")
    public void adminEntersViceDeanSSSN() {
        WaitUtils.waitFor(1);
        String ssn = faker.idNumber().ssnValid();
        viceDeanManagement.SSN.sendKeys(ssn);
    }

    @Then("Admin enters Vice Dean's username \\(Cannot be left blank)")
    public void adminEntersViceDeanSUsernameCannotBeLeftBlank() {
        WaitUtils.waitFor(1);
        String username = faker.name().username();
        viceDeanManagement.userName.sendKeys(username);
    }


    @Then("Admin enters Vice Dean's password \\(Contains {int} character, uppercase, lowercase and number)")
    public void admin_enters_vice_dean_s_password_contains_character_uppercase_lowercase_and_number(Integer int1) {
        WaitUtils.waitFor(1);
        viceDeanManagement.password.sendKeys("Burhan2017");

    }
    @Then("Admin clicks on Submit button")
    public void admin_clicks_on_submit_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);
        viceDeanManagement.submitButton.click();

    }
    @Then("Admin sees Vice Dean is registered")
    public void admin_sees_vice_dean_is_registered() {
//        Assert.assertTrue("Vice Dean Saved",);
        ReusableMethods.verifyElementIsDisplayed(viceDeanManagement.viceDeanSaved);


    }


    @And("close the applications")
    public void closeTheApp() {
        WaitUtils.waitFor(3);
        Driver.closeDriver();
    }

    @Then("Admin enters Vice Dean's password \\(Does not contain {int} character, uppercase, lowercase and number)")
    public void adminEntersViceDeanSPasswordDoesNotContainCharacterUppercaseLowercaseAndNumber(int arg0) {
        WaitUtils.waitFor(1);
        viceDeanManagement.password.sendKeys("burhan2017");


    }

//    @And("Admin sees the {string} message")
//    public void adminSeesTheMessage(String Your_name_must_consist_of_the_characters) {
//        viceDeanManagement.blankNameAlert.isDisplayed();
//    }
}
