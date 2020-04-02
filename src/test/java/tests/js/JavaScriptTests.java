package tests.js;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable() {
        homePage.navigateToLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.navigateToInfiniteScrollPage().scrollToParagraph(3);
    }

    @Test
    public void testAddMultipleAttributeToDropdown() {
        var dropdownPage = homePage.navigateToDropdownPage();
        dropdownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropDown);

        var selectedOptions = dropdownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
