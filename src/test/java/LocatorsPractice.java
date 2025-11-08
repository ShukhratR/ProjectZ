import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
        searchBox.sendKeys("laptop");

        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();

        WebElement firstResultTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal")));
        System.out.println("First result title: " + firstResultTitle.getText());

        WebElement firstResultLink = driver.findElement(By.xpath("(//h2/a)[1]"));
        firstResultLink.click();

        WebElement addToCartBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
        addToCartBtn.click();

        driver.get("https://www.amazon.com/");
        WebElement bestSellersLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Best Sellers")));
        System.out.println("Link text found: " + bestSellersLink.getText());

        WebElement DealsPartialLink = driver.findElement(By.partialLinkText("Deals"));
        System.out.println("Partial link text found: " + DealsPartialLink.getText());

        driver.quit();
    }
}

