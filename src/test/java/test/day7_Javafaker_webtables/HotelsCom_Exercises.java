package test.day7_Javafaker_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HotelsCom_Exercises {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hotels.com/?locale=en_US&pos=HCOM_US&rffrid=sem.hcom.US.google.003.00.03");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Hotels.com.login(driver);

    }
    @Test
    public void p1_Hotel_login(){
        List<WebElement> list=driver.findElements(By.xpath("//body//a"));
        int expectedNumberOfLinks = 6;
        int actualNumberOfLinks = list.size();
        Assert.assertEquals(actualNumberOfLinks, 6);
        //7. Print out each link text on this page
        for (WebElement link : list){
            System.out.println(link.getText());
    }}
    @Test
    public void p2_Hotel_login(){
            WebElement orderLink=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div/div[2]/div/div/form/div[1]/input[1]"));
            orderLink.click();
            WebElement place=driver.findElement(By.id("qf-0q-destination"));
            WebElement findYear=driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div[1]/div"));
            findYear.click();
            WebElement findDate=driver.findElement(By.xpath("widget-datepicker-weekend"));
            // BIR PASS BIR FAILED


        }

}
