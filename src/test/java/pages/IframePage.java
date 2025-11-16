package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePage {


        private final WebDriver driver;

        private final By framesMenu = By.linkText("Frames");
        private final By iframeMenu = By.linkText("iFrame");
        private final By editorFrame = By.id("mce_0_ifr");
        private final By textArea = By.id("tinymce");

        public IframePage(WebDriver driver) {
            this.driver = driver;
        }

        public void open() {
            driver.get("https://the-internet.herokuapp.com/");
            driver.findElement(framesMenu).click();
            driver.findElement(iframeMenu).click();
        }

        public void switchToEditor() {
            driver.switchTo().frame(driver.findElement(editorFrame));
        }

        public void typeText(String text) {
            driver.findElement(textArea).clear();
            driver.findElement(textArea).sendKeys(text);
        }

        public void switchBack() {
            driver.switchTo().defaultContent();
        }
    }


