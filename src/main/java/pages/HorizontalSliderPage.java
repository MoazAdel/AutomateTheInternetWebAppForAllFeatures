package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.cssSelector("input[type=range]");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendRange(String value) {
        while (!(driver.findElement(range).getText().equals(value))) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
