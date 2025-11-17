package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

public class NestedFramesTest {

    private WebDriver driver;
    private NestedFramesPage framesPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        framesPage = new NestedFramesPage(driver);
        framesPage.open();
    }

    @Test
    public void testLeftFrame() {
        String text = framesPage.getLeftFrameText();
        Assert.assertEquals(text, "LEFT");
    }

    @Test
    public void testMiddleFrame() {
        String text = framesPage.getMiddleFrameText();
        Assert.assertEquals(text, "MIDDLE");
    }

    @Test
    public void testRightFrame() {
        String text = framesPage.getRightFrameText();
        Assert.assertEquals(text, "RIGHT");
    }

    @Test
    public void testBottomFrame() {
        String text = framesPage.getBottomFrameText();
        Assert.assertEquals(text, "BOTTOM");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
