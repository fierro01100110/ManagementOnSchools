package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ContactHomePage;
import pages.ContactMessagePage;
import utilities.Driver;
import utilities.FakerUtils;
import utilities.ReusableMethods;


import static org.junit.Assert.assertTrue;

public class US03_UI_test_with_Faker {
    static Faker faker = new Faker();

    ContactHomePage contactHomePage =new ContactHomePage();
    ContactMessagePage contactMessagePage=new ContactMessagePage();

    public static String sendSuccesfull;
    @Given("user goes to home page {string}")
    public void userGoesToHomePage(String url) {
        Driver.getDriver().get(url);
    }
//    @Given("user goes to home page {string}")
//    public void user_goes_to_home_page(String url) {
//        Driver.getDriver().get(url);
//    }
    @Given("user clicks Contact button")
    public void user_clicks_contact_button() {
        ReusableMethods.clickWithTimeOut(contactHomePage.contactButton,3);
    }
    @Given("user enters a fakeName")
    public void user_enters_a_fake_name() {
        contactMessagePage.yourNameBox.sendKeys(FakerUtils.nameFaker());
    }
    @Given("user enters an email")
    public void user_enters_an_email() {
        contactMessagePage.emailBox.sendKeys(FakerUtils.emailFaker());
    }
    @Given("user enters a subject")
    public void user_enters_a_subject() {
        contactMessagePage.subjectBox.sendKeys(FakerUtils.subjectFaker());
    }

    @Given("user enters a message")
    public void user_enters_a_message() {
        contactMessagePage.messageBox.sendKeys(FakerUtils.messageFaker());
    }
    @Given("user clicks on Send Message button")
    public void user_clicks_on_send_message_button() {
        ReusableMethods.clickWithTimeOut(contactMessagePage.sendMessageButton,3);
    }
    @Then("assert alert message on contact page")
    public void assert_alert_message_on_contact_page() {
        String alertText= contactMessagePage.sendAlert.getText();
        assertTrue(alertText.contains("Contact Message Created Successfully"));
    }
    @Then("close the app")
    public void close_the_app() {

    }

    @Given("user enters a fakeName")
    public void user_enters_a_fake_Tname() {
        contactMessagePage.yourNameBox.sendKeys(FakerUtils.nameFaker());
    }
    @Given("user enters an fakeEmail")
    public void user_enters_an_fake_email() {
        contactMessagePage.emailBox.sendKeys(FakerUtils.emailFaker());
    }
    @Given("user enters a fakeSubject")
    public void user_enters_a_fake_subject() {
        contactMessagePage.subjectBox.sendKeys(FakerUtils.subjectFaker());
    }

    @Given("user enters a fakeMessage")
    public void user_enters_a_fake_message() {
        ReusableMethods.clickWithTimeOut(contactMessagePage.sendMessageButton,3);
    }






}
