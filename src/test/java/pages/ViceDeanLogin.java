package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanLogin {

    public ViceDeanLogin() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //login(first)
    @FindBy(xpath = "//a[@href=\"/login\"]")
    //@FindBy(xpath = "//a[@class=\"header_link ms-2\"]")
    public WebElement login;

    //Vice Dean(F) username box
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    //Vice Dean(F) password box
    @FindBy(xpath = "//input[@id ='password']")
    public WebElement Password;

    //Vice Dean(F) login
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement Login;
}
