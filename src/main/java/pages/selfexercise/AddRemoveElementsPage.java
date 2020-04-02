package pages.selfexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveElementsPage {

    private WebDriver driver;
    private By addElementBtn = By.cssSelector(".example > button");
    private By addedElement = By.className("added-manually");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement(int click) {
        for (int i = 0; i < click; i++) {
            driver.findElement(addElementBtn).click();
        }
    }

    public int countAddedElements() {
        List<WebElement> elements = driver.findElements(addedElement);
        int elementsCount = elements.size();
        System.out.println("Total Number of added Elements :" + elementsCount);
        return elementsCount;
    }

    public void deleteElement() {
        driver.findElement(addedElement).click();
    }
}
