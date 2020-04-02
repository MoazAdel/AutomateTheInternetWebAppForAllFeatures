package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class CheckBoxesTests extends BaseTests {

    @Test
    public void testCheckBoxes() {
        var checkBoxesPage = homePage.navigateToCheckBoxesPage();
        checkBoxesPage.setCheckBox2();
    }
}
