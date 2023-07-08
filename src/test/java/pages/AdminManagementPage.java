package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {
    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yesLogoutButton;
    @FindBy(xpath = "//button[.='Lessons']")
    public WebElement lessonsButton;
}