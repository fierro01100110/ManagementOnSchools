package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentAccountPage {
    public StudentAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[@type='button']")
    public WebElement menuButton;

    @FindBy(xpath = "//*[text()='Teacher']")
    public WebElement teacher;

    @FindBy(xpath = "//*[text()='Day']")
    public WebElement day;

    @FindBy(xpath = "//*[text()='Start Time']")
    public WebElement startTime;

    @FindBy(xpath = "//*[text()='Stop Time']")
    public WebElement stopTime;

    @FindBy(id = "lessonProgramId")
    public WebElement chooseLessonCheckbox;

    @FindBy(xpath = "//input[@value='2203']")
    public WebElement checkboxPhyton;

    @FindBy(xpath = "//input[@value='1801']")
    public WebElement checkboxSelenium1;

    @FindBy(xpath = "//input[@value='1820']")
    public WebElement checkboxSelenium2;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[text()='Lesson Program List']")
    public WebElement lessonProgramList;

    @FindBy(xpath = "//a[text()='Grades and Announcements']")
    public WebElement gradesAndAnnouncements;

    @FindBy(xpath = "//*[text()='Midterm Exam']")
    public WebElement midtermExam;

    @FindBy(xpath = "//*[text()='Final Exam']")
    public WebElement finalExam;

    @FindBy(xpath = "//*[text()='Meet List']")
    public WebElement meetList;

}
