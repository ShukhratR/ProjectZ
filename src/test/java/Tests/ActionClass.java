package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionClass {





        WebDriver driver;
        Actions actions;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            actions = new Actions(driver);
            driver.get("https://demoqa.com/buttons");
        }

        @Test
        public void performActions() throws InterruptedException {


            WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
            actions.doubleClick(doubleClickBtn).perform();
            Thread.sleep(1000);


            WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(rightClickBtn).perform();
            Thread.sleep(1000);

            WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
            actions.click(clickMeBtn).perform();
            Thread.sleep(1000);


            driver.navigate().to("https://demoqa.com/menu");
            WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
            actions.moveToElement(mainItem2).perform();
            Thread.sleep(1000);


            actions.sendKeys("\n").perform();
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }


