package tests.context;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class ContextAlertTest extends BaseTests {

    @Test
    public void testContextAlert() {
        var contextPage = homePage.navigateToContextMenuPage();
        contextPage.rightClickOnTheSpot();
        String message = contextPage.getAlertText();
        contextPage.acceptAlert();
        assertEquals(message, "You selected a context menu");
    }
}
