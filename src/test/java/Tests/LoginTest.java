package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.loginAs("zilola", "MySecretPass!");

        SecureAreaPage securePage = new SecureAreaPage(driver);
        System.out.println("Flash message: " + securePage.getFlashText());
        System.out.println("Logout visible: " + securePage.isLogoutVisible());

        securePage.clickLogout();

        driver.quit();
    }
}
