package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Register;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import static org.testng.Assert.assertTrue;
import static utilities.ReusableMethods.verifyElementIsDisplayed;

public class US01_TC001_StudentRegisterStepDefs {
    HomePage homePage = new HomePage();
    Register register = new Register();
    static Faker faker = new Faker();

    public static String name(){
        Faker faker = new Faker();
        String name =faker.name().firstName();
        return name;
    }

    public static String surname(){
        Faker faker = new Faker();
        String surname = faker.name().lastName();
        return surname;
    }

    public static String birthPlace(){
        Faker faker = new Faker();
        String birthPlace = faker.country().capital();
        return birthPlace;
    }

    public static String phoneNumber(){
        Faker faker = new Faker();
        String phoneNumber = faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(999, 10000);
        return phoneNumber;
    }

    public static String gender(){
        Register register = new Register();
        String gender = String.valueOf(register.genderFemale);
        return gender;
    }

    public static String birthDate(){
        Register register = new Register();
        String birthDate = String.valueOf(register.birthDate);
        return birthDate;
    }

    public static String ssn(){
        Faker faker = new Faker();
        String ssn = faker.idNumber().ssnValid();
        return ssn;
    }

    public static String username(){
        Faker faker = new Faker();
        String username = faker.name().username();
        return username;
    }

    public static String password(){
        String password = faker.internet().password(8,10,true,false,true);
        return password;
    }



    String fakeName = faker.name().firstName();
    String fakeSurname = faker.name().lastName();
    String fakeBirthPlace = faker.country().capital();
    String fakePhone = faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(99, 1000) + "-" + faker.number().numberBetween(999, 10000);
    String fakeBirthDate = faker.date().birthday().toString();
    String fakeSSN = faker.idNumber().ssnValid();
    String fakeUserName = faker.name().username();
    String fakePassword = faker.internet().password(8,10,true,false,true);


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
    }

    @When("User enters their date of birth")
    public void user_enters_their_date_of_birth() {
        WaitUtils.waitFor(4);
        register.birthDate.sendKeys("12-02-1998");
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