package stepdefinitions.US01_student_register_step_defs;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC007_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String emptyPhoneNumber = "";

    @When("User enters an empty phone number")
    public void user_enters_an_empty_phone_number() {
        register.phoneNumber.sendKeys(emptyPhoneNumber);
    }
}
