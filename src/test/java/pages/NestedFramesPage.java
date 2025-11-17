package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {


        private final WebDriver driver;

        private final By bodyText = By.tagName("body");
        private final String topFrame = "frame-top";
        private final String leftFrame = "frame-left";
        private final String middleFrame = "frame-middle";
        private final String rightFrame = "frame-right";
        private final String bottomFrame = "frame-bottom";

        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;

        }

        public void open() {
            driver.get("https://the-internet.herokuapp.com/nested_frames");
        }

        public String getLeftFrameText() {
            driver.switchTo().frame(topFrame);
            driver.switchTo().frame(leftFrame);
            String text = driver.findElement(bodyText).getText();
            driver.switchTo().defaultContent();
            return text;
        }

        public String getMiddleFrameText() {
            driver.switchTo().frame(topFrame);
            driver.switchTo().frame(middleFrame);
            String text = driver.findElement(By.id("content")).getText();
            driver.switchTo().defaultContent();
            return text;
        }

        public String getRightFrameText() {
            driver.switchTo().frame(topFrame);
            driver.switchTo().frame(rightFrame);
            String text = driver.findElement(bodyText).getText();
            driver.switchTo().defaultContent();
            return text;
        }

        public String getBottomFrameText() {
            driver.switchTo().frame(bottomFrame);
            String text = driver.findElement(bodyText).getText();
            driver.switchTo().defaultContent();
            return text;
        }
    }

