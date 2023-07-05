package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanContactMessage {
    public DeanContactMessage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Delete button
    @FindBy(id = "deleteButton")
    public WebElement deleteButton;


    //Message
    @FindBy(xpath = "//th[text()='Message']")
    public WebElement message;

    //Name
    @FindBy(xpath = "//th[text()='Name']")
    public WebElement name;

    //Emails
    @FindBy(xpath = "//th[text()='Email']")
    public WebElement email;

    //Dates
    @FindBy(xpath = "//th[text()='Date']")
    public WebElement date;

    //Subject
    @FindBy(xpath = "//th[text()='Subject']")
    public WebElement subject;




}

