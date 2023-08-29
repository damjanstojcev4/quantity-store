package com.damjan.quantitystore.excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.damjan.quantitystore.domain.Item;

import java.io.IOException;
import java.util.List;

public class ExcelGenerator {
    public void generateExcel(List<Item> dataList) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Sheet");

        int rowNum = 0;
        for (Item data : dataList) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(data.getArticleName());
            row.createCell(1).setCellValue(data.getSku());
            row.createCell(2).setCellValue(data.getPrice());
            row.createCell(3).setCellValue(data.getQuantity());
            row.createCell(4).setCellValue(data.getDateAdded());
            // Add more cell creation and data assignment as needed
        }

        try (FileOutputStream outputStream = new FileOutputStream("data.xlsx") implements AutoCloseable) {
            workbook.write(outputStream);
        }
    }
}

