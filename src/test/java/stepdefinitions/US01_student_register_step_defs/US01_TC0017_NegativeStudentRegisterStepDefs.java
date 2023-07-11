package stepdefinitions.US01_student_register_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0017_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();
    String fakePasswordWithOnlyDigit = faker.internet().password(8,10,false,false,true).replace("[a-zA-Z","");

    @When("User enters a password only with digits")
    public void user_enters_a_password_only_with_digits() {
        register.password.sendKeys(fakePasswordWithOnlyDigit);

    }

}
