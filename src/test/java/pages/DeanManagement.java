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

    //Menu button 2
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton2;

    //Dean Management Menu
    @FindBy(xpath ="//*[contains(text(), 'Dean Management')]")
    public WebElement deanManagementMenu;

    //Dean's name
    @FindBy(xpath = "//*[@id='name']")
    public WebElement deanName;

    //Dean's Surname
    @FindBy(xpath = "//*[@id='surname']")
    public WebElement deanSurname;

    //Dean's Birthplace
    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement deanBirthPlace;

    //Dean's Gender click Female
    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement deanGenderFemale;

    //Dean's gender click Male
    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement deanGenderMale;

    //Dean's Birthday
    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement deanBirthday;

    //Dean's Phone Number
    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement deanPhoneNumber;

    //Dean's SSN Number
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement deanSsn;

    //Dean's Username
    @FindBy(xpath = "//*[@id='username']")
    public WebElement deanUsername;

    //Dean's Password
    @FindBy(xpath = "//*[@id='password']")
    public WebElement deanPassword;

    //Submit button for new Dean registration
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement deanSubmit;

    //Last page on Dean List
    @FindBy(xpath="//span[text()='Last']")////span[@aria-hidden='true']
    public WebElement lastPageDeanList;

    //Dean Hakan on Dean List
    @FindBy(xpath="//*[contains(text(), 'hakanmollaoglu')]")
    public WebElement deanHakanOnDeanList;








}
