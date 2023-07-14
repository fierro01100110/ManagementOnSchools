package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.GuestUserPage;
import pages.Login;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US02_UI_Test_StepDefs {

    Login login = new Login();
    GuestUserPage guestUserPage= new GuestUserPage();




    @When("user clicks on log in icon")
    public void user_clicks_on_log_in_icon() {

        guestUserPage.clickLogin.click();

    }


    @When("user enters User Name")
    public void user_enters_user_name() {
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("admin_username"));

    }


    @When("user enters Password")
    public void user_enters_password() {

        login.password.sendKeys(ConfigReader.getProperty("admin_password"));
    }


    @When("user clicks on log in button")
    public void user_clicks_on_log_in_button() {
        WaitUtils.waitFor(2);

        login.login.click();
    }


    @When("user clicks on menu button")
    public void user_clicks_on_menu_button() {
        guestUserPage.clickMenu.click();

    }


    @When("user clicks on Guest User link")
    public void user_clicks_on_guest_user_link() {
        WaitUtils.waitFor(2);
        guestUserPage.guestUser.click();

    }


    @Then("user verify the name header")
    public void user_verify_the_name_header() {
        WaitUtils.waitFor(2);
        // String nameHeader = guestUserPage.nameHeader.getText();
        // assertTrue(nameHeader.contains("Name"));
        ReusableMethods.verifyElementIsDisplayed(guestUserPage.nameHeader);

    }


    @Then("user verify the phone number header")
    public void user_verify_the_phone_number_header() {
        WaitUtils.waitFor(2);
        // String phoneNumberHeader = guestUserPage.phoneNumberHeader.getText();
        // assertTrue(phoneNumberHeader.contains("Phone Number"));
        ReusableMethods.verifyElementIsDisplayed(guestUserPage.phoneNumberHeader);

    }


    @Then("user verify the ssn number header")
    public void user_verify_the_ssn_number_header() {
        WaitUtils.waitFor(2);
        //  String ssnHeader = guestUserPage.ssnHeader.getText();
        //  assertTrue(ssnHeader.contains("Ssn"));

        ReusableMethods.verifyElementIsDisplayed(guestUserPage.ssnHeader);

    }


    @Then("user verify the user name header")
    public void user_verify_the_user_name_header() {
        WaitUtils.waitFor(2);
        // String userNameHeader = menuPage.userNameHeader.getText();
        // assertTrue(userNameHeader.contains("User Name"));
        ReusableMethods.verifyElementIsDisplayed(guestUserPage.userNameHeader);

    }

    @Then("user verify the guest user list")
    public void userVerifyTheGuestUserList() {

        for (int i=1; i<6; i++) {
            ReusableMethods.verifyElementIsDisplayed(Driver.getDriver().findElement(By.xpath("//tbody/tr["+i+"]")));
        }
    }


    @Then("user clicks on delete button")
    public void user_clicks_on_delete_button() {
        WaitUtils.waitFor(2);
        guestUserPage.deleteGuestUser.click();
    }


    @Then("user assert alert message")
    public void user_assert_alert_message() {
        WaitUtils.waitFor(5);
        String alert = guestUserPage.deletedAlert.getText();
        assertTrue(alert.contains("Guest User deleted Successful"));
    }


    @Then("user close the app")
    public void user_close_the_app() {
        WaitUtils.waitFor(2);
        Driver.closeDriver();

    }


}
