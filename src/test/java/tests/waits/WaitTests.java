package tests.waits;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testElementInvisibility() {
        var dynamicPage = homePage.navigateToDynamicPage();
        var example1Page = dynamicPage.navigateToExample1Page();
        example1Page.clickStartBtn();
        assertEquals(example1Page.getLoadedText(), "Hello World!", "Incorrect Message appears");
    }

    @Test
    public void testElementVisibility() {
        var dynamicPage = homePage.navigateToDynamicPage();
        var example2Page = dynamicPage.navigateToExample2Page();
        example2Page.clickStartBtn();
        assertEquals(example2Page.getText(), "Hello World!");
    }
}
