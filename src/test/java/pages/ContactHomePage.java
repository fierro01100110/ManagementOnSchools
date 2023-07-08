package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactHomePage {
    public ContactHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
//home page contact button
    @FindBy(linkText = "Contact")   //Contact has a   <a> tag  so its a link  then i can use linkText
    public WebElement contactButton;

}
