package test.Exercises.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EgeKiyilari {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://EgeKiyilari.com");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("driver.getCurrentUrl(); " + driver.getCurrentUrl());
        String expectedUrl = "EgeKiyilari";
        if (currentUrl.contains(expectedUrl)) {
            System.out.println("Current url contains expected url:Test PASSED!");
        } else {
            System.out.println("Current url does not contains expected url:Test FAILED!");
        }
        String expectedTitle="Practice";
        String getTitle=driver.getTitle();
        System.out.println("driver.getTitle(); "+driver.getTitle());
        if (getTitle.contains(expectedTitle)) {
            System.out.println("Current title contains expected url:Test PASSED!");
        } else {
            System.out.println("Current url does not contains expected url:Test FAILED!");
        }
    }



    }
