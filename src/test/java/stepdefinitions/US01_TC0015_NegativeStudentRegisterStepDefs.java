package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0015_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();
    String fakePasswordWithoutLowercase = faker.internet().password(8,10,true,false,true).toUpperCase();

    @When("User enters a password without an lowercase letter")
    public void user_enters_a_password_without_an_lowercase_letter() {
        register.password.sendKeys(fakePasswordWithoutLowercase);

    }

}
