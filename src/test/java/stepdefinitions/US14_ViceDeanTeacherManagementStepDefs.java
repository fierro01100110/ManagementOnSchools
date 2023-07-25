package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.AssertJUnit;
import org.testng.asserts.SoftAssert;
import pages.ViceDeanLogin;
import pages.ViceDeanManagementt;
import pages.ViceDeanTeacherManagement;
import utilities.*;

import static utilities.ReusableMethods.verifyElementIsDisplayed;

public class US14_ViceDeanTeacherManagementStepDefs {

    //HomePage homePage = new HomePage();
    ViceDeanLogin viceDeanLogin = new ViceDeanLogin();
    ViceDeanManagementt viceDeanManagement = new ViceDeanManagementt();
    ViceDeanTeacherManagement viceDeanTeacherManagement = new ViceDeanTeacherManagement();

    @Given("go to url")
    public void go_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
    }

    @Then("user log in as vice dean")
    public void user_log_in_as_vice_dean() {




            viceDeanLogin.login.click();
            WaitUtils.waitFor(3);
            viceDeanLogin.userName.sendKeys(ConfigReader.getProperty("feyza_vice_dean_userName"));
            viceDeanLogin.Password.sendKeys(ConfigReader.getProperty("feyza_vice_dean_Password"));
            viceDeanLogin.Login.click();
        }

        @Then("user clicks on the menu button")
        public void user_clicks_on_the_menu_button () {
            WaitUtils.waitFor(3);
            JSUtils.clickWithTimeoutByJS(viceDeanManagement.menu);
        }

        @Given("vice dean clicks on the teacher management")
        public void vice_dean_clicks_on_the_teacher_management () {
            WaitUtils.waitFor(3);
            JSUtils.clickWithTimeoutByJS(viceDeanManagement.teacherManagement);
        }

        @Then("verify vice dean is able to see teacher management page")
        public void verify_vice_dean_is_able_to_see_teacher_management_page () {
            WaitUtils.waitFor(3);
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(viceDeanManagement.teacherManagementText.isDisplayed());
            softAssert.assertAll();
            //ReusableMethods.verifyElementIsDisplayed(viceDeanManagement.teacherManagement);
            //Assert.assertTrue("teacher management is visible",true);


        }

        //TC_002
        @Then("verify vice dean is able to see the teacher information in the teacher list")
        public void verify_vice_dean_is_able_to_see_the_teacher_information_in_the_teacher_list () {
            WaitUtils.waitFor(3);
            JSUtils.scrollIntoViewJS(viceDeanManagement.teacherList);
            ReusableMethods.verifyElementIsDisplayed(viceDeanManagement.teacherList);
        }

        @Then("click on the edit button")
        public void click_on_the_edit_button () {
            WaitUtils.waitFor(3);
            //viceDeanTeacherManagement.editButton.click();
            //JSUtils.scrollAllTheWayDownJS();
            //JSUtils.getValueByJS("edit");
            JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.editButton);
        }

        @Then("verify vice dean is able to see the teacher information in the edit page")
        public void verify_vice_dean_is_able_to_see_the_teacher_information_in_the_edit_page () {
            WaitUtils.waitFor(3);
            verifyElementIsDisplayed(viceDeanTeacherManagement.editButton);
        }

        @Then("click on the choose lesson box to {string}")
        public void click_on_the_choose_lesson_box_to (String string){
            WaitUtils.waitFor(2);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.selectLesson);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.lessonDropdown);
            //viceDeanTeacherManagement.selectLesson.sendKeys(string);

            ReusableMethods.clickWithTimeOut(viceDeanTeacherManagement.lessonDropdown, 3);
            ReusableMethods.clickWithTimeOut(viceDeanTeacherManagement.selectLesson, 3);

            ReusableMethods.clickWithTimeOut(viceDeanTeacherManagement.lessonDropdown, 5);
            ReusableMethods.clickWithTimeOut(viceDeanTeacherManagement.selectLesson, 5);

        }

        @Then("click on the name box to update {string}")
        public void click_on_the_name_box_to_update (String string){
            WaitUtils.waitFor(3);
            JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.name);
            viceDeanTeacherManagement.name.sendKeys(string);

        }

        @Then("click on the surname  box to update {string}")
        public void click_on_the_surname_box_to_update (String string){
            WaitUtils.waitFor(3);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.surname);
            viceDeanTeacherManagement.surname.sendKeys(string);
        }

        @Then("click on the birth place  box to update {string}")
        public void click_on_the_birth_place_box_to_update (String birthPlace){
            WaitUtils.waitFor(3);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.birthPlace);
            viceDeanTeacherManagement.birthPlace.sendKeys(birthPlace);

        }

        @Then("click on the e-mail  box to update {string}")
        public void click_on_the_e_mail_box_to_update (String email){
            WaitUtils.waitFor(3);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.emailBox);
            //viceDeanTeacherManagement.email.click();
            viceDeanTeacherManagement.email.sendKeys(email);
        }

        @Then("click on the phone  box to update {string} number")
        public void click_on_the_phone_box_to_update_number (String phoneNumber){
            //WaitUtils.waitFor(3);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.phoneNumber);
            ReusableMethods.sendKeysWithTimeout(viceDeanTeacherManagement.phoneNumber, phoneNumber, 3);
            viceDeanTeacherManagement.phoneNumber.sendKeys(phoneNumber);
        }

        @Then("click on the ssn  box to update {string} number")
        public void click_on_the_ssn_box_to_update_number (String ssn){
            //WaitUtils.waitFor(3);
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.ssn);
            //ReusableMethods.waitForClickablility(viceDeanTeacherManagement.ssn,2);
            viceDeanTeacherManagement.ssn.sendKeys(ssn);
            ReusableMethods.sendKeysWithTimeout(viceDeanTeacherManagement.ssn, ssn, 3);
        }

        @Then("select the {string} teacher option")
        public void select_the_teacher_option (String string){
            //WaitUtils.waitFor(3);
            //ReusableMethods.selectCheckBox(viceDeanTeacherManagement.isAdvTeacher,true);
            ReusableMethods.waitForClickablility(viceDeanTeacherManagement.isAdvTeacher, 3);
            viceDeanTeacherManagement.isAdvTeacher.click();
        }

        @Then("select the gender option to update {string}")
        public void select_the_gender_option_to_update (String string){
            WaitUtils.waitFor(3);
            ReusableMethods.selectCheckBox(viceDeanTeacherManagement.male, true);
            ReusableMethods.waitForClickablility(viceDeanTeacherManagement.male, 3);
            viceDeanTeacherManagement.male.click();
            //ReusableMethods.selectCheckBox(viceDeanTeacherManagement.male,true);

        }

        @Then("click on the date of birth  box to update {string}")
        public void click_on_the_date_of_birth_box_to_update (String dateOfBirth){
            //WaitUtils.waitFor(3);
            //viceDeanTeacherManagement.dateOfBirth.click();
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.dateOfBirth);
            ReusableMethods.sendKeysWithTimeout(viceDeanTeacherManagement.dateOfBirth, dateOfBirth, 3);
            viceDeanTeacherManagement.dateOfBirth.sendKeys(dateOfBirth);
        }

        @Then("click on the user name  box to update {string}")
        public void click_on_the_user_name_box_to_update (String userName){
            //WaitUtils.waitFor(3);
            //viceDeanTeacherManagement.userName.click();
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.userName);
            ReusableMethods.sendKeysWithTimeout(viceDeanTeacherManagement.userName, userName, 3);
            viceDeanTeacherManagement.userName.sendKeys(userName);
        }

        @Then("click on the password  box to update {string}")
        public void click_on_the_password_box_to_update (String password){
            //WaitUtils.waitFor(3);
            //viceDeanTeacherManagement.password.click();
            //JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.password);
            ReusableMethods.sendKeysWithTimeout(viceDeanTeacherManagement.password, password, 3);
            viceDeanTeacherManagement.password.sendKeys(password);
        }

        @Then("click on the {string} button")
        public void click_on_the_button (String submitButton){
            WaitUtils.waitFor(3);
            //viceDeanTeacherManagement.submitButton.click();
            JSUtils.clickWithTimeoutByJS(viceDeanTeacherManagement.submitButton);
            //ReusableMethods.sendKeysWithTimeout(viceDeanTeacherManagement.submitButton,submitButton,3);
            //viceDeanTeacherManagement.submitButton.sendKeys(submitButton);

        }

        @Then("verify that the teacher updated successful message is displayed")
        public void verify_that_the_teacher_updated_successful_message_is_displayed () {
            WaitUtils.waitFor(3);
            String successfulMassage = viceDeanTeacherManagement.successfulMassage.getText();
            AssertJUnit.assertTrue(successfulMassage.contains("Teacher updated Successful"));
            //assertTrue(viceDeanTeacherManagement.successfulMassage.getText().contains("Teacher updated Successful"));
            //ReusableMethods.verifyElementIsDisplayed(viceDeanTeacherManagement.successfulMassage);
            //SoftAssert softAssert = new SoftAssert();
            //softAssert.assertTrue(viceDeanTeacherManagement.successfulMassage.isDisplayed(),"Teacher updated Successful");
            //softAssert.assertAll();


        }
    }