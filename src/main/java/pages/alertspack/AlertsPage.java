package pages.alertspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By jsAlert = By.cssSelector("li:nth-child(1) > button");
    private By result = By.id("result");
    private By jsPrompt = By.cssSelector("li:nth-child(3) > button");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJsButton() {
        driver.findElement(jsAlert).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void clickPromptAlert() {
        driver.findElement(jsPrompt).click();
    }

    public void setTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult() {
        return driver.findElement(result).getText();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

}
