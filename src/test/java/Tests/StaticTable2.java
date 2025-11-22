package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class StaticTable2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        WebElement table = driver.findElement(By.id("customers"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement r : rows) {
            List<WebElement> cells = r.findElements(By.tagName("td"));
            for (WebElement c : cells) {
                System.out.print(c.getText() + " ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
