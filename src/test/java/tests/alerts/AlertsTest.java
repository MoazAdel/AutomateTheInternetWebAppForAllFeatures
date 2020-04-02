package tests.alerts;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTests {

    private String text = "Wezza";

    @Test
    public void testAcceptAlert() {
        var alertsPage = homePage.navigateToAlertsPage();
        alertsPage.clickJsButton();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert", "Result doesn't match");
    }

    @Test
    public void testDismissAlert() {
        var alertsPage = homePage.navigateToAlertsPage();
        alertsPage.clickJsButton();
        alertsPage.dismissAlert();
    }

    @Test
    public void testPromptAlert() {
        var alertpage = homePage.navigateToAlertsPage();
        alertpage.clickPromptAlert();
        alertpage.setTextToAlert(text);
        alertpage.acceptAlert();
        assertEquals(alertpage.getResult(), "You entered: " + text);
    }
}
