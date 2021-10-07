package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonSearchTest {

//    1. Bir class oluşturun : AmazonSearchTest
//    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //    a.amazon web sayfasına gidin. https://www.google.com/

        driver.get("https://www.amazon.com/");

        //   b. Search(ara) “city bike”

        WebElement searchButon = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchButon.sendKeys("citybike" + Keys.ENTER);

        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın


        WebElement results = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("results.size() = " + results.getText());

        //    d. “Shopping” e tıklayın.

        driver.navigate().to("https://www.amazon.com/Shopping/b?ie=UTF8&node=9408875011");
        Thread.sleep(2000);
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        WebElement firstImage = driver.findElement(By.className("s-image"));
        firstImage.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
