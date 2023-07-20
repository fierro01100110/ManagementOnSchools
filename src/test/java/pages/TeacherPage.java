package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherPage {

    public TeacherPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //For assertion
    @FindBy(xpath = "//h5[.='Student Info List']")
    public WebElement studentInfoList;
    //For assertion
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]") //(//span//button[@type='button'])[1]
    public WebElement editButton;
    //For assertion
    @FindBy(xpath = "(//select[@id='lessonId'])[2]")
    public WebElement chooseLesson;

    //For assertion
    @FindBy(xpath = "(//select[@id='educationTermId'])[2]")
    public WebElement educationTerm;

    @FindBy(xpath = "(//input[@placeholder='Absentee'])[2]")  //(//input[@id='absentee'])[1]
    public WebElement absentee;

    @FindBy(xpath = "(//input[@placeholder='Midterm Exam'])[1]")
    public WebElement midtermExam;

    @FindBy(xpath = "(//input[@placeholder='Final Exam'])[1]")
    public WebElement finalExam;

    @FindBy(xpath = "(//input[@placeholder='Info Note'])[1]")
    public WebElement infoNote;


    @FindBy(xpath = "(//button[text()='Submit'])[2]")
    public WebElement submitUpgrade;

    @FindBy(xpath = "(//div[@role='alert'])[1]") ////div[text()='Student Info updated Successfully']
    public WebElement upgradeSuccessMessage;

    @FindBy(xpath = "(//span//button[@type='button'])[1]")
    public WebElement deleteStudentInfo;


}

