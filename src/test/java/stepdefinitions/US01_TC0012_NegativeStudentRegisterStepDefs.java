package stepdefinitions;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC0012_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String emptyUsername = "";

    @When("User enters an empty username")
    public void user_enters_an_empty_username() {
        register.username.sendKeys(emptyUsername);

    }

}
