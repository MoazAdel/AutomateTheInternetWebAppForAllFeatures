package tests.modal;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTests {

    private String message = "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).";

    @Test
    public void testModal() {
        var modalPage = homePage.navigateToEntryAdPage();
        assertEquals(modalPage.getMessage(), message, "Wrong Message");
    }
}
