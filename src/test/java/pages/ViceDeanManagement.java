package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagement {

    public ViceDeanManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //To click "Menu" button
    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
    public WebElement menu;

    //Lesson Management Option
    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagement;



}
