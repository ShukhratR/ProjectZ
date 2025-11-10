import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  SeleniumDay1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");
        Thread.sleep(2000);

        WebDriverManager.chromedriver().setup();


        driver.get("https://login.yahoo.com/");
        Thread.sleep(2000);

  // git team work practice

    }}


















        /*  // name
        driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
        driver.findElement(By.name("signin")).click();

    }
}

        // id:
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("testZilola@yahoo");
        Thread.sleep(2000);

        WebElement nextBtn = driver.findElement(By.id("login-signin"));

        nextBtn.click();

        driver.findElement(By.id("login-username"));
    }}

   // xpath
   driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test@yahoo.com");
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();


          driver.findElement(By.cssSelector("#login-username")).sendKeys("test@yahoo.com");
        driver.findElement(By.cssSelector("#login-signin")).click();


        //driver.findElement(By.linkText("Difficulty signing in?")).click();
//driver.findElement(By.linkText("Sign up")).click();


       */






