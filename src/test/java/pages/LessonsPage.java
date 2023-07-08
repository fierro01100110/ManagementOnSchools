package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonsPage {
    public LessonsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "lessonName")
    public WebElement lessonName;
    @FindBy(id = "compulsory")
    public WebElement compulsory;
    @FindBy(id = "creditScore")
    public WebElement creditScore;
    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement lessonSubmitButton;
    @FindBy(xpath = "//div[.='Lesson Created']")
    public WebElement alert;
}
