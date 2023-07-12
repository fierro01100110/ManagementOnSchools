package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagement {
    public ViceDeanManagement(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Main Menu Link
    @FindBy(id = "offcanvasNavbarLabel-expand-lg")
    public WebElement mainMenu;

    //Teacher Management Link
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;

}
