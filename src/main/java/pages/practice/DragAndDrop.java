package pages.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    private WebDriver driver;
    private By element = By.id("column-a");
    private By destination = By.id("column-b");
    private By destinationText = By.cssSelector("#column-b > header");

    public DragAndDrop(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDropElement() {
        WebElement fromWebElement = driver.findElement(element);
        WebElement toWebElement = driver.findElement(destination);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(fromWebElement, toWebElement).build().perform();
//        actions.clickAndHold(fromWebElement)
//                .moveToElement(toWebElement)
//                .release(toWebElement)
//                .build()
//                .perform();
    }

    public String getDestinationText() {
        return driver.findElement(destinationText).getText();
    }
}
