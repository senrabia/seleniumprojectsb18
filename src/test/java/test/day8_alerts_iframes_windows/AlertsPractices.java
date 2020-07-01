package test.day8_alerts_iframes_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class AlertsPractices {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
public void P1_information_alert_test(){

        WebElement infoAlertButton=driver.findElement(By.xpath("//button[.=‘Click for JS Alert’]"));
        infoAlertButton.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement resultText=driver.findElement(By.xpath("//p[@id='result'")); //locating result web element
      //  WebElement resultTest2=driver.findElement(By.id("result"));  //

        Assert.assertTrue(resultText.isDisplayed());
    }


@Test
public void p2_cofirmation_alert_test(){

    WebElement confirmationAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
    confirmationAlertButton.click();
    Alert alert=driver.switchTo().alert();
    alert.dismiss();

    //locating result web element
    WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
    //WebElement resultText2 = driver.findElement(By.id("result"));

    //Asserting the result text is displayed
    Assert.assertTrue(resultText.isDisplayed());


}
}






