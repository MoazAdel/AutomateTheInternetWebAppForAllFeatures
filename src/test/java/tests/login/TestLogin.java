package tests.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class TestLogin extends BaseTests {


    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        // The number of times data is repeated,
        // test will be executed the same no. of times
        return new Object[][]{{"test1", "12345", false}, {"tomsmith", "SuperSecretPassword!", true}};

    }

    @Test
    public void testSuccessfulLogin() {
        var loginPage = homePage.navigateToFormAuthenticationPage();
        loginPage.setCredentials("tomsmith", "SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginBtn();
        assertEquals(secureAreaPage.getWelcomeMessage(), "Welcome to the Secure Area. When you are done click logout below.", "Not Matched");
    }

    @Test(dataProvider = "Authentication")
    public void testLoginWithDataProvider(String username, String pass, boolean isValidCredential) {
        var loginPage = homePage.navigateToFormAuthenticationPage();
        loginPage.setCredentials(username, pass);
        var secureAreaPage = loginPage.clickLoginBtn();
        if (isValidCredential == true) {
            assertEquals(secureAreaPage.getWelcomeMessage(), "You logged into a secure area!\n" + "x", "Not Matched");
        } else {
            assertEquals(loginPage.getValidationMessage(), "Your username is invalid!\n" + "×");
        }
    }


}
