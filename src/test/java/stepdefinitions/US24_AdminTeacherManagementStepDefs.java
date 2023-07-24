package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.*;
import java.io.IOException;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class US24_AdminTeacherManagementStepDefs {
    TeacherManagement teacherManagement = new TeacherManagement();
    MainMenu mainMenu = new MainMenu();

    //TC_001_Sign in as Admin


    //TC_002_Admin should be able to add Teacher
    @When("Admin clicks on the Teacher Management link")
    public void admin_clicks_on_the_teacher_management_link() {
        JSUtils.scrollIntoViewJS(mainMenu.teacherManagementLink);
        mainMenu.teacherManagementLink.click();
        WaitUtils.waitFor(2);
    }

    @Then("Admin chooses a lesson {string}")
    public void admin_chooses_a_lesson(String lesson) {
//        JSUtils.clickWithTimeoutByJS(teacherManagement.selectLesson);
//        teacherManagement.selenium.click();
//        WaitUtils.waitFor(2);
    }

    @Then("Admin enters a name {string}")
    public void admin_enters_a_name(String name) {
        teacherManagement.name.sendKeys(name);
    }

    @Then("Admin enters a surname {string}")
    public void admin_enters_a_surname(String surname) {
        teacherManagement.surname.sendKeys(surname);
    }

    @Then("Admin enters a birth place {string}")
    public void admin_enters_a_birth_place(String birth_place) {
        teacherManagement.birthPlace.sendKeys(birth_place);
    }

    @Then("Admin enters an email {string}")
    public void admin_enters_an_email(String email) {
        teacherManagement.email.sendKeys(email);
    }

    @Then("Admin enters phone_number {string}")
    public void admin_enters_phone_number(String phone_number) {
        teacherManagement.phoneNumber.sendKeys(phone_number);
    }

    @Then("Admin selects on the Advisor Teacher checkbox if the teacher has an advisory role")
    public void admin_selects_on_the_advisor_teacher_checkbox_if_the_teacher_has_an_advisory_role() {
        ReusableMethods.selectCheckBox(teacherManagement.isAdvisorTeacherCheckBox, true);
        WaitUtils.waitFor(1);
    }

    @Then("Admin selects an gender {string} option checkbox")
    public void admin_selects_an_gender_option_checkbox(String gender) {
        ReusableMethods.selectCheckBox(teacherManagement.maleCheckBox,true);
        WaitUtils.waitFor(1);
    }

    @Then("Admin enters Date Of Birth {string}")
    public void admin_enters_date_of_birth(String date_of_birth) {
        teacherManagement.birthDay.sendKeys(date_of_birth);
        WaitUtils.waitFor(1);
    }

    @Then("Admin enters ssn number in {string}")
    public void admin_enters_ssn_number_in(String ssn) {
        teacherManagement.ssnNumber.sendKeys(ssn);
        WaitUtils.waitFor(1);
    }

    @Then("Admin enters username {string}")
    public void admin_enters_username(String username) {
        teacherManagement.teacherUsername.sendKeys(username);
        WaitUtils.waitFor(1);
    }

    @Then("Admin enters password {string}")
    public void admin_enters_password(String password) {
        teacherManagement.teacherPassword.sendKeys(password);
        WaitUtils.waitFor(1);
    }

    @Then("Admin clicks on Submit")
    public void admin_clicks_on_submit() {
        JSUtils.clickWithTimeoutByJS(teacherManagement.submitButton);
        WaitUtils.waitFor(1);
    }

    @Then("verify the Admin sees the Teacher Saved Successfully message")
    public void verify_the_admin_sees_the_teacher_saved_successfully_message() {
        WaitUtils.waitFor(3);
        String alertText = teacherManagement.alertText.getText();
        assertTrue(alertText.contains("Teacher saved successfully"));
    }
}



