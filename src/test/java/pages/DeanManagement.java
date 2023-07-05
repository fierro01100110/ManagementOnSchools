package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagement {
    public DeanManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Menu button
    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
    public WebElement menu;


    //Contact Get All
    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAll;
}
