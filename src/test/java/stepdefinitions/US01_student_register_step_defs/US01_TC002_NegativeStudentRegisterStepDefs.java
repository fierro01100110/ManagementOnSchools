package stepdefinitions.US01_student_register_step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register;
import utilities.WaitUtils;

import static org.testng.AssertJUnit.assertFalse;


public class US01_TC002_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String emptyName = "";

    @When("User enters empty name")
    public void user_enters_empty_name() {
        WaitUtils.waitFor(2);
        register.name.sendKeys(emptyName);
    }


    @Then("Register button should not be clickable")
    public void register_button_should_not_be_clickable() {
        WaitUtils.waitFor(10);
      assertFalse("Register button is clickable",register.registerButton.isEnabled());
    }
}
