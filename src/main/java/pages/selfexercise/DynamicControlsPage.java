package pages.selfexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPage {
    private WebDriver driver;
    private By checkBtn = By.cssSelector("#checkbox-example > button");
    private By message = By.id("message");
    private By enDisBtn = By.cssSelector("#input-example > button");
    private By textField = By.cssSelector("#input-example > input");

    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waiting() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(message));
    }

    public void clickBtn() {
        driver.findElement(checkBtn).click();
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }

    public void clickEnable() {
        driver.findElement(enDisBtn).click();
    }

    public void enterText(String text) {
        driver.findElement(textField).sendKeys(text);
    }
}
