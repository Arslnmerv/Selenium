package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //  1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        // 2- Add Element butonuna basin
        addButonu.click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()) {
            System.out.println("delete butonu testi PASS");
        } else {
            System.out.println("delete butonu testi FAILED!");
        }
        //4- Delete tusuna basin
        deleteButonu.click();
        Thread.sleep(2000);

        //5- Delete butonunun gorunur olmadigini test edin
        // eger butone bastigimizda HTML kodundaki satir da siliniyorsa
        // driver'in o elemente ulasmasi mumkun olmayacagindan
        // varligini yada yoklugunu test etmemiz mumkun olmaz
        // varolan bir element bu sekilde silindikten sonra locate etmeye calisirsak
        // StaleElementReferenceException exception'i aliriz

        /*
        if (!deleteButonu.isDisplayed()){
            System.out.println("delete butonu gorunmuyor testi PASS");
        } else {
            System.out.println("delete butonu gorunmuyor testi FAILED");
        }
        */
        driver.close();
    }
}
