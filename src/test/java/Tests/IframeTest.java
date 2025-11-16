package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.IframePage;

public class IframeTest {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testWritingInsideIframe() {

        IframePage iframePage = new IframePage(driver);

        iframePage.open();
        iframePage.switchToEditor();
        iframePage.typeText("Practicing iFrame in Selenium!");
        iframePage.switchBack();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}





