package test.day8_alerts_iframes_windows;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import utulities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class IframePractice {

       WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/iframe");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

}

