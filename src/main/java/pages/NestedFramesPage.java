package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String navigateToLeftFrame() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String text = getText();
        navigateToParent();
        return text;
    }

    public String navigateToBottomFrame() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-bottom");
        String text = getText();
        navigateToParent();
        return text;
    }

    public void navigateToParent() {
        driver.switchTo().parentFrame();
    }

    private String getText() {
        return driver.findElement(body).getText();
    }
}
