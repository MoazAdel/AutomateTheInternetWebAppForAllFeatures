package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class AddDeleteElementsTests extends BaseTests {

    @Test
    public void testAddDeleteElements() {
        var addRemovePage = homePage.navigateToAddRemovePage();
        addRemovePage.clickAddElement(15);
        addRemovePage.deleteElement();
        addRemovePage.countAddedElements();
    }
}
