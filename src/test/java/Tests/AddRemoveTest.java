package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddRemovePage;

public class AddRemoveTest {



        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            try {
                driver.manage().window().maximize();
                AddRemovePage page = new AddRemovePage(driver);

                page.open();


                page.clickAdd();
                page.clickAdd();
                page.clickAdd();

                System.out.println("Delete buttons count: " + page.countDeleteButtons());


                page.clickDelete();
                page.clickDelete();

                System.out.println("Delete buttons count after deleting: " + page.countDeleteButtons());

            } finally {
                driver.quit();
            }
        }
    }

