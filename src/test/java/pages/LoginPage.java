package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


        private final WebDriver driver;

        private final By usernameField = By.id("username");
        private final By passwordField = By.id("password");
        private final By loginButton = By.xpath("//button[@type='submit']");

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }

        public void open() {
            driver.get("https://the-internet.herokuapp.com/login");
        }

        public void enterUsername(String username) {
            driver.findElement(usernameField).sendKeys(username);
        }

        public void enterPassword(String password) {
            driver.findElement(passwordField).sendKeys(password);
        }

        public void clickLogin() {
            driver.findElement(loginButton).click();
        }

        public void loginAs(String username, String password) {
            enterUsername(username);
            enterPassword(password);
            clickLogin();
        }
    }
    //

