package pages.hoverspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersFromHover {
    private WebDriver driver;
    private By message = By.tagName("h1");

    public UsersFromHover(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }
}
