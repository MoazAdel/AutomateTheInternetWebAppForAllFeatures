package tests.frames;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTests {

    @Test
    public void testNestedFramesLeft() {
        var framesPage = homePage.navigateToFramesPage();
        var nestedFramesPage = framesPage.navigateToNestedFramespage();
        assertEquals(nestedFramesPage.navigateToLeftFrame(), "LEFT", "Text doesn't match");
    }

//    @Test
//    public void testNestedFramesBottom() {
//        var framesPage = homePage.navigateToFramesPage();
//        var nestedFramesPage = framesPage.navigateToNestedFramespage();
//        assertEquals(nestedFramesPage.navigateToBottomFrame(),"BOTTOM","Text doesn't match");
//    }
}
