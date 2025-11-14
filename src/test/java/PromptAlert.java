import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        driver.findElement(By.id("promptBox")).click();
        Alert PromtAlert = driver.switchTo().alert();
        System.out.println(PromtAlert.getText());
        PromtAlert.sendKeys("Zilola test passed");
        PromtAlert.accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();

    }

}
