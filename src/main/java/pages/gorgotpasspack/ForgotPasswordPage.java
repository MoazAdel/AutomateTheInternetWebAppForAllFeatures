package pages.gorgotpasspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By submitBtn = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage submitEmail() {
        driver.findElement(submitBtn).click();
        return new EmailSentPage(driver);
    }
}
