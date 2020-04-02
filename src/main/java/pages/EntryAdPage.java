package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private WebDriver driver;
    private By modalParagraph = By.cssSelector(".modal-body > p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(modalParagraph)
        ));
        return driver.findElement(modalParagraph).getText();
    }
}
