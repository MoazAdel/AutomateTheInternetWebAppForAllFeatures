package tests.exercises;

import org.testng.annotations.Test;
import tests.base.BaseTests;

public class DragAndDropTests extends BaseTests {

    @Test
    public void testDragAndDrop() {
        var dragAndDropPage = homePage.navigateToDragAndDropPage();
        dragAndDropPage.dragAndDropElement();
//        assertEquals(dragAndDropPage.getDestinationText(),"A");
    }
}
