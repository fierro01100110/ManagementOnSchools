package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ViceDeanLessons {

    public ViceDeanLessons(){PageFactory.initElements(Driver.getDriver(),this);
    }

    //Lessons button
    @FindBy(id ="controlled-tab-example-tab-lessonsList")
    public WebElement lessons;

    //Lesson Name
    @FindBy(id ="lessonName")
    public WebElement lesson_name;

   //Compulsory Check
   @FindBy(id ="compulsory")
   public WebElement compulsory_check;

   //Credit Score
   @FindBy(id ="creditScore")
   public WebElement credit_score;

   //Submit Button
    @FindBy(xpath ="(//button[text()='Submit'])[2]")
    public WebElement submit_button;

    //Lesson Created Message
    @FindBy(xpath ="//div[text()='Lesson Created']")
    public WebElement success_message;

    //Last Page Button
    @FindBy(xpath ="(//a[@class='page-link'])[8]")
    public WebElement last_page_button;

    //Table

    @FindBy(xpath ="(//*[@class='table table-striped table-bordered table-hover'])[2]//tr//td[1]")
    public WebElement table;

    //Lesson Deleted Message

    @FindBy(xpath ="//div[text()='Lesson Deleted']")
    public WebElement deleted_message;

    //All the delete buttons
    @FindBy(xpath = "(//button[@class='btn btn-danger'])[4]")
    public WebElement deleteButtons;

    //Delete message
    @FindBy(xpath = "//*[text()='Lesson Deleted']")
    public WebElement deleteMessage;

    //Last page
    @FindBy(xpath = "(//span[text()='Last'])[1]")
    public WebElement lastPage;
}
