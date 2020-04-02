package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private By textArea = By.id("tinymce");
    private By alignCenter = By.cssSelector(".mce-i-aligncenter");
    private By textWrote = By.cssSelector("#tinymce > p");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditArea() {
        driver.switchTo().frame("mce_0_ifr");
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToParentPage();
    }

    public void switchToParentPage() {
        driver.switchTo().parentFrame();
    }

    public void typeTextToTheTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToParentPage();
    }

    public void alignCenter() {
        driver.findElement(alignCenter).click();
    }

    public String getTextFromTheTextArea() {
        switchToEditArea();
        String text = driver.findElement(textWrote).getText();
        switchToParentPage();
        return text;
    }
}
