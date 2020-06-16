package test.Exercises.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/*
driver.manager().window().maximize();

 */
public class FullScreenMode {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            //String url = "http://google.com"; //String url="adress" =>driver.get(url); driver.get("adres") ayni sonuc.
            //driver.get(url);
            driver.manage().window().maximize();//  MAXIMIZE   //driver.manage().window().maximize();

            driver.get("http://google.com");
            //---------------------------------------
            String title = driver.getTitle(); //Google title Kendi sayfamizda gorunuyor
            System.out.println(title);


}}
