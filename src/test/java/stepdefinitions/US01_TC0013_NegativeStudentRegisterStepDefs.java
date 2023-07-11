package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0013_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();

    int invalidPasswordLength = faker.number().numberBetween(1,8);

    @When("User enters a password with less than {int} characters")
    public void user_enters_a_password_with_less_than_characters(Integer int1) {

        register.password.sendKeys(invalidPasswordLength + "");
    }
}
