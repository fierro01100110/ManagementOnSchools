package stepdefinitions.US01_student_register_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0014_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    Faker faker = new Faker();
    String fakePasswordWithoutUppercase = faker.internet().password(8,10,false,false,true);

    @When("User enters a password without an uppercase letter")
    public void user_enters_a_password_without_an_uppercase_letter() {
        register.password.sendKeys(fakePasswordWithoutUppercase);

    }
}
