package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
    public static void main(String[] args) {
        try {
            // Specify the path to your Excel file
            String excelFilePath = System.getProperty("user.dir") + "//excel//testdata.xlsx";

            // Create a FileInputStream to read the Excel file
            FileInputStream fileInputStream = new FileInputStream(excelFilePath);

            // Create a workbook instance
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            // Get the first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each row in the sheet
            for (Row row : sheet) {
                // Iterate through each cell in the row
                for (Cell cell : row) {
                    // Get the cell value based on its type
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        case BLANK:
                            System.out.print("[BLANK]\t");
                            break;
                        default:
                            System.out.print("[UNKNOWN]\t");
                    }
                }
                System.out.println(); // Move to the next line for the next row
            }

            // Close the workbook and FileInputStream
            workbook.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
