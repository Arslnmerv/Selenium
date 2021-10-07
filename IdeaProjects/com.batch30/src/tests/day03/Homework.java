package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // amazon.com a gidip java kelimesini aratin

        driver.get("https://www.amazon.com");
        WebElement buton = driver.findElement(By.id("twotabsearchtextbox"));
        buton.sendKeys("java" + Keys.ENTER);

        // kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin

        WebElement result = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(result.getText());

        WebElement dorduncuKitap = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/span/div/div/div[2]/div[1]/h2/a/span"));
        System.out.println("dorduncuKitap.getText() = " + dorduncuKitap.getText());

        WebElement yedinciKitap = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[9]/div/span/div/div/div[2]/div[1]/h2/a/span"));
        System.out.println("yedinciKitap.getText() = " + yedinciKitap.getText());

        driver.close();
    }

}
