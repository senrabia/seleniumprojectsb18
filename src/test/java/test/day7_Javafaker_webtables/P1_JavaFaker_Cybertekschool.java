package test.day7_Javafaker_webtables;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class P1_JavaFaker_Cybertekschool {
    WebDriver driver;

    @Test
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/registration_form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void CybertekRegistrationF() {
        Faker faker=new Faker();

        String firstName=faker.name().firstName();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);

        String lastName=faker.name().lastName();
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);

        String userName = faker.name().username().replaceAll("[-.!@#$%^&*,?/()_]","");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);

        String emailAdress=faker.internet().emailAddress();
        driver.findElement(By.xpath("//input[@name='email'")).sendKeys(emailAdress);

        //String password=faker.internet().password();
        //driver.findElement(By.xpath("//input[@name='password'")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password());

        String phoneNumber=faker.phoneNumber().phoneNumber().replaceAll("[<>!@#$%^&*(),.]","");
        driver.findElement(By.xpath("//input[@name='phone'")).sendKeys("5714882082");

        driver.findElement(By.xpath("//input[@value='female']")).click();

        String dateOfBird="01/01/1980";
        driver.findElement(By.xpath("//input[@name='birthday'")).sendKeys(dateOfBird);

        Select departmant=new Select(driver.findElement(By.xpath("//select[@name='department']")));
        departmant.selectByValue("DE");

        Select jobTitle = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByVisibleText("QA");

        driver.findElement(By.xpath("//input[@value='java']")).click();

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        WebElement message = driver.findElement(By.xpath("//div//p"));

        // To check is message is displated
        Assert.assertTrue(message.isDisplayed());

    }
}







