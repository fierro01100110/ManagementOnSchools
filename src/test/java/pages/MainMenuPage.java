package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainMenuPage {
    public MainMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler']")
    public WebElement menuButton;


    @FindBy(xpath = "//a[.='Dean Management']")
    public WebElement deanManagement;

    @FindBy(xpath = "//a[.='Admin Management']")
    public WebElement adminManagement;


    @FindBy(xpath = "//th[.='Name']")
    public WebElement name;

    @FindBy(xpath = "//th[.='Gender']")
    public WebElement gender;

    @FindBy(xpath = "//th[.='Phone Number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//th[.='Ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//th[.='User Name']")
    public WebElement userName;

}
