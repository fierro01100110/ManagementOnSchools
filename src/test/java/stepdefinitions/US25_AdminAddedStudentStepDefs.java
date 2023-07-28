package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.DeanManagement;
import pages.HomePage;
import pages.Login;
import pages.StudentManagement;
import utilities.*;

import static utilities.ReusableMethods.verifyElementIsDisplayed;

public class US25_AdminAddedStudentStepDefs {
    HomePage homePage = new HomePage();
    Login login = new Login();
    DeanManagement deanManagement = new DeanManagement();
    StudentManagement studentManagement =new StudentManagement();

    @Given("user goes to website url")
    public void user_goes_to_website_url() {


        Driver.getDriver().get(ConfigReader.getProperty("base_url"));

    }

    @Then("user logs in as admin on main page")
    public void user_logs_in_as_admin_on_main_page() {

        homePage.login.click();
        WaitUtils.waitFor(2);
        login.username.sendKeys(ConfigReader.getProperty("adminCreate_username"));
        login.password.sendKeys(ConfigReader.getProperty("adminCreate_password"));
        login.login.click();


    }

    @Given("admin clicks on menu button on main page")
    public void admin_clicks_on_menu_button_on_main_page() {

        JSUtils.clickWithTimeoutByJS(deanManagement.menu);
    }
    @When("admin clicks to student management")
    public void admin_clicks_to_student_management() {
        JSUtils.clickWithTimeoutByJS(studentManagement.studentManagementMenu);
    }
    @Then("verify admin is able see student submit button")
    public void verify_admin_is_able_see_student_submit_button() {

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(studentManagement.studentSubmit.isDisplayed(),"Fail there is no submit button");
        softAssert.assertAll();
        WaitUtils.waitFor(1);
    }
    @Then ("admin clicks on choose teacher menu")
    public void admin_clicks_on_choose_teacher_menu(){
        studentManagement.chooseTeacherMenu.click();
        WaitUtils.waitFor(1);
    }
    @Then ("admin clicks on advisor teacher murat")
    public void admin_clicks_on_advisor_teacher_murat(){
        studentManagement.advisorTeacherMurat.click();
        WaitUtils.waitFor(1);
    }

    @Then("admin enters student name")
    public void admin_enters_student_name() {
        studentManagement.studentName.sendKeys("Hasan");
        WaitUtils.waitFor(1);
    }

    @Then("admin enters student surname")
    public void admin_enters_student_surname(){
        studentManagement.studentSurname.sendKeys("Hocaoglu");
        WaitUtils.waitFor(1);
    }
    @And("admin enters student birthplace")
    public void admin_enters_student_birthplace(){
        studentManagement.studentBirthplace.sendKeys("Edmonton");
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student email")
    public void admin_enters_student_email(){
        studentManagement.studentEmail.sendKeys("hsn@gmail.com");
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student phone number")
    public void admin_enters_student_phone_number(){
        studentManagement.studentPhoneNumber.sendKeys("333-999-8888");
        WaitUtils.waitFor(1);
    }
    @And ("admin clicks on student gender male")
    public void admin_clicks_on_student_gender_male(){
        studentManagement.studentGenderMale.click();
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student birthday")
    public void admin_enters_student_birthday(){
        studentManagement.studentBirthday.sendKeys("001995-10-10");
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student ssn")
    public void admin_enters_student_ssn(){
        studentManagement.studentSsn.sendKeys("333-11-4444");
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student username")
    public void admin_enters_student_username(){
        studentManagement.studentUsername.sendKeys("hsnhoca");
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student father name")
    public void admin_enters_student_father_name(){
        studentManagement.studentFatherName.sendKeys("Mehmet");
        WaitUtils.waitFor(1);

    }
    @And ("admin enters student mother name")
    public void admin_enters_student_mother_name(){
        studentManagement.studentMotherName.sendKeys("Fatma");
        WaitUtils.waitFor(1);
    }
    @And ("admin enters student password")
    public void admin_enters_student_password(){
        studentManagement.studentPassword.sendKeys("87654321");
        WaitUtils.waitFor(1);
    }
    @And ("admin clicks on student submit button")
    public void admin_clicks_on_student_submit_button(){
        studentManagement.studentSubmit.click();
        WaitUtils.waitFor(1);
    }
    @And ("admin sees student saved")
    public void admin_sees_student_saved(){
        ReusableMethods.waitForVisibility(studentManagement.studentSaved,2000);
        verifyElementIsDisplayed(studentManagement.studentSaved);
    }





}
