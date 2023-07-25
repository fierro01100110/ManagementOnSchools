package stepdefinitions.negative_test_cases;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.DeanManagement;
import pages.HomePage;
import pages.Login;
import utilities.*;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static utilities.ReusableMethods.*;

public class US04_AdminAddedDeanNegativeStepDefs {
    HomePage homePage = new HomePage();
    Login login = new Login();
    DeanManagement deanManagement = new DeanManagement();

    @Given("user enter to url")
    public void user_enter_to_url() {


        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

    }

    @Then("user sign in as admin")
    public void user_sign_in_as_admin() {

        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("adminCreate_username"));
        login.password.sendKeys(ConfigReader.getProperty("adminCreate_password"));
        login.login.click();


    }

    @Given("admin clicks on the menu button")
    public void admin_clicks_on_the_menu_button() {

        JSUtils.clickWithTimeoutByJS(deanManagement.menu);


    }

    @When("admin clicks to the dean management")
    public void admin_clicks_to_the_dean_management() {
        JSUtils.clickWithTimeoutByJS(deanManagement.deanManagementMenu);
    }


    @Then("admin enters dean name as blank")
    public void admin_enters_dean_name() {
        deanManagement.deanName.sendKeys("");
        assertTrue(deanManagement.deanNameRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean surname as blank")
    public void admin_enters_dean_surname() {
        deanManagement.deanSurname.sendKeys("");
        assertTrue(deanManagement.deanSurnameRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean birthplace as blank")
    public void admin_enters_dean_birthplace() {
        deanManagement.deanBirthday.sendKeys("");
        assertTrue(deanManagement.deanBirthPlaceRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean date of birth as blank")
    public void admin_enters_dean_birthday() {
        deanManagement.deanBirthday.sendKeys("");
        assertTrue(deanManagement.deanBirthdayRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean phone number as blank")
    public void admin_enters_dean_phone_number() {
        deanManagement.deanPhoneNumber.sendKeys("");
        assertTrue(deanManagement.deanPhoneNumberRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean ssn as blank")
    public void admin_enters_dean_ssn() {
        deanManagement.deanSsn.sendKeys("");
        assertTrue(deanManagement.deanSsnRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean username as blank")
    public void admin_enters_dean_username() {
        deanManagement.deanUsername.sendKeys("");
        assertTrue(deanManagement.deanUsernameRequiredWarning.isDisplayed());
    }

    @Then("admin enters dean password as blank")
    public void admin_enters_dean_password() {
        deanManagement.deanPassword.sendKeys("");
        assertTrue(deanManagement.deanPasswordRequiredWarning.isDisplayed());
    }




        }




