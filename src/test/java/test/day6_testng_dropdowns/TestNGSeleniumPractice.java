package test.day6_testng_dropdowns;
//TEST IN YANINA KOYULAN PRIORARITY COK ONEMLI @Test(priority=2)//2+1 veya 2+2 yapilabilir ONCELIGI BIZ BOYLE BELIRLIYORUZ.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class TestNGSeleniumPractice {




    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //Goal is to open new browser for each test.
        //What annitatioon I should be using for this? BeforeMethod or BeforeClass?
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.google.com");
    }
 @AfterMethod
 public void tearDown() throws InterruptedException {
     //close browser
     Thread.sleep(2000);
     driver.close();

 }
    @Test(priority=2)//2+1 veya 2+2 yapilabilir
    public void google_title_test(){
        //1. Go to: https://www.google.com
       /* WebDriver driver= WebDriverFactory.getDriver("chrome"); BURAYI YUKARIYA CEKTIK SETUP BOLUMUNE
        driver.get("https://www.google.com");*/
        //2. Verify title: Google
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        //The line where we do assertion
        //If you use assertTrue
        //argument you are passing is suppesed to be returning boolean

        Assert.assertTrue(actualTitle.equals(expectedTitle));
        //If you are using assertEquals
        //you need to pass two arguments of the same type
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test
    public void google_seach_title_verification() throws InterruptedException {
     //1-Open Browser
     //2- go to https://www.google.com
        WebDriver driver=WebDriverFactory.getDriver("chrome");
       driver.get("https://www.google.com");
     //3- serach "apple"

        WebElement appleSearchBox=driver.findElement(By.name("q"));
        appleSearchBox.sendKeys("apple"+ Keys.ENTER);
     //4- verify title contains apple
        String exceptedInTitle="apple";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(exceptedInTitle));
     //5-close browser  //TEAR DOWN A TASIDIK
       // Thread.sleep(2000);
       // driver.close();


    }
}
