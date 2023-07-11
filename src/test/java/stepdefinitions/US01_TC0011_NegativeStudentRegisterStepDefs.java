package stepdefinitions;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0011_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String invalidSSN = "000/00/0000";

    @When("User enters an invalid SSN")
    public void user_enters_an_invalid_ssn() {
        register.ssn.sendKeys(invalidSSN);

    }

}
