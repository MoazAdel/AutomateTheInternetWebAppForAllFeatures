package pages.dynamicpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By ex1 = By.xpath(".//a[@href=\"/dynamic_loading/1\"]");
    private By ex2 = By.cssSelector(".example > a:nth-child(8)");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page navigateToExample1Page() {
        driver.findElement(ex1).click();
        return new Example1Page(driver);
    }

    public Example2Page navigateToExample2Page() {
        driver.findElement(ex2).click();
        return new Example2Page(driver);
    }

    public Example2Page openInANewPage() {
        Actions actions = new Actions(driver);
        driver.findElement(ex2).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
        return new Example2Page(driver);
    }

}
