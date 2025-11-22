package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {

        public static void main(String[] args) {

                    WebDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();

                    driver.get("https://testpages.herokuapp.com/styled/tag/table.html");

                    WebElement table = driver.findElement(By.id("mytable"));
                    List<WebElement> rows = table.findElements(By.tagName("tr"));

                    for (WebElement row : rows) {
                        List<WebElement> cells = row.findElements(By.tagName("td"));
                        for (WebElement c : cells) {
                            System.out.print(c.getText() + " | ");
                        }
                        System.out.println();
                    }

                    driver.quit();
                }
            }


