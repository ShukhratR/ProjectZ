package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {




    private final WebDriver driver;

    private final By addButton = By.xpath("//button[text()='Add Element']");
    private final By deleteButtons = By.xpath("//button[text()='Delete']");

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    public void clickAdd() {
        driver.findElement(addButton).click();
    }

    public void clickDelete() {
        List<WebElement> deletes = driver.findElements(deleteButtons);
        if (!deletes.isEmpty()) {
            deletes.get(0).click(); // delete first one
        }
    }

    public int countDeleteButtons() {
        return driver.findElements(deleteButtons).size();
    }
}

