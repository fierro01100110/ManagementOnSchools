package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanTeacherManagement {

    public ViceDeanTeacherManagement(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Edit button
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[2]")
    public WebElement editButton;

    //Choose lesson box
    @FindBy(xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[1]") //(//div[@class=' css-1xc3v61-indicatorContainer'])[1] (//div[@aria-hidden='true'])[2]
    public WebElement lessonDropdown;
    @FindBy(xpath = "//*[@id='react-select-2-listbox']/div[1]") //(//div[@class=' css-19bb58m'])[2] //*[@id='react-select-10-input']/div[1] (//div[text()='Select lesson'])[2]
    public WebElement selectLesson;

    @FindBy(xpath = "//div[text()='Phyton']")
    public WebElement phyton;
    //@FindBy(xpath = "//input[@id=\"react-select-4-input\"]")
    //public WebElement selectLesson;
    //@FindBy(xpath = "(//div[@class=\" css-19bb58m\"])[1]")
    //public WebElement SelectLesson;

    //Name box
    @FindBy(xpath ="(//input[@id='name'])[2]" )
    public WebElement name;

    //Surname box
    @FindBy(xpath = "(//input[@id='surname'])[2]")
    public WebElement surname;

    //Birthplace box
    @FindBy(xpath = "(//input[@id='birthPlace'])[2]" )
    public WebElement birthPlace;

    //E-mail box
    @FindBy(xpath =  "(//input[@id='email'])[2]")
    public WebElement email;

    //Phone box
    @FindBy(xpath = "(//input[@id='phoneNumber'])[2]")
    public WebElement phoneNumber;

    //SSN number box
    @FindBy(xpath = "(//input[@id='ssn'])[2]")
    public WebElement ssn;

    //Is Advisor Teacher checkbox
    @FindBy(xpath = "(//input[@id='isAdvisorTeacher'])[2]") //(//input[@type='checkbox'])[2]
    public WebElement isAdvTeacher;

    //Gender option
    @FindBy(xpath = "(//input[@value='MALE'])[2]")  //(//input[@name='gender'])[2] //(//input[@class='form-check-input'])[2]
    public WebElement male; //(//label[text()='Male'])[2]

    //Date of birth box
    @FindBy(xpath = "(//input[@id='birthDay'])[2]")
    public WebElement dateOfBirth;

    //UserName box
    @FindBy(xpath = "(//input[@id='username'])[2]")
    public WebElement userName;

    //Password box
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement password;

    //Submit button
    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement submitButton;

    //Teacher update successful message
    @FindBy(xpath = "//div[@role='alert']") //(//div[@role='alert'])[1] //(//div[@role='alert'])[1] ////div[@role='alert']
    //@FindBy(xpath = "//div[@class=\"Toastify\"]")  ////div[text()='Teacher updated Successful']
    public WebElement successfulMassage;






}
