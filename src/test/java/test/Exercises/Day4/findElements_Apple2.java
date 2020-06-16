package test.Exercises.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class findElements_Apple2 {
    public static void main(String[] args) {
        //  TC #02: FINDELEMENTS_APPLE1.Open Chrome browser
        //  2.Go to https://www.apple.com
        //  3.Click to iPhone
        //  4.Print out the texts of all links
        //  5.Print out how many link is missing text
        //  6.Print out how many link has text7.Print out how many total link

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.apple.com");
        //WebElement driver.findElements()
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        int linksWithTetx = 0;
        int linksWithoutLink = 0;
        for (WebElement eachlink : listOfLinks) {
            System.out.println(eachlink.getText());//Buraya GET TITLE yazdigimizda TITLE verir
            String textofEachLink = eachlink.getText();
            if (textofEachLink.isEmpty()) {
                linksWithoutLink++;
            } else {
                System.out.println(textofEachLink);
                linksWithoutLink++;
            }
        }
        System.out.println("The number of links that does NOT have text: " + linksWithoutLink);
        System.out.println("The number of links that have text: " + linksWithTetx);
        System.out.println("Total links on this page: " + listOfLinks.size());

    }

}