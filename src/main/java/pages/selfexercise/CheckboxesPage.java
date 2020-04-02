package pages.selfexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkBox1 = By.cssSelector("#checkboxes > input:nth-child(1)");
    private By checkBox2 = By.cssSelector("#checkboxes > input:nth-child(3)");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCheckBox1() {
        isBoxChecked();
        driver.findElement(checkBox1).click();
    }

    public void setCheckBox2() {
        isBoxChecked();
        driver.findElement(checkBox2).click();
    }

    public void isBoxChecked() {
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        Iterator<WebElement> iter = checkBoxes.iterator();
        while (iter.hasNext()) {
            WebElement we = iter.next();
            if (we.isSelected()) {
                we.click();
            }
        }
    }
}
