package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagement {

    public StudentInfoManagement(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginIcon;

    @FindBy(id = "username")
    public WebElement username;

    //Password box
    @FindBy(id = "password")
    public WebElement password;


    //For login button
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;



//STUDENT INFO MANAGEMENT LINK
    @FindBy(linkText ="Student Info Management")
    public WebElement studentInfoMng;


//  LESSON DROPDOWN WEB ELEMENT
//--------------------------------------------------------------------------
    //@FindBy(xpath = "//option[text()='Choose Lesson']")
   // public WebElement lesson;
//----------------------------------------------------------------------------
    @FindBy(id = "lessonId")
     public WebElement lesson;
//---------------------------------------------------------------------------------
    // @FindBy(xpath = "(//select[@class='form-select'])[1]")
   // public WebElement lesson;


//------------------------------------------------------------------------------




//JAVA WEB ELEMENT
    @FindBy(xpath = "//option[text()='Java']")
    public WebElement java;






//STUDENT NAME WEB ELEMENT
    @FindBy(id = "studentId")
    public WebElement studentName;
//---------------------------------------------------------
    //@FindBy(xpath = "(//select[@class='form-select'])[2]")
    //public WebElement studentDropDown;
//-----------------------------------------------------------
    // @FindBy(xpath = "(//option[@value='1'])[1]")
   // public WebElement studentName;



//TERM
    //@FindBy(xpath = "(//select[@class='form-select'])[3]")
    //public WebElement term;

    @FindBy(id = "educationTermId")
    public WebElement clickOnTerm;

    //@FindBy(xpath = "//option[text()='Choose Education Term']")
    //public WebElement term;

   // @FindBy(xpath = "(//option[@class='fw-semibold m-2'])[1]")
   // public WebElement chooseTerm;


    //ABSENTEE

   // @FindBy(xpath = "//label[@for='absentee']")
    //public WebElement absentee;

    @FindBy(xpath = "//input[@placeholder='Absentee']")
    public WebElement absentee;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement midtermExam;

    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam;

    @FindBy(id= "infoNote")
    public WebElement infoNote;

    @FindBy(xpath= "//button[text()='Submit']")
    public WebElement submit;







}
