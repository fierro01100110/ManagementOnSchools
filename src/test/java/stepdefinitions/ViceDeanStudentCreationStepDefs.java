package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DeanManagement;
import pages.HomePage;
import pages.Login;
import pages.StudentManagement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ViceDeanStudentCreationStepDefs {

    HomePage homePage = new HomePage();
    Login login = new Login();
    DeanManagement deanManagement = new DeanManagement();
    StudentManagement studentManagement = new StudentManagement();
    public static Faker faker = new Faker();
   public static String name = faker.name().firstName();
   public static String lastName = faker.name().lastName();
    public static String birthPlace= faker.country().capital();



    @Then("user logins as malcom_vice dean")
    public void user_logins_as_vice_dean() {
        homePage.login.click();
        login.username.sendKeys(ConfigReader.getProperty("malcom_vice_dean_username"));
        login.password.sendKeys(ConfigReader.getProperty("malcom_vice_dean_password"));
        login.login.click();

    }

    @Given("vice dean navigates to menu")
    public void vice_dean_navigates_to_menu() {
        JSUtils.clickWithTimeoutByJS(deanManagement.menu);
    }
    @Then("vice dean clicks to student management")
    public void vice_dean_clicks_to_student_management() {
        JSUtils.clickWithTimeoutByJS(studentManagement.studentManagement);

    }
    @Then("choose advisor teacher")
    public void choose_advisor_teacher() throws Exception {
        JSUtils.clickWithTimeoutByJS(studentManagement.teacher);
        WaitUtils.waitFor(2);
        Select select = new Select(studentManagement.teacher);
        List<WebElement> allOptions = select.getOptions();
        for (WebElement w : allOptions){
            System.out.println(w.getText());
        }
        select.selectByValue("5");

    }
    @Then("enter name")
    public void enter_name() throws InterruptedException {

        studentManagement.name.sendKeys(name);

        String expectedData = JSUtils.getValueByJS("name");

        assertEquals(expectedData,name);
    }
    @Then("enter surname")
    public void enter_surname() throws InterruptedException {

        studentManagement.surname.sendKeys(lastName);
        String expectedData = JSUtils.getValueByJS("surname");
        assertEquals(expectedData,lastName);
    }
    @Then("enter birth place")
    public void enter_birth_place() {

        studentManagement.birthPlace.sendKeys(birthPlace);
        String expectedData = JSUtils.getValueByJS("birthPlace");
        assertEquals(expectedData,birthPlace);
    }
    @Then("enter email")
    public void enter_email() {

    }
    @Then("enter phone number")
    public void enter_phone_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("select gender")
    public void select_gender() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("select date of birth")
    public void select_date_of_birth() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("enter SSN respecting {string} after the 3rd and 5th digits and consist of {int} digits in total")
    public void enter_ssn_respecting_after_the_3rd_and_5th_digits_and_consist_of_digits_in_total(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("enter user name")
    public void enter_user_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("enter father name")
    public void enter_father_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("enter mother name")
    public void enter_mother_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("enter password respecting password credentials")
    public void enter_password_respecting_password_credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify student number automatically appear after submitting")
    public void verify_student_number_automatically_appear_after_submitting() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
