package tests.frames;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTests {

    @Test
    public void testFrames() {
        var framesPage = homePage.navigateToWysiwygEditorPage();
        framesPage.clearTextArea();
        framesPage.typeTextToTheTextArea("Wezza");
        framesPage.alignCenter();
        assertEquals(framesPage.getTextFromTheTextArea(), "Wezza");
    }
}
