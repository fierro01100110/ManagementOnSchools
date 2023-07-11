package stepdefinitions;

import io.cucumber.java.en.When;
import pages.Register;

public class US01_TC005_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String name1 = "123&#$78";

    @When("User enters a surname with special characters or numbers")
    public void user_enters_a_surname_with_special_characters_or_numbers() {
        register.surname.sendKeys(name1);
    }
}
