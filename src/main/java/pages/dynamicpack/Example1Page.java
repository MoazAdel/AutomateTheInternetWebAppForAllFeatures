package pages.dynamicpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Example1Page {

    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public Example1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartBtn() {
        driver.findElement(startBtn).click();
//        WebDriverWait wait = new WebDriverWait(driver,5);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}
