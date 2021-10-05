package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
//    Yeni bir Class olusturalim. (VerifyTitle)

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Amazon ana sayfasina gidelim . https://www.amazon.com/
         driver.get("https://www.amazon.com");
        // Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile ayni, test PASSED");
        }else{
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : " + driver.getTitle());
        }
        driver.close();
    }
}
