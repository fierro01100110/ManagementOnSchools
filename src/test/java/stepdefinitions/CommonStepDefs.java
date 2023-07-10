package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.MainMenuPage;
import utilities.WaitUtils;

public class CommonStepDefs {
    MainMenuPage mainMenuPage = new MainMenuPage();




    @Given("click on the menu button")
    public void clickOnTheMenuButton() {
        mainMenuPage.menuButton.click();
        WaitUtils.waitFor(1);
    }


    @Given("click on Dean Management")
    public void click_on_dean_management() {
        mainMenuPage.deanManagement.click();
        WaitUtils.waitFor(2);
    }

}
