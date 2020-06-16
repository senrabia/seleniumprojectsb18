package test.Exercises.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

//12:50
public class FindAppElement_Apple1 {
    public static void main(String[] args) {

      //  TC #02: FINDELEMENTS_APPLE1.Open Chrome browser
        //  2.Go to https://www.apple.com
        //  3.Click to iPhone
        //  4.Print out the texts of all links
        //  5.Print out how many link is missing text
        //  6.Print out how many link has text7.Print out how many total link
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");
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
