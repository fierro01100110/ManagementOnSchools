package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MOSHomePage {
    public MOSHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement homeLoginButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement userPassword;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginSubmitButton;

}
