package tests.login;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTests;

import java.io.FileInputStream;
import java.io.IOException;

import static org.testng.Assert.assertEquals;


public class LoginWithExcelDataProvider extends BaseTests {


    XSSFWorkbook excelWorkbook = null;
    XSSFSheet excelSheet = null;
    XSSFRow row = null;
    XSSFCell cell = null;

    @Test(dataProvider = "getData")
    public void testLogin(String username, String pass, String isValid) {
        System.out.println(username + "  |   " + pass + "    |    " + isValid);

        var loginpage = homePage.navigateToFormAuthenticationPage();
        loginpage.setCredentials(username, pass);
        var loggedInPage = loginpage.clickLoginBtn();
        if (isValid == "true") {
            assertEquals(loggedInPage.getWelcomeMessage(), "You logged into a secure area!\n" + "×", "Not Matched");
        } else if (isValid == "false") {
            assertEquals(loginpage.getValidationMessage(), "Your username is invalid!\n" + "×");
        } else {
            assertEquals(loginpage.getValidationMessage(), "Your password is invalid!\n" + "×");
        }
    }

    @DataProvider // supplying data for a test method.
    public Object[][] getData() throws IOException {

        String path = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(path + "/testData/testData.xlsx"); // The .xlsx file name along with path
        excelWorkbook = new XSSFWorkbook(fis);
        // Read sheet inside the workbook by its name
        excelSheet = excelWorkbook.getSheet("Credentials"); //Your sheet name
        // Find number of rows in excel file
        System.out.println("First Row Number/index:" + excelSheet.getFirstRowNum() + " *** Last Row Number/index:"
                + excelSheet.getLastRowNum());
        int rowCount = excelSheet.getPhysicalNumberOfRows();
        int colCount = excelSheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Row Count is: " + rowCount
                + " *** Column count is: " + colCount);
        Object[][] data = new Object[rowCount - 1][colCount];
        for (int rNum = 1; rNum < rowCount; rNum++) {
            for (int cNum = 0; cNum < colCount; cNum++) {
                System.out.print(getCellData("Credentials", cNum, rNum) + " "); // Your sheet name
                data[rNum - 1][cNum] = getCellData("Credentials", cNum, rNum); //Your sheet name
            }
            System.out.println();
        }
        return data;
    }

    // Function will always used as below. It returns the data from a cell - No need to make any changes
    public String getCellData(String sheetName, int colNum, int rowNum) {
        try {
            int index = excelWorkbook.getSheetIndex(sheetName);
            excelSheet = excelWorkbook.getSheetAt(index);
            row = excelSheet.getRow(rowNum);
            cell = row.getCell(colNum);
            if (cell.getCellType() == CellType.STRING)
                return cell.getStringCellValue();
            else if (cell.getCellType() == CellType.NUMERIC
                    || cell.getCellType() == CellType.FORMULA) {
                String cellText = String.valueOf(cell.getNumericCellValue());
                return cellText;
            } else if (cell.getCellType() == CellType.STRING) {
                return "";

            } else
                return String.valueOf(cell.getBooleanCellValue());

        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colNum
                    + " does not exist in xls";
        }
    }


}