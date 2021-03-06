package utils;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class DataP {

    XSSFWorkbook excelWorkbook = null;
    XSSFSheet excelSheet = null;
    XSSFRow row = null;
    XSSFCell cell = null;

    @DataProvider // supplying data for a test method.
    public Object[][] getData() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\QC\\Study\\TAU\\Selenium WebDriver with Java Course\\new_selenium_project\\testData\\testData.xlsx"); // Your .xlsx file name along with path
        excelWorkbook = new XSSFWorkbook(fis);
        // Read sheet inside the workbook by its name
        excelSheet = excelWorkbook.getSheet("Sheet1"); //Your sheet name
        // Find number of rows in excel file
        System.out.println("First Row Number/index:" + excelSheet.getFirstRowNum() + " *** Last Row Number/index:"
                + excelSheet.getLastRowNum());
        int rowCount = excelSheet.getLastRowNum() - excelSheet.getFirstRowNum() + 1;
        int colCount = excelSheet.getRow(0).getLastCellNum();
        System.out.println("Row Count is: " + rowCount
                + " *** Column count is: " + colCount);
        Object[][] data = new Object[rowCount - 1][colCount];
        for (int rNum = 1; rNum <= rowCount; rNum++) {
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
            if (rowNum <= 0)
                return "";
            int index = excelWorkbook.getSheetIndex(sheetName);
            if (index == -1)
                return "";
            excelSheet = excelWorkbook.getSheetAt(index);
            row = excelSheet.getRow(rowNum - 1);
            if (row == null)
                return "";
            cell = row.getCell(colNum);
            if (cell == null)
                return "";
            if (cell.getCellType() == CellType.STRING)
                return cell.getStringCellValue();
            else if (cell.getCellType() == CellType.NUMERIC
                    || cell.getCellType() == CellType.FORMULA) {
                String cellText = String.valueOf(cell.getNumericCellValue());
                return cellText;
            } else if (cell.getCellType() == CellType.STRING)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        } catch (Exception e) {
            e.printStackTrace();
            return "row " + rowNum + " or column " + colNum
                    + " does not exist in xls";
        }
    }


}
