package test.day7_Javafaker_webtables;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Vy_Track {
    WebDriver driver;
    Faker faker;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        faker = new Faker();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
    }
        @Test
        public void Register(){
            driver.findElement(By.xpath("//input[@name='_username']")).sendKeys(faker.name().username());
            driver.findElement((By.xpath("//input[@name='_password']"))).sendKeys(faker.internet().password());
           // driver.findElement(By.xpath("//input[@name='_submit']")).sendKeys(faker.name().());
            driver.findElement(By.xpath("//button[@type='submit']")).click();
        }


    }

