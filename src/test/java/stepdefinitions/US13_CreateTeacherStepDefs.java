package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.*;

import static org.testng.AssertJUnit.assertTrue;

public class US13_CreateTeacherStepDefs {
    HomePage homePage = new HomePage();
    Login login = new Login();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    ViceDeanManagement viceDeanManagement = new ViceDeanManagement();
    TeacherManagement teacherManagement = new TeacherManagement();
    Faker faker = new Faker();
    @Given("User goes to the url {string}")
    public void userGoesToTheUrl(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
    }
    @When("User clicks on Login")
    public void userClicksOnLogin() {
        homePage.login.click();
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the User Name box")
    public void userEntersInTheUserNameBox(String username) {
        login.username.sendKeys(username);
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the Password box")
    public void userEntersInThePasswordBox(String password) {
        login.password.sendKeys(password);
        WaitUtils.waitFor(1);
    }
    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        login.login.click();
        WaitUtils.waitFor(1);
    }
    @Then("Verify the user successfully log in to vice dean account")
    public void verifyTheUserSuccessfullyLogInToViceDeanAccount() {
        adminManagementPage.menuButton.isDisplayed();
        WaitUtils.waitFor(1);
    }
    @Given("User clicks on Menu button")
    public void userClicksOnMenuButton() {
        JSUtils.clickWithTimeoutByJS(adminManagementPage.menuButton);
    }
    @Then("User should be able to see Main Menu on the left side")
    public void userShouldBeAbleToSeeMainMenuOnTheLeftSide() {
        viceDeanManagement.mainMenu.isDisplayed();
        WaitUtils.waitFor(1);
    }
    @When("User clicks on Teacher Management link")
    public void userClicksOnTeacherManagementLink() {
        viceDeanManagement.teacherManagement.click();
        WaitUtils.waitFor(1);
    }
    @And("User selects a {string} in the Select lesson dropdown")
    public void userSelectsAInTheSelectLessonDropdown(String lesson) {
        // In this step test is passing, but we can't see any lesson name choosing in the choose lesson dropdown menu.
        // There is no select tag, visible text, value or index in the html code, because of this reason, select option doesn't work in this step.
        // Tried to execute test with some different methods, but it is impossible to take locator for any lesson selecting. This step needs code improvement.
        JSUtils.clickWithTimeoutByJS(teacherManagement.lessonDropDown);
        JSUtils.clickWithTimeoutByJS(teacherManagement.selectLesson);
    }
    @And("User enters a {string} in the Name box")
    public void userEntersAInTheNameBox(String name) {
        String firstname = faker.name().firstName();
        teacherManagement.name.sendKeys(firstname);
        WaitUtils.waitFor(1);
    }
    @And("User enters a {string} in the Surname box")
    public void userEntersAInTheSurnameBox(String surname) {
        String lastname = faker.name().lastName();
        teacherManagement.surname.sendKeys(lastname);
        WaitUtils.waitFor(1);
    }
    @And("User enters a {string} in the Birth Place box")
    public void userEntersAInTheBirthPlaceBox(String birthPlace) {
        String birthplace = faker.address().city();
        teacherManagement.birthPlace.sendKeys(birthplace);
        WaitUtils.waitFor(1);
    }
    @And("User enters an {string} in the Email box")
    public void userEntersAnInTheEmailBox(String email) {
        String emailAddress = faker.internet().emailAddress();
        teacherManagement.email.sendKeys(emailAddress);
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the Phone box")
    public void userEntersInThePhoneBox(String phoneNumber) {
        teacherManagement.phoneNumber.sendKeys(phoneNumber);
        WaitUtils.waitFor(1);
    }
    @And("User selects on the Is Advisor Teacher checkbox if the teacher has an advisory role")
    public void userSelectsOnTheIsAdvisorTeacherCheckboxIfTheTeacherHasAnAdvisoryRole() {
        ReusableMethods.selectCheckBox(teacherManagement.isAdvisorTeacherCheckBox, true);
        WaitUtils.waitFor(1);
    }
    @And("User selects on the gender option checkbox")
    public void userSelectsOnTheGenderOptionCheckbox() {
        ReusableMethods.selectCheckBox(teacherManagement.femaleCheckBox,true);
        WaitUtils.waitFor(1);
        ReusableMethods.selectCheckBox(teacherManagement.maleCheckBox,true);
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the Date Of Birth box")
    public void userEntersInTheDateOfBirthBox(String dateOfBirth) {
        teacherManagement.birthDay.sendKeys(dateOfBirth);
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the Ssn box")
    public void userEntersInTheSsnBox(String ssnNumber) {
        teacherManagement.ssnNumber.sendKeys(ssnNumber);
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the User Name Box")
    public void userEntersUsernameInTheUserNameBox(String username) {
        String fakeUsername = faker.name().username();
        teacherManagement.teacherUsername.sendKeys(fakeUsername);
        WaitUtils.waitFor(1);
    }
    @And("User enters {string} in the Password Box")
    public void userEntersPasswordInThePasswordBox(String password) {
        teacherManagement.teacherPassword.sendKeys(password);
        WaitUtils.waitFor(1);
    }
    @And("User clicks on Submit button")
    public void userClicksOnSubmitButton() {
        JSUtils.clickWithTimeoutByJS(teacherManagement.submitButton);
        WaitUtils.waitFor(1);
    }
    @Then("Verify the user sees the Teacher Saved Successfully message")
    public void verifyTheUserSeesTheTeacherSavedSuccessfullyMessage() {
        WaitUtils.waitFor(3);
        String alertText = teacherManagement.alertText.getText();
        assertTrue(alertText.contains("Teacher saved successfully"));
    }
    @And("Close the application")
    public void closeTheApplication() {
        WaitUtils.waitFor(3);
        Driver.closeDriver();
    }
}
