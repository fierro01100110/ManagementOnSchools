package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagement {

    public StudentManagement(){PageFactory.initElements(Driver.getDriver(),this);}

    //Student Management Menu
    @FindBy(xpath ="//*[contains(text(), 'Student Management')]")
    public WebElement studentManagementMenu;

    //Choose Teacher Menu
    @FindBy(xpath = "//*[@id='advisorTeacherId']")
    public WebElement chooseTeacherMenu;

    //Advisor Teacher Murat
    @FindBy(xpath = "//*[@class='fw-semibold m-2'][1]")
    public WebElement advisorTeacherMurat;


    //Student Name
    @FindBy(xpath = "//*[@id='name']")
    public WebElement studentName;

    //Student Surname
    @FindBy(xpath = "//*[@id='surname']")
    public WebElement studentSurname;

    //Student Birthplace
    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement studentBirthplace;

    //Student e mail
    @FindBy(xpath = "//*[@id='email']")
    public WebElement studentEmail;

    //Student Phone NUmber
    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement studentPhoneNumber;

    //Student Gender Male
    @FindBy(xpath = "//*[@value='MALE']")
    public WebElement studentGenderMale;

    //Student Gender Female
    @FindBy(xpath = "//*[@value='FEMALE']")
    public WebElement studentGenderFemale;

    //Student Birthday
    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement studentBirthday;

    //Student SSN
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement studentSsn;

    //Student Username
    @FindBy(xpath = "//*[@id='username']")
    public WebElement studentUsername;

    //Student Father name
    @FindBy(xpath = "//*[@id='fatherName']")
    public WebElement studentFatherName;

    //Student Father name
    @FindBy(xpath = "//*[@id='motherName']")
    public WebElement studentMotherName;

    //Student Password
    @FindBy(xpath = "//*[@id='password']")
    public WebElement studentPassword;

    //Student Submit button
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement studentSubmit;

    // Student Saved
    @FindBy(xpath = "//div[text()='Student saved Successfully']")
    public WebElement studentSaved;


}
