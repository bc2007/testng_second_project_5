package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.UnitedAirlinesBasePage;
import pages.UnitedAirlinesHomePage;
import utils.ConfigReader;
import utils.Driver;

public class UnitedAirlinesBase {

    WebDriver driver;
    UnitedAirlinesBasePage unitedAirlinesBasePage;
    UnitedAirlinesHomePage unitedAirlinesHomePage;


    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("appURL"));
        unitedAirlinesBasePage = new UnitedAirlinesBasePage();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }

}
