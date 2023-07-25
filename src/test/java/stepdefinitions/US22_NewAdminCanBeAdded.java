package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminManagementPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.util.Random;

public class US22_NewAdminCanBeAdded {

    public static void main(String[] args) {

        // 
        
    }

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    Faker faker = new Faker();



    @Given("user enters a new admin name")
    public void user_enters_a_new_admin_name() {
        WaitUtils.waitFor(1);
        adminManagementPage.name.sendKeys(faker.name().firstName());
    }
    @Given("user enters a new admin surname")
    public void user_enters_a_new_admin_surname() {
        WaitUtils.waitFor(1);
        adminManagementPage.surname.sendKeys(faker.name().lastName());
    }
    @Given("user enters a new admin birth place")
    public void user_enters_a_new_admin_birth_place() {
        WaitUtils.waitFor(1);
       adminManagementPage.birthPlace.sendKeys(faker.country().capital());
    }
    @Given("user enters a new admin phone number")
    public void user_enters_a_new_admin_phone_number() {
        WaitUtils.waitFor(1);
        adminManagementPage.phoneNumber.sendKeys(ReusableMethods.phoneNumberGenerator());
    }
    @Given("user chooses a new admin gender")
    public void user_chooses_a_new_admin_gender() {
        WaitUtils.waitFor(1);
        adminManagementPage.maleGender.click();
    }
    @Given("user enters a new admin date of birth")
    public void user_enters_a_new_admin_date_of_birth() {
        WaitUtils.waitFor(1);
        adminManagementPage.birthDay.sendKeys("01/01/2001");
    }
    
    @Given("user enters a new admin ssn")
    public void user_enters_a_new_admin_ssn() {
        WaitUtils.waitFor(1);
        adminManagementPage.ssn.sendKeys(ReusableMethods.ssnGenerator());
    }
    @Given("user enters a new admin username")
    public void user_enters_a_new_admin_username() {
        WaitUtils.waitFor(1);
        adminManagementPage.username.sendKeys(faker.name().firstName() + "1567");
    }
    @Given("user enters a new admin password")
    public void user_enters_a_new_admin_password() {
        WaitUtils.waitFor(1);
        adminManagementPage.password.sendKeys(faker.idNumber().toString());
    }
    @And("user clicks on submit button on admin management")
    public void userClicksOnSubmitButtonOnAdminManagement() {
        WaitUtils.waitFor(1);
        adminManagementPage.submitButton.click();
    }
    @Then("Verify new Admin account is created")
    public void verify_new_admin_account_is_created() {
        ReusableMethods.waitForVisibility(adminManagementPage.adminSaved,2000);
        ReusableMethods.verifyElementIsDisplayed(adminManagementPage.adminSaved);
    }


}
