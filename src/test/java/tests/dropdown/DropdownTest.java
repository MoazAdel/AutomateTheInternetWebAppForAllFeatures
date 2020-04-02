package tests.dropdown;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {

    String option = "Option 2";

    @Test
    public void testSelectedOptions() {
        var dropdownPage = homePage.navigateToDropdownPage();
        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
