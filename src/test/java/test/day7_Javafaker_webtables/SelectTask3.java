package test.day7_Javafaker_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class SelectTask3 {
    WebDriver driver;
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }
    @BeforeMethod
    public void setUp(){
        //TC#1: Verifying "Simple dropdown" and "State selection" dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@Test
public void task3_select_date_test(){
    //Select "December 1 , 1921" and verify it is selected.
    //   Select year using : visible text
    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    yearDropdown.selectByVisibleText("1921");
    String yearActual=yearDropdown.getFirstSelectedOption().getText();
    String yearExcepted="1921";

    //   Select month using : value attribute
    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    monthDropdown.selectByValue("11"); //--> will select December using attribute value
    String monthActual=yearDropdown.getFirstSelectedOption().getText();
    String monthExcepted="December";

    //   Select day using: index number
    Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
    dayDropdown.selectByIndex(0);
    String dayActual=yearDropdown.getFirstSelectedOption().getText();
    String dayExcepted="1";

    Assert.assertEquals(yearActual,yearExcepted);
    Assert.assertEquals(monthActual,monthExcepted);
    Assert.assertEquals(dayActual,dayExcepted);
}

}
