package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.UnitedAirlinesPage;
import utilities.Driver;

public class Base {

    WebDriver driver;
    UnitedAirlinesPage unitedAirlinesPage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        unitedAirlinesPage = new UnitedAirlinesPage(driver);
    }

    @AfterMethod
    public void teardown() {
        Driver.quitDriver();
    }
}