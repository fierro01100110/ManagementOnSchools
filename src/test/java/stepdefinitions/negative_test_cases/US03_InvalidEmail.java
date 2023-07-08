package stepdefinitions.negative_test_cases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ContactMessagePage;

import static org.junit.Assert.assertTrue;

public class US03_InvalidEmail {
    ContactMessagePage contactMessagePage =new ContactMessagePage();
    @Then("assert invalid email error message")
    public void assert_invalid_email_error_message() {
  assertTrue(contactMessagePage.invalidEmailErrorMessage.isDisplayed());
    }

    @And("user enters an invalid email {string}")
    public void userEntersAnInvalidEmail(String email) {
        contactMessagePage.emailBox.sendKeys(email);
    }
}
