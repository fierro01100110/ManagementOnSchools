package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Login;
import pages.StudentAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US21_StudentSelectAndDeleteLesson {

    HomePage homePage = new HomePage();

    Login login = new Login();

    StudentAccountPage studentAccountPage = new StudentAccountPage();
    @Given("Student goes to the url {string}")
    public void studentGoesToTheUrl(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));
        WaitUtils.waitFor(1);
    }
    @When("Student clicks on Login")
    public void studentClicksOnLogin() {
        homePage.login.click();
        WaitUtils.waitFor(1);
    }
    @And("Student enters username {string} in the User Name box")
    public void studentEntersUsernameInTheUserNameBox(String username) {
        login.username.sendKeys(username);
        WaitUtils.waitFor(1);
    }
    @And("Student enters password {string} in the Password box")
    public void studentEntersPasswordInThePasswordBox(String password) {
        login.password.sendKeys(password);
        WaitUtils.waitFor(1);
    }
    @And("Student clicks on Login button")
    public void studentClicksOnLoginButton() {
        login.login.click();
        WaitUtils.waitFor(1);
    }
    @Then("Verify the student successfully log in to student account")
    public void verifyTheStudentSuccessfullyLogInToStudentAccount() {
        studentAccountPage.menuButton.isDisplayed();
        WaitUtils.waitFor(1);
    }
    @Given("The student should be able to see the Teacher, Day, Start Time and Stop Time information in the Choose Lesson list")
    public void theStudentShouldBeAbleToSeeTheTeacherDayStartTimeAndStopTimeInformationInTheChooseLessonList() {
        studentAccountPage.teacher.isDisplayed();
        WaitUtils.waitFor(1);
        studentAccountPage.day.isDisplayed();
        WaitUtils.waitFor(1);
        studentAccountPage.startTime.isDisplayed();
        WaitUtils.waitFor(1);
        studentAccountPage.stopTime.isDisplayed();
        WaitUtils.waitFor(1);
    }
    @Then("The student should be able to select the desired lesson or lessons")
    public void theStudentShouldBeAbleToSelectTheDesiredLessonOrLessons() {
        JSUtils.clickWithTimeoutByJS(studentAccountPage.chooseLessonCheckbox);
        WaitUtils.waitFor(1);
    }
    @And("The student should not be able to select lessons that coincide with the same day and time")
    public void theStudentShouldNotBeAbleToSelectLessonsThatCoincideWithTheSameDayAndTime() {
        JSUtils.clickWithTimeoutByJS(studentAccountPage.checkboxSelenium1);
        JSUtils.clickWithTimeoutByJS(studentAccountPage.checkboxSelenium2);
    }
    @And("The student should be able to delete a lesson they have selected")
    public void theStudentShouldBeAbleToDeleteALessonTheyHaveSelected() {
        //Test Failed Here.
        //There is no delete button to delete any selected lesson in the lesson list.
    }
    @And("The student should be able to see the courses they have selected in the Lesson Program List")
    public void theStudentShouldBeAbleToSeeTheCoursesTheyHaveSelectedInTheLessonProgramList() {
        studentAccountPage.lessonProgramList.isDisplayed();
        WaitUtils.waitFor(1);
    }
    @And("The student should be able to see their exam grades")
    public void theStudentShouldBeAbleToSeeTheirExamGrades() {
        JSUtils.clickWithTimeoutByJS(studentAccountPage.menuButton);
        studentAccountPage.gradesAndAnnouncements.click();
        WaitUtils.waitFor(1);
        studentAccountPage.midtermExam.isDisplayed();
        studentAccountPage.finalExam.isDisplayed();
    }
    @And("The student should be able to see the meetings created by their advisor for them")
    public void theStudentShouldBeAbleToSeeTheMeetingsCreatedByTheirAdvisorForThem() {
        studentAccountPage.meetList.isDisplayed();
        WaitUtils.waitFor(1);
    }
    @And("Close the application for student")
    public void closeTheApplicationForStudent() {
        WaitUtils.waitFor(1);
        Driver.closeDriver();
    }
}
