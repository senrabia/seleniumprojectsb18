package test.Exercises.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyGmail {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup(); // Bana chromu goster
        WebDriver driver = new ChromeDriver();  //Web driver objesi olustur.//POLIMORFIZIM  // sub super class
        driver.manage().window().maximize();    // Burasi yonetim bolumu sayafanin buyuk acilmasi icin.
        driver.get("https://www.gmail.com");

        driver.findElement(By.id("identifierId")).sendKeys("brown75angela@gmail.com");
        driver.findElement(By.xpath("//*[contains(@class,'RveJvd snByac')]")).click();

       String actualURL = driver.getCurrentUrl();
       String expectedURL="gmail";

        if (actualURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

    }
}
