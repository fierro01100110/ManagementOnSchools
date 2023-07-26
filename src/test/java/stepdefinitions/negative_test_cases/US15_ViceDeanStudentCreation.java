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


    @And("vice dean is not entering SSN respecting - after the third and fifth digits and consist of nine digits in total")
    public void viceDeanIsNotEnteringSSNRespectingAfterTheThirdAndFifthDigitsAndConsistOfNineDigitsInTotal() {
        studentManagement.ssn.sendKeys("555555555555555");
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

    @And("verify SSN pop-up after submitting")
    public void verifySSNPopUpAfterSubmitting() {
        studentManagement.submit.click();
        WaitUtils.waitFor(2);
        assertTrue(studentManagement.ssnPopUp.isDisplayed());

    }


    @And("verify user name required after submitting")
    public void verifyUserNameRequiredAfterSubmitting() {
        studentManagement.submit.click();
        assertTrue(studentManagement.requiredAlert.isDisplayed());
    }
}
