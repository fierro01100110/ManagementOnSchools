package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SchoolHomePage {
    public SchoolHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//a[@href='/register']")
    public WebElement register;
    @FindBy(xpath = "//a[@href='/login']")
    public WebElement login;

}