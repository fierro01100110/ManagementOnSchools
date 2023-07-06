package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MOSDeanManagementPage {
    public MOSDeanManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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
