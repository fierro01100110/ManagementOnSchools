package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactMessagePage {

    public ContactMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    //conctact page name box
    @FindBy(id = "name")
    public WebElement yourNameBox;
    //conctact page email box
    @FindBy(id = "email")
    public WebElement emailBox;

    //conctact page subject box
    @FindBy(id = "subject")
    public WebElement subjectBox;

    //conctact page message box
    @FindBy(id = "message")
    public WebElement messageBox;

    //conctact page send message button
    @FindBy(xpath = "//button[.='Send Message']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//div[@class='Toastify']")
    public WebElement sendAlert;

    //text of "Required" when name is missing
    @FindBy(xpath = "//div[.='Required']")
    public WebElement nameIsMissingAlert;

    //invalid email error message
    @FindBy(xpath = "(//div[.='Please enter valid email'])[2]")
    public WebElement invalidEmailErrorMessage;
}
