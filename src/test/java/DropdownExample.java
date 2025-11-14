import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {



        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/dropdown");


            WebElement dropdown = driver.findElement(By.id("dropdown"));


            Select select = new Select(dropdown);


            select.selectByVisibleText("Option 1");
            System.out.println("Selected Option 1");

            select.selectByValue("2");
            System.out.println("Selected Option 2");

            select.selectByIndex(1);
            System.out.println("Selected by Index 1");

            driver.quit();
        }
    }


