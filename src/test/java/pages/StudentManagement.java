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
    @FindBy(xpath = "//tbody/tr[last()]//td[1]")
    public WebElement studentNumber;

    //Name Required
    @FindBy(xpath = "//div[text()='Required']")
    public WebElement requiredAlert;

    //SSN alert
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public WebElement ssnPopUp;


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
