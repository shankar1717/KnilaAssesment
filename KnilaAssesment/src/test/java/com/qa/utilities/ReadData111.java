package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData111 {
    public static void main(String[] args) {
        FileInputStream excelFile = null;
        try {
            // Provide the path to your Excel file
            String filePath = System.getProperty("user.dir") + "/excel/testdata.xlsx";
            excelFile = new FileInputStream(filePath);

            // Create a workbook instance
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);

            // Specify the sheet you want to read from
            Sheet sheet = workbook.getSheetAt(0); // Assuming it's the first sheet

            // Iterate over rows and columns to read and print only the cell values
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println(); // Move to the next row
            }

            // Close the workbook and FileInputStream
            workbook.close();
            excelFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
