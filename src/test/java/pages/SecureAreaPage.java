package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private final WebDriver driver;
    private final By flashMessage = By.id("flash");
    private final By logoutLink = By.xpath("//a[@href='/logout']");

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getFlashText() {
        return driver.findElement(flashMessage).getText();
    }

    public boolean isLogoutVisible() {
        return !driver.findElements(logoutLink).isEmpty();
    }

    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}



