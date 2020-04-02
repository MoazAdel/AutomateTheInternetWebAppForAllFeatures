package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {
    private WebDriver driver;
    private By nestedFramesPage = By.linkText("Nested Frames");

    public Frames(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage navigateToNestedFramespage() {
        driver.findElement(nestedFramesPage).click();
        return new NestedFramesPage(driver);
    }
}
