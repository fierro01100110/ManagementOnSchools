package stepdefinitions.negative_test_cases;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.StudentManagement;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US15_ViceDeanStudentCreation {

    StudentManagement studentManagement = new StudentManagement();
    @Then("vice dean does not enter a name")
    public void vice_dean_does_not_enter_a_name() {
        assertTrue(studentManagement.requiredAlert.isDisplayed()) ;
    }


    @Then("vice dean is not entering user name")
    public void vice_dean_is_not_entering_user_name() {
        assertTrue(studentManagement.requiredAlert.isDisplayed());
    }


    @And("verify name required after submitting")
    public void verifyNameRequiredAfterSubmitting() {
        studentManagement.submit.click();
        assertTrue(studentManagement.requiredAlert.isDisplayed()) ;
    }




    @And("verify user name required after submitting")
    public void verifyUserNameRequiredAfterSubmitting() {
        studentManagement.submit.click();
        assertTrue(studentManagement.requiredAlert.isDisplayed());
    }
}
