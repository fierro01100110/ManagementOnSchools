package stepdefinitions.negative_test_cases;

import io.cucumber.java.en.Then;
import pages.ContactMessagePage;

import static org.junit.Assert.assertTrue;

public class US03_User_can_not_send_message {

  ContactMessagePage contactMessagePage=new ContactMessagePage();

    @Then("assert warning appears as warning")
    public void assertWarningAppearsAsWarning() {
    assertTrue(contactMessagePage.nameIsMissingAlert.isDisplayed());
    }
}
