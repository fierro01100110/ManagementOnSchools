package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanManagementt {
   public ViceDeanManagementt(){
      PageFactory.initElements(Driver.getDriver(),this);
   }
   //Menu button
   @FindBy(xpath = "//button[text()='Menu']")
   public WebElement menu;

   //Teacher Management
   @FindBy(xpath = "//a[text()='Teacher Management']")
   public WebElement teacherManagement;

   //Teacher Management visibility
   @FindBy(xpath = "//h3[text()='Teacher Management']")
   public WebElement teacherManagementText;

   //Teacher List
   @FindBy(xpath = "//h5[text()='Teacher List']")
   public WebElement teacherList;
}
