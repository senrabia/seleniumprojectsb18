package test.day3_cssSelector_xpath;

import org.openqa.selenium.WebDriver;
import utulities.WebDriverFactory;

public class AbsoluteXpathPractice {
    public static void main(String[] args) {
        //Go to http://practice.cybertecschool.com/multiplebuttons
        //Verify "Home" link is displayed on the page
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertecschool.com/multiplebuttons");

    }
}
