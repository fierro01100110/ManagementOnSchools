package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login {

    public Login(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Username box
    @FindBy(id = "username")
    public WebElement username;

    //Password box
    @FindBy(id = "password")
    public WebElement password;


    //For login button
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;
}
