package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class Register {

    public Register(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    Register Page
    @FindBy(xpath = "//div[text()='Register']")
    public WebElement registerPage;

//    Name box
    @FindBy(id = "name")
    public WebElement name;

//    Surname box
    @FindBy(id = "surname")
    public WebElement surname;

//    Birthplace box
    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

//    Phone number box
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

//    Gender
//    Female checkbox;
    @FindBy (xpath = "//input[@value='FEMALE']")
    public WebElement genderFemale;
//    Male checkbox;
    @FindBy (xpath ="//input[@value='MALE']")
    public WebElement genderMale;

//    Date of birth box
    @FindBy(id = "birthDay")
    public WebElement birthDate;

//    SSN box
    @FindBy(id = "ssn")
    public WebElement ssn;

//    Username box
    @FindBy(id = "username")
    public WebElement username;

//    Password box
    @FindBy(id = "password")
    public WebElement password;

//    Register button
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement registerButton;

//    "Guest User Registered" alert
    @FindBy(xpath = "//div[text()='Guest User registered.']")
    public WebElement successfulRegisterAlert;

//    "Invalid feedback"
    @FindBy(xpath = "//div[text()='Required']")
    public WebElement invalidFeedbackAlert;

}
