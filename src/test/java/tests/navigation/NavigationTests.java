package tests.navigation;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.navigateToDynamicPage().navigateToExample1Page();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().foTo("https://staging.cervello.io");
    }

    @Test
    public void testSwitchTab() {
        homePage.navigateToMultipleWindowsPage().clickLink();
    }
}
