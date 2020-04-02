package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ExitIntentPage {
    private WebDriver driver;
    private By intentModal = By.className("modal-body");

    public ExitIntentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void exitIntent() {
        Actions action = new Actions(driver);
        action.moveByOffset(600, -1).build().perform();
    }

    public String getMessage() {
        return driver.findElement(intentModal).getText();
    }
}
