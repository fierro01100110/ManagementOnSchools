package stepdefinitions.US01_student_register_step_defs;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0010_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String invalidBirthDate = "01/01/0001";

    @When("User enters an invalid date of birth")
    public void user_enters_an_invalid_date_of_birth() {
        register.birthDate.sendKeys(invalidBirthDate);

    }
}
