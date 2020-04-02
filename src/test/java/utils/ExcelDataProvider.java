package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelDataProvider {

    public static XSSFCell cell = null;


//    public static void main(String[] args) throws IOException {
//        String excelPath = "D:\\QC\\Study\\TAU\\Selenium WebDriver with Java Course\\new_selenium_project\\testData\\testData.xlsx";
//        String sheetName = "Credentials";
//        testData(excelPath, sheetName);
//    }

    public static Object[][] testData(String excelPath, String sheetName) throws IOException {
        ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        XSSFWorkbook wb = new XSSFWorkbook(excelPath);
        XSSFSheet sheet = wb.getSheetAt(0);


        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                String cellData = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(j));
//                System.out.println(cellData);
                data[i - 1][j] = cellData;

            }
        }
        return data;
    }

    @Test(dataProvider = "testData")
    public void testLogin(String username, String pass) {
        System.out.println(username + "  |   " + pass);
    }

    @DataProvider(name = "testData")
    public Object[][] getData() throws IOException {
        String excelPath = "D:\\QC\\Study\\TAU\\Selenium WebDriver with Java Course\\new_selenium_project\\testData\\testData.xlsx";
        Object[][] data = testData(excelPath, "Credentials");
        return data;
    }

}
