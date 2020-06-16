package test.Exercises.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/*  -> Go to the Google.com
    -> Inspect page
    ->CTRL F e bas burdan Find kutucugu cikar title basildiginda
    ->     <title>Google</title> cikar   her sayfanin mutlaka bir tytle vardir.


 */
public class C_PageTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //String url = "http://google.com"; //String url="adress" =>driver.get(url); driver.get("adres") ayni sonuc.
        //driver.get(url);
        driver.get("http://google.com");
        //---------------------------------------
        String title = driver.getTitle(); //Google title Kendi sayfamizda gorunuyor
        System.out.println(title);
    }
}
