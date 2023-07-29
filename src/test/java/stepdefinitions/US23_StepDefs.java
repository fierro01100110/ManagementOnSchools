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

public class US23_StepDefs {

    Login login = new Login();
    ViceDeanManagement viceDeanManagement = new ViceDeanManagement();
    Faker faker = new Faker();


    @Given("user Admin should navigates to login url")
    public void userAdminShouldNavigatesToLoginUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("login_url"));
    }

    @When("user Admin should login in as admin")
    public void userAdminShouldLoginInAsAdmin() {
        login.username.sendKeys(ConfigReader.getProperty("adminCreate_username"));
        login.password.sendKeys(ConfigReader.getProperty("adminCreate_password"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);

        login.login.click();


    }

    @Then("Admin Go to Menu button")
    public void admin_click_on_menu_button() {
        JSUtils.clickWithTimeoutByJS(viceDeanManagement.menu);


    }

    @Then("Admin Click on Vice Dean Management")
    public void admin_click_on_vice_dean_management() {
        WaitUtils.waitFor(1);
        viceDeanManagement.viceDManagment.click();


    }

    @Then("Admin should enter Vice Dean's Name")
    public void admin_should_enters_vice_dean_s_name() {
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);
        viceDeanManagement.name.sendKeys("haydi");

    }

    @Then("Admin should enters Vice Dean's Surname")
    public void admin_enters_vice_dean_s_surname() {
        WaitUtils.waitFor(1);
        viceDeanManagement.surName.sendKeys("soyle");

    }

    @Then("Admin should enters Vice Dean's Birthplace")
    public void admin_enters_vice_dean_s_birthplace() {
        WaitUtils.waitFor(1);
        viceDeanManagement.birthPlace.sendKeys("NYC");
    }

    @Then("Admin should clicks on Gender")
    public void adminClicksOnGender() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);
        viceDeanManagement.gender.click();
    }
    @Then("Admin should enters Vice Dean's Date Of Birth as {string}")
    public void adminEntersViceDeanSDateOfBirthAs(String arg0) {
        viceDeanManagement.birthDay.sendKeys("01.01.1990");
    }

    @Then("Admin should enters Vice Dean's Phone number")
    public void admin_enters_vice_dean_s_phone_number() {
        WaitUtils.waitFor(1);
        String phoneNumber = faker.phoneNumber().cellPhone();
        viceDeanManagement.phoneNumber.sendKeys(phoneNumber);
    }

    @Then("Admin should enters Vice Dean's SSN")
    public void adminEntersViceDeanSSSN() {
        WaitUtils.waitFor(1);
        String ssn = faker.idNumber().ssnValid();
        viceDeanManagement.SSN.sendKeys(ssn);
    }

    @Then("Admin should enters Vice Dean's username \\(Cannot be left blank)")
    public void adminEntersViceDeanSUsernameCannotBeLeftBlank() {
        WaitUtils.waitFor(1);
        String username = faker.name().username();
        viceDeanManagement.userName.sendKeys(username);
    }


    @Then("Admin should enters Vice Dean's password \\(Contains {int} character, uppercase, lowercase and number)")
    public void admin_enters_vice_dean_s_password_contains_character_uppercase_lowercase_and_number(Integer int1) {
        WaitUtils.waitFor(1);
        viceDeanManagement.password.sendKeys("Burhan2017");

    }
    @Then("Admin should clicks on Submit button")
    public void admin_clicks_on_submit_button() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 250)");
        WaitUtils.waitFor(1);
        viceDeanManagement.submitButton.click();

    }
    @Then("Admin should sees Vice Dean is registered")
    public void admin_sees_vice_dean_is_registered() {
//        Assert.assertTrue("Vice Dean Saved",);
        ReusableMethods.verifyElementIsDisplayed(viceDeanManagement.viceDeanSaved);

    }

    @And("should close the applications")
    public void closeTheApp() {
        WaitUtils.waitFor(3);
        Driver.closeDriver();
    }

    @Then("Admin should enters Vice Dean's Surname and left blank")
    public void adminShouldEntersViceDeanSSurnameAndLeftBlank() {
        viceDeanManagement.surName.sendKeys(" ");
    }
}
