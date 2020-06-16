package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01_MarriamWebster {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.merriam-webster.com");
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        int linksWithoutText = 0;
        int linksWithText = 0;

        for (WebElement eachLink : listOfLinks) {
            //System.out.println(eachLink.getText());
            String textOfEachLink = eachLink.getText();
            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                System.out.println(textOfEachLink);
                linksWithText++;}}
        System.out.println("The number of links that does NOT have text: " + linksWithoutText);
        System.out.println("The number of links that have text: " + linksWithText);
        System.out.println("Total links on this page: " + listOfLinks.size());
    }
}
//=============================================================================================

     /*   //TC #0: FINDELEMENTS1.Open Chrome browser
        // 2.Go to https://www.merriam-webster.com/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(" https://www.merriam-webster.com/");
        // 3.(1 Task)Print out the texts of all links
        //We are creating a List of WebElements and storing values returned
        List<WebElement>listOfLinks=driver.findElements(By.xpath("//body//a")); // =>last two //
        //option+entertoimport in MAC
        //alt+enterfor WINDOWS
        int linksWithoutText=0;
        int linksWithText=0;
        for(WebElement eachLInk:listOfLinks) {
            // System.out.println(eachLInk.getText());//BURASI COK ONEMLI SAYFADAKI TUM TEXTLER GELIYOR.
            String textOfEachLink = eachLInk.getText();
            // 4.(2 Task) Print out how many link is missing text
            if(textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else{
                System.out.println(textOfEachLink);
                linksWithText++;
        }}// 4.(2 Task) Print out how many link is missing text
         System.out.println("The number of links that does NOT have text: "+linksWithoutText);

        //5. Print out how many link has text
        System.out.println("The number of links that have text: " + linksWithText);

        //6. Print out how many total link
        System.out.println("Total links on this page: " + listOfLinks.size());
    }
}
*/