package test.day2_findElement_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    /*TC #4: Zero Bank URL verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Get attribute value of href from the “forgot your password” link
4. Verify attribute value contains
Expected: “/forgot-password.html”
  */
    public static void main(String[] args) {
        //Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to http://zero.webappsecurity.com/login.html
        driver.get(" http://zero.webappsecurity.com/login.html");

        String actual = driver.findElement(By.linkText("Forgat your password ! ")).getAttribute("href");

        String expected = "/forgat - password.html";

        if (actual.contains(expected)) {
            System.out.println("Attribute Value Test Passed");
        } else {
            System.out.println("Attribute Value Test Failed");
        }
        driver.close();
    }
}
