package stepdefinitions.us01_package;



import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Register;

import utilities.JSUtils;
import utilities.WaitUtils;

import static org.testng.Assert.assertTrue;
import static utilities.ReusableMethods.verifyElementIsDisplayed;

public class US01_TC001_StudentRegisterStepDefs {


    HomePage homePage = new HomePage();
    Register register = new Register();
    static Faker faker = new Faker();


    public static String fakeName = faker.name().firstName();
    public static String fakeSurname = faker.name().lastName();
    public static String fakeBirthPlace = faker.country().capital();
    public static String fakePhone = faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(999, 10000);
    public static String fakeBirthDate = "12-02-1998";       // faker.date().birthday().toString();
    public static String fakeGender;
    public static String fakeSSN = faker.idNumber().ssnValid();
    public static String fakeUserName = faker.name().username();
    public static String fakePassword = faker.internet().password(8,10,true,false,true);




    @Then("user clicks on register")
    public void user_clicks_on_register() {
        homePage.register.click();
    }

    @Given("User is on registration page")
    public void user_is_on_registration_page() {
       verifyElementIsDisplayed(register.registerPage);
    }

    @When("User enters name")
    public void user_enters_name() {
        WaitUtils.waitFor(2);
        register.name.sendKeys(fakeName);
        System.out.println("fakeName = " + fakeName);
    }

    @When("name must contain any character and cannot be left blank")
    public void name_must_contain_any_character_and_cannot_be_left_blank() {
        assertTrue(fakeName != null && !fakeName.isEmpty(), "Name must contain any character");

    }

    @When("User enters surname")
    public void user_enters_surname() {
        WaitUtils.waitFor(2);
        register.surname.sendKeys(fakeSurname);

    }
    @When("Surname must contain any character and cannot be left blank")
    public void surname_must_contain_any_character_and_cannot_be_left_blank() {
        assertTrue(fakeSurname != null && !fakeName.isEmpty(), "Surname must contain any character" );

    }
    @When("User enters their birth place")
    public void user_enters_their_birth_place() {
        WaitUtils.waitFor(2);
        register.birthPlace.sendKeys(fakeBirthPlace);

    }
    @When("Birth place must contain any character and cannot be left blank")
    public void birth_place_must_contain_any_character_and_cannot_be_left_blank() {
        assertTrue(fakeBirthPlace != null && !fakeBirthPlace.isEmpty(), "Birth Place must contain any character");
    }

    @When("User enters their phone number")
    public void user_enters_their_phone_number() {
        WaitUtils.waitFor(2);
        register.phoneNumber.sendKeys(fakePhone);
    }

    @When("User selects their gender")
    public void user_selects_their_gender() {
        WaitUtils.waitFor(2);
        register.genderFemale.click();

         fakeGender = register.genderFemale.getText();

    }



    @When("User enters their date of birth")
    public void user_enters_their_date_of_birth() {
        WaitUtils.waitFor(4);
        register.birthDate.sendKeys(fakeBirthDate);
    }

    @When("User enters SSN")
    public void user_enters_ssn() {
        WaitUtils.waitFor(2);
        register.ssn.sendKeys(fakeSSN);
    }

    @And("SSN; must contain ‘-’ after the {int}rd and {int}th digits and consist of {int} digits")
    public void ssnMustContainAfterTheRdAndThDigitsAndConsistOfDigits(int arg0, int arg1, int arg2) {
        WaitUtils.waitFor(2);
        int minLengthSSN = 9;
        int ssnLength = fakeSSN.replace("-","").trim().length();
        assert ssnLength == minLengthSSN : "SSN does not consist of 9 digits " + minLengthSSN;
        assertTrue(fakeSSN.matches("\\d{3}-\\d{2}-\\d{4}"));
    }

    @When("User enters User Name")
    public void user_enters_user_name() {
        WaitUtils.waitFor(4);
        register.username.sendKeys(fakeUserName);
        System.out.println("fakeUserName = " + fakeUserName);
    }

    @When("User enters their password")
    public void user_enters_their_password() {
        WaitUtils.waitFor(2);
        register.password.sendKeys(fakePassword);
        System.out.println("fakePassword = " + fakePassword);
    }

    @When("Password must consist of at least {int} characters")
    public void password_must_consist_of_at_least_characters(Integer int1) {
        WaitUtils.waitFor(2);
        int minLengthPassword = 8;
        int passwordLength = fakePassword.length();
        assert passwordLength >= minLengthPassword : "Password does not meet the minimum length requirement of " + minLengthPassword;
    }

    @When("Password must contain at least one uppercase letter, one lowercase letter and one digit")
    public void password_must_contain_at_least_one_uppercase_letter_one_lowercase_letter_and_one_digit() {
        WaitUtils.waitFor(2);
        assert fakePassword.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+") : "Password does not match with the requirements";
    }

    @When("User clicks on register button")
    public void user_clicks_on_register_button() {
        JSUtils.clickWithTimeoutByJS(register.registerButton);
    }

    @Then("User should see {string} alert")
    public void user_should_see_alert(String string) {
        WaitUtils.waitFor(2);
        register.successfulRegisterAlert.isDisplayed();
    }

}


