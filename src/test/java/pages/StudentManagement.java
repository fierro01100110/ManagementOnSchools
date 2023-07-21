package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagement {
    public StudentManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //Student Management menu
    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentManagement;

    //Choose Teacher
    @FindBy(xpath = "//select[@id='advisorTeacherId']")
    public WebElement teacher;

    //Name
    @FindBy(id = "name")
    public WebElement name;


    //Surname
    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surname;

    //BirthPlace
    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace;

    //Email
    @FindBy(id = "email")
    public WebElement email;

    //PhoneNumber
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;


    //Gender Female
    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement female;

    //Gender Male
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleGender;

    //Bday
    @FindBy(id = "birthDay")
    public WebElement bDay;

    //SSN
    @FindBy(id = "ssn")
    public WebElement ssn;

    //Username
    @FindBy(id = "username")
    public WebElement username;

    //Fathername
    @FindBy(id = "fatherName")
    public WebElement fatherName;

    //Mother name
    @FindBy(id = "motherName")
    public WebElement motherName;

    //Password
    @FindBy(id = "password")
    public WebElement password;

    //Submit
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submit;

    //Success
    @FindBy(xpath = "//div[text()='Student saved Successfully']")
    public WebElement success;

    //Last Page
    @FindBy(xpath = "//span[text()='Last']")
    public WebElement lastPage;

    //Student number
    @FindBy(xpath = "//th[text()='Student Number']")
    public WebElement studentNumber;

}
