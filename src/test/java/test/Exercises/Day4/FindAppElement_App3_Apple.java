package test.Exercises.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindAppElement_App3_Apple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.apple.com/mac/");
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


