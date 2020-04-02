package tests.selfexercies;

import org.testng.annotations.Test;
import tests.base.BaseTests;

import java.io.File;

import static org.testng.Assert.assertTrue;

public class FileDownloadTests extends BaseTests {

    private String filenameToDownload = "SomeFile.txt";

    @Test
    public void testDownloadLastFile() {
        var fileDownloadPage = homePage.navigateToDownloadPage();
        fileDownloadPage.downloadLastFile();
        setBaseFileDownloadTest();
    }

    @Test
    public void testDownloadSpecificFile() {
        var fileDownloadPage = homePage.navigateToDownloadPage();
        fileDownloadPage.downloadFileByText("login.txt");
    }

    public void setBaseFileDownloadTest() {
        File folder = new File(System.getProperty("C:\\Users\\Moaz\\Downloads"));

//List the files on that folder
        File[] listOfFiles = folder.listFiles();
        boolean found = false;
        File f = null;
        //Look for the file in the files
        // You should write smart REGEX according to the filename
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();
                System.out.println("File " + listOfFile.getName());
                if (fileName.matches("SomeFile.txt")) {
                    f = new File(fileName);
                    found = true;
                }
            }
        }
        assertTrue(found, "Downloaded document is not found");
        f.deleteOnExit();
    }
}
