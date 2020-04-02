package pages.selfexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeoLocationPage {
    private WebDriver driver;
    private By locateBtn = By.cssSelector(".example > button");
    private By latVal = By.id("lat-value");
    private By lngVal = By.id("long-value");
    private By map = By.id("map-link");
    private By mapCoordinates = By.cssSelector(".section-hero-header-title-description > h2");
    private By mapMatching = By.cssSelector("#gs_lc50 > input[value]");

    public GeoLocationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void locateMe() {
        driver.findElement(locateBtn).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(latVal)));
    }

    public void acceptLocation() {
        driver.switchTo().alert().accept();
    }

    public void rejectLocation() {
        driver.switchTo().alert().dismiss();
    }

    public String getLatVal() {
        waitExplicitly(driver.findElement(latVal));
        return driver.findElement(latVal).getText();
    }

    public String getLongVal() {
        waitExplicitly(driver.findElement(lngVal));
        return driver.findElement(lngVal).getText();
    }

    public String navigateToMap() {
        driver.findElement(map).click();
        return driver.getTitle();
    }

    public void waitExplicitly(WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }

    public String getCoordinates() {
        return driver.findElement(mapCoordinates).getText();
    }

    public String getMapCoordinates() {
        return driver.findElement(mapMatching).getText();
    }

}
