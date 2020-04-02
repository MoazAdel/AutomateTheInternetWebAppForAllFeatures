package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class FloatingMenuTests extends BaseTests {

    @Test
    public void testFloatingMenu() {
        var floatingMenuPage = homePage.navigateToFloatingMenupage();
        floatingMenuPage.scrollDownToElement();
    }
}
