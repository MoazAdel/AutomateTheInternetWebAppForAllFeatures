package pages.dynamicpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2Page {
    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public Example2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn() {
        driver.findElement(startBtn).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public String getText() {
        return driver.findElement(loadedText).getText();
    }

}
