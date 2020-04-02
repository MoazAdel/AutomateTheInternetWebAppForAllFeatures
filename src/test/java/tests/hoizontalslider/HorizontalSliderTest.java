package tests.hoizontalslider;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testHorizontalSlider() {
        var horizontalSlider = homePage.navigateToHorizontalPage();
        horizontalSlider.sendRange("4");

    }
}
