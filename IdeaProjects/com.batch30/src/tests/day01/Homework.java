package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    //1.Yeni bir class olusturalim (Homework)

    public static void main(String[] args) throws InterruptedException {

        //2.ChromeDriver kullanarak, linkendIn sayfasina gidin ve sayfa basliginin (title) “linkedIn”
        //    oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver drv = new ChromeDriver();

        drv.get("https://www.linkedin.com/in/merve-arslan-193a59221/");
        Thread.sleep(2000);
        String expectedTitle = "linkedIn";
        String actualTitle = drv.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED \n Gecerli baslik: " + actualTitle);
        }
        // 3.Sayfa URL’inin “linkedin” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.

        String actualUrl = drv.getCurrentUrl();
        if (actualUrl.contains("linkedin")) {
            System.out.println("Result CONFIRMED");
        } else {
            System.out.println("actualUrl = " + actualUrl);
        }
        //4.https://www.walmart.com/ sayfasina gidin.

        drv.get("https://www.walmart.com/");
        Thread.sleep(2000);

        // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        if (drv.getTitle().contains("Walmart.com")) {
            System.out.println("Test PASSED");
        }
        // 6. Tekrar “linkedIn” sayfasina donun

        drv.navigate().back();
        Thread.sleep(2000);

        //7. Sayfayi yenileyin

        drv.navigate().refresh();
        Thread.sleep(2000);

        //8. Sayfayi tam sayfa (maximize) yapin

        drv.manage().window().maximize();
        Thread.sleep(2000);

        //9.Browser’i kapatin

        drv.close();
    }
}
