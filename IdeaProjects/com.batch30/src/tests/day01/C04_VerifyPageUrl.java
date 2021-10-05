package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
//    Yeni bir class olusturalim : (VerifyURLTest)


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //    Techpro ana sayfasina gidelim https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com");
//    Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin

        String expectedurl = "www.techproeducation.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedurl.equals(actualUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Gecerli Url : " +actualUrl);
        }
    driver.close();
    }
}
