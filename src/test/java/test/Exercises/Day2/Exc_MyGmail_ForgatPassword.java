package test.Exercises.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exc_MyGmail_ForgatPassword {
    /* TC #3: PracticeCybertek/ForgotPassword URL verification
     1. Open Chrome browser
     2. Go to http://practice.cybertekschool.com/forgot_password
     3. Enter any email into input box
     4. Click on Retrieve password
     5. Verify URL contains:
     Expected: "email_sent"
     6. Verify textbox displayed the content as expected.
     Expected: "Your e-mail's been sent!"
     Hint: You need to use getText method for this practice.
    */
    public static void main(String[] args) {
        //google adress
        WebDriverManager.chromedriver().setup(); //1. Open Chrome browser
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        // adress
        driver.get(" http://practice.cybertekschool.com/forgot_password");// Go to http://practice.cybertekschool.com/forgot_password
        driver.findElement(By.name("email")).sendKeys("senergunerrabia");//Enter any email into input box
        driver.findElement(By.id("from_submit")).click(); // Click on Retrieve password
       //URL adress
       String actualURL=driver.getCurrentUrl();//Expected: "Your e-mail's been sent!"
       String expectedURL="email_sent";
       //if & else statement

        if (actualURL.contains(expectedURL)) {
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }


}}
