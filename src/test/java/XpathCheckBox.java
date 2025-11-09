import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Form Authentication")).click();

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        username.sendKeys("Zilola");
        Thread.sleep(1000);

        password.sendKeys("rustamova09");
        Thread.sleep(1000);

        loginBtn.click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Elemental Selenium")).click();

        driver.quit();
    }
}
