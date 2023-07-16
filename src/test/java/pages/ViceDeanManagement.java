package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagement {


    public ViceDeanManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //To click "Menu" button
    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
    public WebElement menu;

    //Lesson Management Option
    @FindBy(xpath = "//a[text()='Lesson Management']")
    public WebElement lessonManagement;




    //Main Menu Link
    @FindBy(id = "offcanvasNavbarLabel-expand-lg")
    public WebElement mainMenu;

    //Teacher Management Link
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherManagement;

<<<<<<< HEAD
=======
    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]")
    public WebElement menu;

    @FindBy(xpath = "//a[text()='Vice Dean Management']")
    public WebElement viceDManagment;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "surname")
    public WebElement surName;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement gender;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement birthDay;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "ssn")
    public WebElement SSN;

    @FindBy(id = "username")
    public WebElement  userName;

    @FindBy(id = "password")
    public WebElement  password;

    @FindBy(xpath = "(//button[@type='button'])[5]")
    public WebElement submitButton;

    @FindBy(xpath = "//span[@class='text-white text-white justify-content-center text-center navbar-brand']")
    public WebElement viceDeanSaved;
>>>>>>> main

}
