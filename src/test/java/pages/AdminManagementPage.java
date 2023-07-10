package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {

    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//i[@class='fa-solid fa-trash'])[6]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[text()='Admin deleted Successful']")
    public WebElement deletedSuccessfulMessage;
}
