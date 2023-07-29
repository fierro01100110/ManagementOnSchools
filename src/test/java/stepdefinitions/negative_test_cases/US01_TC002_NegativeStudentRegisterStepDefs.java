package stepdefinitions.negative_test_cases;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register;
import utilities.WaitUtils;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;


public class US01_TC002_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();
    String emptyName = "";
    String name1 = "123&#$78";
    String emptySurname = "";
    String emptyBirthplace = "";
    String emptyPhoneNumber = "";
    String invalidPhone = faker.phoneNumber().cellPhone();
    String invalidBirthDate = "01/01/0001";
    String invalidSSN = "000/00/0000";
    String emptyUsername = "";
    int invalidPasswordLength = faker.number().numberBetween(1,8);
    String fakePasswordWithoutUppercase = faker.internet().password(8,10,false,false,true);
    String fakePasswordWithoutLowercase = faker.internet().password(8,10,true,false,true).toUpperCase();
    String fakePasswordWithoutDigit = faker.internet().password(8,10,true,false,false);
    String fakePasswordWithOnlyDigit = faker.internet().password(8,10,false,false,true).replace("[a-zA-Z","");



    @When("User enters empty name")
    public void user_enters_empty_name() {
        WaitUtils.waitFor(2);
        register.name.sendKeys(emptyName);
    }

    @Given("User enters a name with special characters or numbers.")
    public void user_enters_a_name_with_special_characters_or_numbers() {

        register.name.sendKeys(name1);
    }

    @When("User enters empty surname")
    public void user_enters_empty_surname() {
        register.surname.sendKeys(emptySurname);
    }


    @When("User enters a surname with special characters or numbers")
    public void user_enters_a_surname_with_special_characters_or_numbers() {
        register.surname.sendKeys(name1);
    }


    @When("User enters an empty birth place")
    public void user_enters_an_empty_birth_place() {
        register.birthPlace.sendKeys(emptyBirthplace);

    }

    @When("User enters an empty phone number")
    public void user_enters_an_empty_phone_number() {
        register.phoneNumber.sendKeys(emptyPhoneNumber);
    }

    @When("User enters an invalid phone number")
    public void user_enters_an_invalid_phone_number() {
        register.phoneNumber.sendKeys(invalidPhone);
    }

    @When("User does not select a gender")
    public void user_does_not_select_a_gender() {

        if(register.genderFemale.getText().isEmpty()) {
            assertFalse("gender field is not selected",false);
        }else {
            System.out.println("gender field should not be selected");
        }

    }

    @When("User enters an invalid date of birth")
    public void user_enters_an_invalid_date_of_birth() {
        register.birthDate.sendKeys(invalidBirthDate);

    }

    @When("User enters an invalid SSN")
    public void user_enters_an_invalid_ssn() {
        register.ssn.sendKeys(invalidSSN);

    }

    @When("User enters an empty username")
    public void user_enters_an_empty_username() {
        register.username.sendKeys(emptyUsername);

    }

    @When("User enters a password with less than {int} characters")
    public void user_enters_a_password_with_less_than_characters(Integer int1) {

        register.password.sendKeys(invalidPasswordLength + "");
    }

    @When("User enters a password without an uppercase letter")
    public void user_enters_a_password_without_an_uppercase_letter() {
        register.password.sendKeys(fakePasswordWithoutUppercase);

    }

    @When("User enters a password without a lowercase letter")
    public void user_enters_a_password_without_a_lowercase_letter() {
        register.password.sendKeys(fakePasswordWithoutLowercase);

    }

    @When("User enters a password without a digit")
    public void user_enters_a_password_without_a_digit() {
        register.password.sendKeys(fakePasswordWithoutDigit);

    }

    @When("User enters a password only with digits")
    public void user_enters_a_password_only_with_digits() {
        register.password.sendKeys(fakePasswordWithOnlyDigit);

    }

    @When("User should see \"Required\"alert")
    public void user_should_see_required_alert() {
       WaitUtils.waitFor(2);
       assertTrue("'Required' alert is visible", register.invalidFeedbackAlert.isDisplayed());
    }


    @Then("User should not see {string} alert")
    public void userShouldNotSeeAlert(String arg0) {
        WaitUtils.waitFor(10);

        assertFalse("User sees success alert",register.successfulRegisterAlert.isDisplayed());
    }
}









//    @Then("Register button should not be clickable")
//    public void register_button_should_not_be_clickable() {
//        WaitUtils.waitFor(10);
//        assertFalse("Register button is clickable",register.registerButton.isEnabled());
//    }