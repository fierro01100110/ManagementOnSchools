package stepdefinitions;


import io.cucumber.java.en.Given;
import pages.Register;

public class US01_TC003_NegativeStudentRegisterStepDefs {

    Register register = new Register();
    String name1 = "123&#$78";

    @Given("User enters a name with special characters or numbers.")
    public void user_enters_a_name_with_special_characters_or_numbers() {

        register.name.sendKeys(name1);
    }

}
