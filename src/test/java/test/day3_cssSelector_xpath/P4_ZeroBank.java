package test.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_ZeroBank {
    public static void main(String[] args) {
        //TC #4: Zero Bank URLverification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // 2.Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3.Get attribute value of href from the “forgot your password”link
       // driver.findElement(By.linkText("Forgat your password"));
        WebElement forgatPasswordLink=driver.findElement(By.partialLinkText("Forgat"));
        // 4.Verify attribute value contains
        // Expected: “/forgot-password.html”SOLUTION: NEXT PAGE.
       String actualHrefValue = forgatPasswordLink.getAttribute("href");

       String expectedInHrefValue="/forgat-password.html";
        System.out.println("actualHrefValue = "+actualHrefValue);
        if(actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href value verification PASSED ! ");
        }else {
            System.out.println("Href value verification FAILED !!!");
        }
        System.out.println("Is forgatPassword Displayed ? "+ forgatPasswordLink.isDisplayed());
       //* System.out.println (driver.findElement(By.className("offset3 span6")).isDisplayed());
    }}