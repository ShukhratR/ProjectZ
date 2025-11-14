import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");


            driver.findElement(By.id("confirmBox")).click();

            Alert confirmAlert = driver.switchTo().alert();
            System.out.println(confirmAlert.getText());
            Thread.sleep(2000);
            confirmAlert.dismiss();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.id("output")).getText());

            driver.quit();
}
}