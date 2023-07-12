package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonManagement {
    public LessonManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // lesson program button
    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgram;

    // lesson
    @FindBy(xpath = "//th[text()='Lesson']")
    public WebElement lesson;

    // day
    @FindBy(xpath = "//th[text()='Day']")
    public WebElement day;

    // start time
    @FindBy(xpath = "(//th[text()='Start Time']) [1]")
    public WebElement startTime;

    // stop time
    @FindBy(xpath = "(//th[text()='Stop Time']) [1]")
    public WebElement stopTime;

    // update button
    @FindBy(id = "updateButton")
    public WebElement updateButton;

    // delete button
    @FindBy(id = "deleteButton")
    public WebElement deletingButton;









}
