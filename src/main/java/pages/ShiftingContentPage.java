package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By ex1Link = By.linkText("Example 1: Menu Element");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToExample1() {
        driver.findElement(ex1Link).click();
    }


}
