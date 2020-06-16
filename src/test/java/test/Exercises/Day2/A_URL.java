package test.Exercises.Day2;
//Web Driver manager github page.. de web sayfalarinin adresleri var.Bu onemli
/*
driver.get(url)=>To open URL, open some website.
              URL yi acmak icin bir web sayfasi acin.
driver.navigate.to(url)=>Load a web page in the current browser windows..
              Gecerli tarayici pencerine yeni bir web sayfasi yuklemek icin.
driver.navigate.back()=>Move in the Browser history to perivious URL.
               Tarayici gecmisinde bir onceki URL ye gitme
driver navigate.forward()=>Move forward the browser history, Does nothing if we are on the                latest page viewed.
               Tarayici gecmisinde ilerleyin, Goruntulenen son sayfadaiseniz hicbirsey yapmaz.
driver.navigate.refresh()=>Load a new web page in the current browser window.
                Gecerli tarayici penceresine yeni bir web sayfasi yukleme


 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_URL {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2="http://amazon.com";
        //Will open browser with URL
        driver.get(url);

        //will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //navigate to the Amazon
        driver.navigate().to(url2);

        Thread.sleep(3000);

        //will navigate back to the perivious URL
        //in our case it's a google.com
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);
        //Will close web browser

        driver.close();

    }}



