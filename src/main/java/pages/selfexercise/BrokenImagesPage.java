package pages.selfexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImagesPage {
    private WebDriver driver;
    private By images = By.tagName("img");

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkBrokenImages() {
        for (WebElement image : driver.findElements(images)) {
            isImageBroken(image);
        }
    }

    public void isImageBroken(WebElement image) {
        if (image.getAttribute("naturalWidth").equals("0")) {
            System.out.println(image.getAttribute("outerHTML") + " is Broken");
        }
    }
}
