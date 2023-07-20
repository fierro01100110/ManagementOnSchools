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

}
