package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.Login;
import pages.ViceDeanLessons;
import utilities.*;



public class US_09_ViceDeanLessonsListStepDefs {

    HomePage homePage = new HomePage();
    Login login = new Login();
    ViceDeanLessons viceDeanLessons=new ViceDeanLessons();
    Faker faker=new Faker();


    @Then("user logs in vice dean")
    public void user_logs_in_vice_dean() {
        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("garip_vice_dean_username"));
        login.password.sendKeys(ConfigReader.getProperty("garip_vice_dean_password"));
        login.login.click();

    }
    @Then("vice dean clicks Lessons button")
    public void vice_dean_clicks_lessons_button() {
        viceDeanLessons.lessons.click();

    }

    @Then("vice dean enter Lesson Name")
    public void vice_dean_enter_lesson_name() {
        String lesson_name=faker.job().field();
        viceDeanLessons.lesson_name.sendKeys(lesson_name);

    }
    @Then("vice dean clicks Compulsory")
    public void vice_dean_clicks_compulsory() {
        viceDeanLessons.compulsory_check.click();

    }
    @Then("vice dean enter Credit Score")
    public void vice_dean_enter_credit_score() {
        String credit_score=faker.number().digits(2);
        viceDeanLessons.credit_score.sendKeys(credit_score);

    }
    @Then("vice dean clicks Submit button")
    public void vice_dean_clicks_submit_button() {
        viceDeanLessons.submit_button.click();

    }
    @Then("vice dean should be able to see {string} message")
    public void vice_dean_should_be_able_to_see_message(String message) {
        WaitUtils.waitFor(1);

        Assert.assertEquals(message,viceDeanLessons.success_message.getText());

    }

    @When("vice dean clicks the last page of Lesson List")
    public void vice_dean_clicks_the_last_page_of_lesson_list() {
       WaitUtils.waitFor(2);
       JSUtils.clickWithTimeoutByJS(viceDeanLessons.last_page_button);

    }
    @Then("vice Dean click Delete button")
    public void vice_dean_click_delete_button() {
//     List<WebElement>lessonElements= Driver.getDriver().findElements(By.xpath("(//*[@class='table table-striped table-bordered table-hover'])[2]//tr//td[1]"));
//     ArrayList lessons=new ArrayList();
//
//        for (WebElement lessonElement : lessonElements ) {
//            lessons.add(lessonElement.getText());
//
//        }
//        for (Object lessonName:lessons) {
//            System.out.println(lessonName);
//
//        }
//        String table=viceDeanLessons.table.getText();
//        System.out.println(table);

        WaitUtils.waitFor(2);
       JSUtils.clickWithTimeoutByJS(viceDeanLessons.deleteButtons);

    }
    @Then("Verify the {string} message")
    public void verify_the_message(String string) {
        WaitUtils.waitFor(2);
        ReusableMethods.verifyElementIsDisplayed(viceDeanLessons.deleteMessage);
    }

}
