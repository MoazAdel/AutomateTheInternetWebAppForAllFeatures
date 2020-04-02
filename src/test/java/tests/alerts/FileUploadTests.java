package tests.alerts;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    private String absoluteFilePath = "D:\\Spies In Disguise (2019) [720p] [BluRay] [YTS.MX]\\spies-in-disguise_arabic-2153193.zip";

    @Test
    public void testUploadFile() {
        var uploadFilePage = homePage.navigateToFileUploadPage();
        var test = uploadFilePage.uploadFile(absoluteFilePath);
        assertEquals(test.verifyUploadedFiles(), "spies-in-disguise_arabic-2153193.zip");
    }
}
