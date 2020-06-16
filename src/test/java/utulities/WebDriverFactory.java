package utulities;

    //	Task :
    //	- Write a static method in WebDriverFactory class
    //	- Return type is WebDriver
    //	- method name getDriver
    //	- it accepts one String argument, and returns the browser according to what string is passed
    //	- if "chrome" --> returns chrome browser
    //	- if "firefox" --> returns firefox browser
    //
    //LUNCH BREAK : BREAK UNTIL 2PM EST

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
        public static WebDriver getDriver(String browserType){
            if(browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(); //burdaki NEW instance method
            }else if(browserType.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }else{
                System.out.println("Given browser type does not exist.Driver=null !");
                return null;}
        }

/*
    public static void main(String[] args) {
            getDriver("chrome").get("http://zero.webappscurity.com/login.html");
            getDriver("firefox").get("http://zero.webappscurity.com/login.html");}   */


    }