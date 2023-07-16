package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utilities.Driver;

import static base_url.Base_Url.setSpec;

public class Hooks {


    @Before("@US01_API")
    public void setUpScenario(){

        setSpec();
    }
    @After
    public void tearDown(Scenario scenario){
//        AFTER EACH SCENARIO
//        System.out.println("AFTER METHOD");
        if (scenario.isFailed()) {//attach the report only if a scenario fails
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
    }
}
