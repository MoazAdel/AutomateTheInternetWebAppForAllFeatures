package utils;

import java.io.IOException;

public class ExcelUtilsDemo {

    public static void main(String[] args) throws IOException {
        String projectPath = System.getProperty("user.dir");

        ExcelUtils excelUtils = new ExcelUtils(projectPath + "/testData/testData.xlsx", "Credentials");
        excelUtils.getRowCount();
        excelUtils.getCellDataNumber(1, 2);
    }
}
