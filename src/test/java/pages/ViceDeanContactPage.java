package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ViceDeanContactPage {
    public ViceDeanContactPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    //Name
    @FindBy(xpath = "//td[span='Dunya']")
    public WebElement name;
    //Email
    @FindBy(xpath = "//td[span='nereyegeldik@neredeyiz.com']")
    public WebElement email;
   //Subject
   @FindBy(xpath = "//td[span='Konumuz']")
   public WebElement subject;
    //Date
    @FindBy(xpath = "//td[span='2023-07-30']")
    public WebElement date;
    //Message
    @FindBy(xpath = "//td[span='Nerereden Cikti Bu Mesaj']")
    public WebElement message;





}
