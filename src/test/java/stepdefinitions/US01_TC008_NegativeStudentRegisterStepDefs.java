package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC008_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();
    String invalidPhone = faker.phoneNumber().cellPhone();

    @When("User enters an invalid phone number")
    public void user_enters_an_invalid_phone_number() {
        register.phoneNumber.sendKeys(invalidPhone);
    }
}
