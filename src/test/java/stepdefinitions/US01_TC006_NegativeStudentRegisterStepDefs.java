package stepdefinitions;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC006_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String emptyBirthplace = "";

    @When("User enters an empty birth place")
    public void user_enters_an_empty_birth_place() {
        register.birthPlace.sendKeys(emptyBirthplace);

    }

}
