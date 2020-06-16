package test.Exercises.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_Practice_Cybertek {
    public static void main(String[] args) {
        //XPATH PRACTICESDO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        // TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        // 1. Open Chrome browser
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6) a.
        // “Home” linkb. “Forgot password” headerc. “E-mail” textd. E-mail input boxe.
        // “Retrieve password” buttonf. “Powered byCybertek School” text
        // 4. Verify all WebElements are

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement forgatPasswordLink=driver.findElement(By.partialLinkText("Forgat"));

        WebElement displayHome = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        System.out.println("Home tab is displayed: "+displayHome.isDisplayed());

        WebElement displayForgotPass = driver.findElement(By.xpath("/html/body/div/div/div/div/h2"));
        System.out.println("Forgot Password header is displayed: "+displayForgotPass.isDisplayed());
        WebElement displayEmail = driver.findElement(By.xpath("//label[@for='email']"));
        System.out.println("Email header is displayed: "+displayEmail.isDisplayed());
        WebElement displayInputBox = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("Input box is displayed: "+displayInputBox.isDisplayed());
        WebElement displayRetreive = driver.findElement(By.xpath("//button[@id='form_submit']"));
        System.out.println("Retrieve box is displayed: "+displayRetreive.isDisplayed());
        WebElement displayPoweredBy = driver.findElement(By.xpath("/html/body/div/div/div/div"));
        System.out.println("Powered by text is displayed: "+displayPoweredBy.isDisplayed());
        driver.quit();
    }
}
