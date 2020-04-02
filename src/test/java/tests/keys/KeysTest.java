package tests.keys;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTests {


    @Test
    public void testSendKeys() {
        var keysPage = homePage.navigateToKeyPressesPage();
        keysPage.writeKeys("A" + Keys.BACK_SPACE);
        assertEquals(keysPage.getResult(), "You entered: BACK_SPACE");
        assertEquals(keysPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        var keysPage = homePage.navigateToKeyPressesPage();
        keysPage.writeKeys(Keys.chord(Keys.ALT, "p") + "=3.14");
        assertEquals(keysPage.getResult(), "You entered: BACK_SPACE");
    }
}
