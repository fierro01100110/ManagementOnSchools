package stepdefinitions;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC004_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String emptySurname = "";


    @When("User enters empty surname")
    public void user_enters_empty_surname() {
        register.surname.sendKeys(emptySurname);
    }

}
