package test.day7_Javafaker_webtables;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P2_JavaFaker_Cyberetk {

    WebDriver driver;
    Faker faker;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        faker = new Faker();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
    }
    @Test
    public void Register(){
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys((faker.name().name()).replaceAll("[,._ ]",""));
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password());
        String phone =(faker.phoneNumber().cellPhone()).replaceAll("[()-. ]","");
        phone = phone.substring(0,3)+"-"+phone.substring(3,6)+"-"+phone.substring(6,10);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@value='other']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("01/01/1991");//can't to fake date
        Select department = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("MO");
        Select job = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        job.selectByVisibleText("SDET");
        driver.findElement(By.xpath("//input[@value='java']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String expected = "You've successfully completed registration!";
        String actual = driver.findElement(By.xpath("//div/p")).getText();
        Assert.assertEquals(expected,actual);
    }

}
