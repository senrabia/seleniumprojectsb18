package test.Exercises.Day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWithLadies {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get(" http://google.com");
        driver.findElement(By.xpath("//a[@id='gb_70'")).click();
        driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[1]/div[1]/a"));


    }
}
