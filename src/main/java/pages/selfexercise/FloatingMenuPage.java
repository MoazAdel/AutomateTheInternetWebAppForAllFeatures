package pages.selfexercise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPage {
    private WebDriver driver;

    public FloatingMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDownToElement() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String script = "window.scrollBy(0,1000)";
        jse.executeScript(script);
    }
}
