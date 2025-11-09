import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathPracticeLink {



        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/checkboxes");

            List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

            for (WebElement checkbox : checkboxes) {
                if (!checkbox.isSelected()) {
                    checkbox.click();
                    Thread.sleep(500);
                }
            }

            driver.quit();
        }
    }


