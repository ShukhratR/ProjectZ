import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://login.yahoo.com/");

        // id:
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("testZilola@yahoo");

        WebElement nextBtn = driver.findElement(By.id("login-signin"));
        nextBtn.click();




    }
}
