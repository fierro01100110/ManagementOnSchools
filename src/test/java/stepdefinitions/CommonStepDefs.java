package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.MOSMainMenuPage;
import utilities.WaitUtils;

public class CommonStepDefs {
    MOSMainMenuPage mosMainMenuPage = new MOSMainMenuPage();



    @Given("click on the menu button")
    public void clickOnTheMenuButton() {
        mosMainMenuPage.menuButton.click();
        WaitUtils.waitFor(1);
    }


    @Given("click on Dean Management")
    public void click_on_dean_management() {
        mosMainMenuPage.deanManagement.click();
        WaitUtils.waitFor(2);
    }

}
