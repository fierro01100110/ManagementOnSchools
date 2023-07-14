package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonProgramPage {
    public LessonProgramPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //To go to Lesson Program section
    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgramSection;


    //Choose lesson
    @FindBy(xpath = "//div[text()='Select lesson']")
    public WebElement selectLesson;
    @FindBy(xpath = "//div[text()='Selenium']")
    public WebElement lessonOption1;

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public WebElement chooseLesson;

    @FindBy(xpath = "//div[@class=' css-1wy0on6']")
    public WebElement arrow;



    //Education term dropdown
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement educationTerm;

    //Choose day
    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDay;

    //Start time
    @FindBy(id = "startTime")
    public WebElement startTime;

    //Stop time
    @FindBy(id = "stopTime")
    public WebElement stopTime;

    //Submit lesson program
    @FindBy(xpath = "(//button[text()='Submit'])[1]")
    public WebElement submitButton;


    //success message
    @FindBy(xpath = "//div[text()='Created Lesson Program']")
    public WebElement successMessage;

    //fail message for no day
    @FindBy(xpath = "//button[@aria-label='close']")
    public WebElement failMessageNoDay;

    //fail message for no lesson
    @FindBy(xpath = "//div[text()='lessons must not empty']")
    public WebElement failMessageNoLesson;

    //select cypress2
    @FindBy(xpath = "//*[@id='react-select-2-listbox']/div[1]")
    public WebElement cypress2;




}
