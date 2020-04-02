package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class DynamicControlsTests extends BaseTests {

    private String text = "Wezza";

    @Test
    public void testAddElement() {
        var dynamicControlPage = homePage.navigateToDynamicControlsPage();
        dynamicControlPage.clickBtn();
        dynamicControlPage.waiting();
        assertEquals(dynamicControlPage.getMessage(), "It's gone!");
        dynamicControlPage.clickBtn();
        dynamicControlPage.waiting();
        assertEquals(dynamicControlPage.getMessage(), "It's back!");
    }

    @Test
    public void testEnableElement() {
        var dynamicControlPage = homePage.navigateToDynamicControlsPage();
        dynamicControlPage.clickEnable();
        dynamicControlPage.waiting();
        assertEquals(dynamicControlPage.getMessage(), "It's enabled!");
        dynamicControlPage.enterText(text);
        dynamicControlPage.clickEnable();
        dynamicControlPage.waiting();
        assertEquals(dynamicControlPage.getMessage(), "It's disabled!");
    }
}
