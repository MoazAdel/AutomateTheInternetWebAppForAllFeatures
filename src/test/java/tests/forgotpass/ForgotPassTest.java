package tests.forgotpass;

import org.testng.annotations.Test;
import pages.gorgotpasspack.EmailSentPage;
import pages.gorgotpasspack.ForgotPasswordPage;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class ForgotPassTest extends BaseTests {

    private String email = "wezza@wezza.wezza";

    @Test
    public void testForgotPass() {
        ForgotPasswordPage forgotPasswordPage = homePage.navigateToForgotPasswordPage();
        forgotPasswordPage.setEmailField(email);
        EmailSentPage emailSentPage = forgotPasswordPage.submitEmail();
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Content doesn't match!!!");
    }
}
