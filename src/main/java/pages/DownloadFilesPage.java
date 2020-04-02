package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DownloadFilesPage {
    private WebDriver driver;
    private By fileToDownload = By.cssSelector(".example > a");

    public DownloadFilesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void downloadLastFile() {
        //We find the download links
        List<WebElement> list = driver.findElements(fileToDownload);

        //Click to the link to download the last file
        WebElement el = list.get(list.size() - 1);
        el.click();
    }

    public void downloadFileByText(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
