package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethods {

//    1. Yeni bir Class olusturalim.(NavigationMethods)
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //2. techpro ana sayfasina gidelim . https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com");
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //4. Tekrar TechPro’sayfasina donelim
        driver.navigate().back();
        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //7. Sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        //8. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();



    }
}
