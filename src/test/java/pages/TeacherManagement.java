package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagement {

    public TeacherManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@aria-hidden='true']")
    public WebElement lessonDropDown;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement selectLesson;


    @FindBy(xpath = "//div[text()='Cypress']")
    public WebElement cypress;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surname;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "isAdvisorTeacher")
    public WebElement isAdvisorTeacherCheckBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleCheckBox;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleCheckBox;

    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "ssn")
    public WebElement ssnNumber;

    @FindBy(id = "username")
    public WebElement teacherUsername;

    @FindBy(id = "password")
    public WebElement teacherPassword;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertText;

    @FindBy(xpath="//div[@class=' css-9jq23d']")
    public WebElement selenium;


}
