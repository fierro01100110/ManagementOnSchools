package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
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
    public static String email = faker.internet().emailAddress();
    public static String phoneNumber = faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(999, 10000);
    public static String dateOfBirth = "06181998";
    public static String fakeSSN = faker.idNumber().ssnValid();
    public static String userName = faker.name().username();
    public static  String fatherName = faker.name().firstName();
    public static String motherName = faker.name().firstName();
    public static String fakePassword = faker.internet().password(8,10,true,false,true);



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

        studentManagement.email.sendKeys(email);
        String expectedData = JSUtils.getValueByJS("email");
        assertEquals(expectedData,email);

    }
    @Then("enter phone number")
    public void enter_phone_number() {
        studentManagement.phoneNumber.sendKeys(phoneNumber);
        String expectedData = JSUtils.getValueByJS("phoneNumber");
        assertEquals(expectedData,phoneNumber);

    }
    @Then("select gender")
    public void select_gender() {
        JSUtils.clickWithTimeoutByJS(studentManagement.female);
        JSUtils.clickWithTimeoutByJS(studentManagement.maleGender);
    }
    @Then("select date of birth")
    public void select_date_of_birth() {

        studentManagement.bDay.sendKeys(dateOfBirth);

    }

    @And("enter SSN respecting - after the {int}rd and {int}th digits and consist of {int} digits in total")
    public void enterSSNRespectingAfterTheRdAndThDigitsAndConsistOfDigitsInTotal(int arg0, int arg1, int arg2) {
        studentManagement.ssn.sendKeys(fakeSSN);
        String expectedData = JSUtils.getValueByJS("ssn");
        assertEquals(expectedData,fakeSSN);
    }
    @Then("enter user name")
    public void enter_user_name() {
        WaitUtils.waitFor(1);
        studentManagement.username.sendKeys(userName);
        String expectedData = JSUtils.getValueByJS("username");
        assertEquals(expectedData,userName);
    }
    @Then("enter father name")
    public void enter_father_name() {
        WaitUtils.waitFor(1);
        studentManagement.fatherName.sendKeys(fatherName);
        String expectedData = JSUtils.getValueByJS("fatherName");
        assertEquals(expectedData,fatherName);
    }
    @Then("enter mother name")
    public void enter_mother_name() {
        WaitUtils.waitFor(1);
        studentManagement.motherName.sendKeys(motherName);
        String expectedData = JSUtils.getValueByJS("motherName");
        assertEquals(expectedData,motherName);
    }
    @Then("enter password respecting password credentials")
    public void enter_password_respecting_password_credentials() {
        WaitUtils.waitFor(1);
        studentManagement.password.sendKeys(fakePassword);
        String expectedData = JSUtils.getValueByJS("password");
        assertEquals(expectedData,fakePassword);
    }
    @Then("verify student number automatically appear after submitting")
    public void verify_student_number_automatically_appear_after_submitting() {
        studentManagement.submit.click();
        WaitUtils.waitFor(2);
        assertTrue(studentManagement.success.isDisplayed());

        JSUtils.clickWithTimeoutByJS(studentManagement.lastPage);
        WaitUtils.waitFor(1);
        assertTrue(studentManagement.studentNumber.isDisplayed());

        WaitUtils.waitFor(1);

        //Checking if registered name exists on table UI
        WebElement textName = Driver.getDriver().findElement(By.xpath("//tbody/tr[last()]//td[2]"));
        assertTrue(textName.getText().contains(name));

    }



}
