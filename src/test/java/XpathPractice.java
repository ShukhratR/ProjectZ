import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addButton.click();
        Thread.sleep(1000);


        addButton.click();
        Thread.sleep(1000);
        addButton.click();
        Thread.sleep(1000);

        WebElement deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        deleteButton.click();
        Thread.sleep(1000);

        deleteButton = driver.findElement(By.xpath("//button[text()='Delete']"));
        deleteButton.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
