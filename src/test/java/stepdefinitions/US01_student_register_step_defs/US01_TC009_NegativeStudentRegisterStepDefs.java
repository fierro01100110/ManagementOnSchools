package stepdefinitions.US01_student_register_step_defs;

import io.cucumber.java.en.When;
import pages.Register;

import static org.testng.AssertJUnit.assertFalse;

public class US01_TC009_NegativeStudentRegisterStepDefs {
     Register register = new Register();

    @When("User does not select a gender")
    public void user_does_not_select_a_gender() {

       if(register.genderFemale.getText().isEmpty()) {
           assertFalse("gender field is not selected",false);
       }else {
           System.out.println("gender field should not be selected");
       }

    }

}
