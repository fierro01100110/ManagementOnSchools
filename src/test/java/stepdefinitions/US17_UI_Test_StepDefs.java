package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.StudentInfoManagement;
import utilities.*;

import static org.junit.Assert.assertTrue;

public class US17_UI_Test_StepDefs {

    StudentInfoManagement studentInfoManagement= new StudentInfoManagement();

    static Faker faker = new Faker();
    public static String fakeAbsencees = faker.number().numberBetween(0, 10)+"";
    public static String fakeMidtermExam = faker.number().numberBetween(0, 100)+"";
   public static String fakeFinalExam = faker.number().numberBetween(0, 100)+"";
   public static String fakeInfoNote = faker.regexify("[a-zA-Z]{10,}");


   public static  String stdName;
   public static  String lessonName;
   public static  String termName;


//   Select select = new Select(studentInfoManagement.clickOnTerm);
//  public String randomTerm=    ReusableMethods.selectRandomTextFromDropdown(select).getText();



    @Given("user navigates to the url")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get(ConfigReader.getProperty("base_url"));


    }
    @When("user clicks on log in on home page")
    public void user_clicks_on_log_in_on_home_page() {
        studentInfoManagement.loginIcon.click();

    }


    @And("user enters a user name {string}")
    public void userEntersAUserName(String userName) {
        WaitUtils.waitFor(2);
        studentInfoManagement.username.sendKeys(userName);
    }




    @And("user enters password {string}")
    public void userEntersPassword(String psw) {
        WaitUtils.waitFor(2);
        studentInfoManagement.password.sendKeys((psw));

    }



    @When("user clicks on log in")
    public void user_clicks_on_log_in() {
        WaitUtils.waitFor(2);
        studentInfoManagement.login.click();


    }
    @Given("user clicks on menu")
    public void user_clicks_on_menu() {
        WaitUtils.waitFor(2);
        studentInfoManagement.menu.click();

    }
    @When("user clicks on Student Info Management")
    public void user_clicks_on_student_info_management() {
        WaitUtils.waitFor(2);
        studentInfoManagement.studentInfoMng.click();

    }



    @When("user choose a lesson on Student Info Management")
    public void user_choose_a_lesson_on_student_info_management() {
    //    ReusableMethods.selectByVisibleText(studentInfoManagement.lesson, "ppppp");
        Select select = new Select(studentInfoManagement.lesson);
        lessonName = ReusableMethods.selectRandomTextFromDropdown(select).getText();
        System.out.println("lessonName =" + lessonName);


    }
    @When("user choose a student name on Student Info Management")
    public void user_choose_a_student_name_on_student_info_management() {
      //  ReusableMethods.selectByVisibleText(studentInfoManagement.studentName, "Student Murat");
        Select select = new Select(studentInfoManagement.studentName);
        stdName =  ReusableMethods.selectRandomTextFromDropdown(select).getText();
        System.out.println("stdName = " + stdName);
    }
    @When("user choose a education term on Student Info Management")
    public void user_choose_a_education_term_on_student_info_management() {
      //  ReusableMethods.selectByVisibleText(studentInfoManagement.clickOnTerm, "SPRING_SEMESTER");
        Select select = new Select(studentInfoManagement.clickOnTerm);
        termName = ReusableMethods.selectRandomTextFromDropdown(select).getText();
        System.out.println("termName = " + termName);


    }
    @When("user enters absences on Student Info Management")
    public void user_enters_absences_on_student_info_management() {
      // ReusableMethods.sendKeysWithTimeout(studentInfoManagement.absentee, fakeAbsencees);
        WaitUtils.waitFor(3);
        studentInfoManagement.absentee.sendKeys(fakeAbsencees);

    }
    @When("user enters midterm exam on Student Info Management")
    public void user_enters_midterm_exam_on_student_info_management() {
        WaitUtils.waitFor(2);
        studentInfoManagement.midtermExam.sendKeys(fakeMidtermExam);

    }
    @When("user enters final exam on Student Info Management")
    public void user_enters_final_exam_on_student_info_management() {
        WaitUtils.waitFor(2);
        studentInfoManagement.finalExam.sendKeys(fakeFinalExam);

    }
    @When("user enters info note on Student Info Management")
    public void user_enters_info_note_on_student_info_management() {
        WaitUtils.waitFor(2);
        studentInfoManagement.infoNote.sendKeys(fakeInfoNote);

    }
    @When("user clicks submit button on Student Info Management")
    public void user_clicks_submit_button_on_student_info_management() {
        ReusableMethods.clickWithTimeOut(studentInfoManagement.submit, 2);
    }

    @Then("verify student info is visible on the student info list")
    public void verify_student_info_is_visible_on_the_student_info_list() {
        WaitUtils.waitFor(2);
      String alert = studentInfoManagement.studentInfoSuccessAlert.getText();
      assertTrue(alert.contains("Student Info saved Successfully"));

    }



//    @When("user choose a lesson {string}")
//    public void user_choose_a_lesson(String lesson) {
//
//        WaitUtils.waitFor(3);
//        //new Select(studentInfoManagement.lesson).selectByVisibleText(lesson);
//       // studentInfoManagement.lesson.click();
//       // studentInfoManagement.java.click();
//
//        ReusableMethods.selectByVisibleText(studentInfoManagement.lesson, "JavaScript");
//
//    }
//    @When("user choose a student name {string}")
//    public void user_choose_a_student_name(String stdName) {
//        //WaitUtils.waitFor(2);
//       // new Select(studentInfoManagement.studentName).selectByVisibleText(stdName);
//
//        ReusableMethods.selectByVisibleText(studentInfoManagement.studentName, "Student Murat");
//    }
//    @When("user choose a education term {string}")
//    public void user_choose_a_education_term(String term) {
//        WaitUtils.waitFor(2);
//       // new Select(studentInfoManagement.term).selectByVisibleText(term);
//       // studentInfoManagement.clickOnTerm.click();
//       // studentInfoManagement.chooseTerm.click();
//
//        ReusableMethods.selectByVisibleText(studentInfoManagement.clickOnTerm, "SPRING_SEMESTER");
//
//    }
//    @When("user enters absences {string}")
//    public void user_enters_absences(String absentee) {
//        WaitUtils.waitFor(2);
//        studentInfoManagement.absentee.sendKeys(absentee);
//
//
//
//    }
//    @When("user enters midterm exam {string}")
//    public void user_enters_midterm_exam(String midTerm) {
//        WaitUtils.waitFor(2);
//        studentInfoManagement.midtermExam.sendKeys(midTerm);
//    }
//
//
//    @When("user enters final exam {string}")
//    public void user_enters_final_exam(String finalExam) {
//        studentInfoManagement.finalExam.sendKeys(finalExam);
//
//    }
//    @When("user enters info note {string}")
//    public void user_enters_info_note(String infoNote) {
//        studentInfoManagement.infoNote.sendKeys(infoNote);
//
//    }
//
//
//    @When("user clicks submit button")
//    public void user_clicks_submit_button() {
//        ReusableMethods.clickWithTimeOut(studentInfoManagement.submit, 2);
//
//    }
//    @Then("verify student info is visible on the student info list")
//    public void verify_student_info_is_visible_on_the_student_info_list() {
//
//
//    }
//
//
//   /* @Then("close the app")
//    public void close_the_app() {
//
//    }*/
//


}
