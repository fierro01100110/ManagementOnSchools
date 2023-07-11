package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0016_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();
    String fakePasswordWithoutDigit = faker.internet().password(8,10,true,false,false);

    @When("User enters a password without a digit")
    public void user_enters_a_password_without_a_digit() {
        register.password.sendKeys(fakePasswordWithoutDigit);

    }
}
