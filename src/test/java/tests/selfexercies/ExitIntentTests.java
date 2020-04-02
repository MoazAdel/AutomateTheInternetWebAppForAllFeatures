package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class ExitIntentTests extends BaseTests {

    @Test
    public void testExitIntent() {
        var exitIntentPage = homePage.navigateToExitIntentPage();
        exitIntentPage.exitIntent();
    }
}
