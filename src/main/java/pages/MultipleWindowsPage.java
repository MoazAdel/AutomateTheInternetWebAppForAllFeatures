package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickLink = By.cssSelector("#content a");

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLink() {
        driver.findElement(clickLink).click();
    }
}
