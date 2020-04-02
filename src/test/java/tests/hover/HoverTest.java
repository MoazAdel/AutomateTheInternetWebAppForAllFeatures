package tests.hover;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTests {

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.navigateToHoversPage();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not Displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption Title is Incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption Link text is not Correct");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect");
        var userProfileClicked = caption.navigateToUserProfile();
        assertEquals(userProfileClicked.getMessage(), "Not Found");
    }
}
