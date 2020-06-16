package test.day4_findElements_checkbox_radio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class T1_Cybertek_ForgatPassword_Xpath {
    public static void main(String[] args) {
       WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgat_password");

        //3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        //a. “Home” link
        //tagName[@attribute='value']
        //a[@class='nav-link']
        //a[@href='/']
        //tagName[.='text']
        //a[.='Home']

        WebElement homeLink=driver.findElement(By.xpath("//a[.=Home']"));

        //b. “Forgot password” header
        WebElement forgatPasswordHeader=driver.findElement(By.xpath("//h2[.='Forgat Password']"));

        //c. “E-mail” text
        //label[.='E-mail']
        WebElement emailLabel=driver.findElement(By.xpath("//label[@for='email'"));

        //d. E-mail input box
        WebElement emailInput=driver.findElement(By.xpath("//input"));

}}


