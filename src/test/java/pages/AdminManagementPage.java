package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminManagementPage {



    public AdminManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[6]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[text()='Admin deleted Successful']")
    public WebElement deletedSuccessfulMessage;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//a[.='Logout']")
    public WebElement logoutButton;
    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yesLogoutButton;
    @FindBy(xpath = "//button[.='Lessons']")
    public WebElement lessonsButton;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()= 'Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Admin Saved']")
    public WebElement adminSaved;


}

