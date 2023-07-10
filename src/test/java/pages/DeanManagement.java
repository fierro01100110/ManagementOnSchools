package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagement {
    public DeanManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Menu button
    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
    public WebElement menu;


    //Contact Get All
    @FindBy(xpath = "//a[text()='Contact Get All']")
    public WebElement contactGetAll;





    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[5]")
    public WebElement editButton;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surname;

    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement deanManagementEditPassword;


    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement deanManagementSubmitButton;

    @FindBy(xpath = "//div[text()='Dean updated Successful']")
    public WebElement deanUpdatedSuccessful;
}


