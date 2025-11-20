package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHover {



        WebDriver driver;
        Actions actions;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            actions = new Actions(driver);
            driver.get("https://www.amazon.in/");
        }

        @Test
        public void hoverAndClickAmazonMenu() throws InterruptedException {

            WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
            actions.moveToElement(accountList).perform();
            Thread.sleep(1500);


            WebElement yourOrders = driver.findElement(By.xpath("//span[text()='Your Orders']"));
            actions.moveToElement(yourOrders).click().perform();
            Thread.sleep(2000);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }


