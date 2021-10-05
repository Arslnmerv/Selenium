package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
//    1. Yeni bir class olusturun (TekrarTesti)

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        drv.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);

        String actualTitle = drv.getTitle();
        String expectedTitle = "youtube";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Result CONFIRMED");
        } else {
            System.out.println("actualTitle = " + actualTitle);
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.

        String actualUrl = drv.getCurrentUrl();

        if (actualUrl.contains("youtube")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("actualUrl = " + actualUrl);
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        drv.navigate().to("https://www.amazon.com/ ");
        Thread.sleep(2000);


        //5. Youtube sayfasina geri donun

        drv.navigate().back();
        Thread.sleep(2000);


        //6. RefrSayfayi yenileyin

        drv.navigate().refresh();
        Thread.sleep(2000);


        //7. Amazon sayfasina donun

        drv.navigate().forward();
        Thread.sleep(2000);


        //8. Sayfayi tamsayfa yapin

        drv.manage().window().maximize();
        Thread.sleep(2000);


        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.

        if (drv.getTitle().contains("Amazon")) {
            System.out.println("Result CONFIRMED");
        } else {
            System.out.println("ActualUrl : " + drv.getTitle());
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın

        String actualUrlForAmo = drv.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";

        if (actualUrlForAmo.equals(expectedUrl)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("actualUrlForAmo = " + actualUrlForAmo);
        }
        //11.Sayfayi kapatin

        drv.close();
    }
}
