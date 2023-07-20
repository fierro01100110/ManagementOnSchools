package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainMenu {
    public MainMenu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // lesson management page
    @FindBy(partialLinkText = "Lesson Management")
    public WebElement lessonManagementPage;



    @FindBy(linkText = "(//div[text()='Main Menu'])[2]")
    public WebElement mainMenuLink;
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagementLink;


}
