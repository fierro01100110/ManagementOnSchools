package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {
    public GuestUserPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement clickMenu;
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement clickLogin;

    @FindBy(linkText = "Guest User")
    public WebElement guestUser;

    @FindBy(xpath = "//*[.='Name']")
    public WebElement nameHeader;

    @FindBy(xpath = "//*[.='Phone Number']")
    public WebElement phoneNumberHeader;

    @FindBy(xpath = "//*[.='Ssn']")
    public WebElement ssnHeader;

    @FindBy(xpath = "//*[.='User Name']")
    public WebElement userNameHeader;

    @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
    public WebElement deleteGuestUser;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement deletedAlert;


@FindBy(xpath = "//tbody/tr[1]")
    public WebElement verifyGuestUserList;


}

