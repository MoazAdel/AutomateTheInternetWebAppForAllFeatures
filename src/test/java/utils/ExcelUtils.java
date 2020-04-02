package utils;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String excelPath, String sheetName) throws IOException {
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet(sheetName);

    }

    public int getRowCount() {
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("Number of rows : " + rowCount);
        return rowCount;
    }

    public int getColCount() {
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println("Number of rows : " + colCount);
        return colCount;
    }


    public String getCellData(int rowNum, int colNum) throws IOException {
        String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        String cellData1 = new DataFormatter().formatCellValue(sheet.getRow(rowNum).getCell(colNum));
//      System.out.println(cellData);
        return cellData;
    }

    public void getCellDataNumber(int rowNum, int colNum) throws IOException {
        double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//      System.out.println(cellData);
    }

}