package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class CheckBrokenImagesTests extends BaseTests {

    @Test
    public void testBrokenImages() {
        var brokenImagesPage = homePage.navigateToBrokenImagesPage();
        brokenImagesPage.checkBrokenImages();
    }
}
