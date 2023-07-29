package stepdefinitions;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DeanManagement;
import pages.ViceDeanContactPage;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US16_Contact_Get_All_Menu_Ui_StepDefs {
    ViceDeanContactPage viceDeanContactPage=new ViceDeanContactPage();
    DeanManagement deanManagement = new DeanManagement();

    @Then("vice dean clicks on menu button")
    public void vice_dean_clicks_on_menu_button() {
        JSUtils.clickWithTimeoutByJS(deanManagement.menu);

    }
    @Then("vice dean clicks to contact get all link")
    public void vice_dean_clicks_to_contact_get_all_link() {
        JSUtils.clickWithTimeoutByJS(deanManagement.contactGetAll);
    }
    @Then("vice dean verify the name {string}")
    public void vice_dean_verify_the_name(String name) {
        WaitUtils.waitFor(2);

        Assert.assertEquals(name,viceDeanContactPage.name.getText());
    }
    @Then("vice dean verify the email {string}")
    public void vice_dean_verify_the_email(String email) {
        Assert.assertEquals(email,viceDeanContactPage.email.getText());
    }
    @Then("vice dean verify the subject {string}")
    public void vice_dean_verify_the_subject(String subject) {
        Assert.assertEquals(subject,viceDeanContactPage.subject.getText());
     }
    @Then("vice dean verify the date {string}")
    public void vice_dean_verify_the_date(String date) {

        Assert.assertEquals(date,viceDeanContactPage.date.getText());
    }
    @Then("vice dean verify the message {string}")
    public void vice_dean_verify_the_message(String message) {
        Assert.assertEquals(message,viceDeanContactPage.message.getText());

    }

}
