package pages.loginpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginBtn = By.className("radius");
    private By validationMessage = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCredentials(String userName, String pass) {
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(pass);
    }

    public SecureAreaPage clickLoginBtn() {
        driver.findElement(loginBtn).click();
        return new SecureAreaPage(driver);
    }

    public String getValidationMessage() {
        return driver.findElement(validationMessage).getText();
    }


}
