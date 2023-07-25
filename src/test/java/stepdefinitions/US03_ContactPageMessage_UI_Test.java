package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ContactHomePage;
import pages.ContactMessagePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US03_ContactPageMessage_UI_Test {
    ContactHomePage contactHomePage =new ContactHomePage();
    ContactMessagePage contactMessagePage=new ContactMessagePage();
    public static String sendSuccesfull;

    // Scenario:TC_001 view the student info list as a teacher
@Given("user goes to home page {string}")
public void userGoesToHomePage(String url) {

    Driver.getDriver().get(url);
}
    @Given("user clicks Contact button")
    public void user_clicks_contact_button() {
        //managementHomePage.contactButton.click();
        ReusableMethods.clickWithTimeOut(contactHomePage.contactButton,3);
    }

    @Given("user enters a name {string}")
    public void user_enters_a_name(String name) {
        //managementContactPage.yourNameBox.sendKeys(ConfigReader.getProperty());
        contactMessagePage.yourNameBox.sendKeys(name);

    }
    @Given("user enters an email {string}")
    public void user_enters_an_email(String email) {
        contactMessagePage.emailBox.sendKeys(email);

    }
    @Given("user enters a subject {string}")
    public void user_enters_a_subject(String subject) {
        contactMessagePage.subjectBox.sendKeys(subject);

    }
    @Given("user enters a message {string}")
    public void user_enters_a_message(String message) {
        contactMessagePage.messageBox.sendKeys(message);

    }
    @Given("user clicks on Send Message button")
    public void user_clicks_on_send_message_button() {
        ReusableMethods.clickWithTimeOut(contactMessagePage.sendMessageButton,3);
    }

    @Then("assert alert message on contact page")
    public void assertAlertMessageOnContactPage() {
        WaitUtils.waitFor(1);
        String alertText= contactMessagePage.sendAlert.getText();
        assertTrue(alertText.contains("Contact Message Created Successfully"));

    }

    @And("close the app")
    public void closeTheApp() {
        WaitUtils.waitFor(3);
      //  Driver.closeDriver();
    }



}
