package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverMenu {


        WebDriver driver;
        Actions actions;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            actions = new Actions(driver);
            driver.get("https://demoqa.com/menu");
        }

        @Test
        public void hoverMenuTest() throws InterruptedException {


            WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
            actions.moveToElement(mainItem2).perform();
            Thread.sleep(1000);


            WebElement subSubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
            actions.moveToElement(subSubList).perform();
            Thread.sleep(1000);



            WebElement subSubItem1 = driver.findElement(By.xpath("//a[text()='Sub Sub Item 1']"));
            actions.moveToElement(subSubItem1).perform();
            Thread.sleep(1500);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }


