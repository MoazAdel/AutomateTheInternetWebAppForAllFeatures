package tests.navigation;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class NavigationExercise extends BaseTests {

    @Test
    public void testCTLAndRightClick() {
        var dynamicPage = homePage.navigateToDynamicPage();
        dynamicPage.openInANewPage();
    }
}
