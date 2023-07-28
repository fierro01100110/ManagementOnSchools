package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherMeetManagement {

    public TeacherMeetManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@href='/login']") ////a[@class='header_link ms-2']  ////a[@href='/login']
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement Login;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "//h3[text()='Meet Management']")
    public WebElement meetManagementText;

    @FindBy(xpath = "//h5[text()='Meet List']")
    public WebElement meetList;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]")  //(//button[@type='button'])[1]
    public WebElement editButton;

    @FindBy(xpath = "//div[text()='Edit Meet']")
    public WebElement editMeetPage;

    @FindBy(xpath = "(//label[text()='Choose Students'])[2]")
    public WebElement chooseStudents;

    @FindBy(xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")
    public WebElement arrow;

    @FindBy(xpath = "//div[text()='student2 surname']")  ////div[text()='Student Murat']
    public WebElement selectStudent; ////div[text()='student2 surname']

    @FindBy(xpath = "(//label[text()='Date Of Meet'])[2]")
    public WebElement dateOfMeet;

    @FindBy(xpath ="(//input[@id='date'])[2]" )//(//input[@id='date'])[2]" //(//input[@class='form-control'])[5]
    public WebElement date; //input[@value='2023-07-31']  //input[@value='2023-07-27']

    @FindBy(xpath = "(//label[text()='Start Time'])[2]")
    public WebElement startTime;

    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement time;

    @FindBy(xpath = "(//label[text()='Stop Time'])[2]")
    public WebElement stopTime;

    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement Time;

    @FindBy(xpath = "(//input[@id='description'])[2]")
    public WebElement description;

    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement submit;


    @FindBy(xpath = "(//div[@role='alert'])[1]")
    public WebElement alert;

    @FindBy(xpath = "(//div[text()='Meet Updated Successfully'])[2]")  //(//div[@class='Toastify__toast-body'])[1]
    public WebElement successfulMessage; //(//div[@id='2'])[2]

    @FindBy(xpath = "(//button[@aria-label='Close'])[3]") //(//button[@class='btn-close'])[1]
    public WebElement closePage;

    @FindBy(xpath = "(//i[@class='fa-solid fa-trash'])[1]")
    public WebElement deleteButton; //(//button[@class='btn btn-danger'])[2]

    @FindBy(xpath = "(//div[@role='alert'])[2]")
    public WebElement Alert;

    @FindBy(xpath = "(//div[text()='Meet deleted successfully'])[1]") //(//div[@id='2'])[2]
    public WebElement deleteSuccessfulMessage;//(//div[text()='Meet deleted successfully'])[2]





}
