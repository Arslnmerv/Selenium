package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        //e-mail textbox'a ali yazdiralim

        WebElement mailTextBox = driver.findElement(By.id("email"));
        mailTextBox.sendKeys("aliseleniumcu@gmail.com");

        Thread.sleep(2000);
        mailTextBox.clear();

        WebElement mailKutusutagNameIle = driver.findElement(By.tagName("input"));
        //    mailKutusutagNameIle.sendKeys("veliGocer@gmail.com");
        // input tagnamei ile 6 tane webelement oldugundan hangisini yazacagina karar veremiyor
        // WebElement yanlisElement = driver.findElement(By.id("emailyanlis"));
        // yanlisElement.sendKeys("yanlis eleman");
        // NoSuchElementException = locatorsda hata var demektir

        // giris yap butonuna tiklayalim
        WebElement girisButonu = driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
        girisButonu.click();

    }
}
