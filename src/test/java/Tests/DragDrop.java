package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragDrop {

        WebDriver driver;
        Actions actions;

        @BeforeMethod
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            actions = new Actions(driver);
            driver.get("https://demoqa.com/droppable");
        }

        @Test
        public void dragDropBasic() throws InterruptedException {


            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            actions.dragAndDrop(source, target).perform();

            Thread.sleep(2000);
        }

        @Test
        public void dragDropAdvanced() throws InterruptedException {

            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));


            actions.clickAndHold(source)
                    .moveToElement(target)
                    .release()
                    .perform();

            Thread.sleep(2000);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }


