package com.damjan.quantitystore.excel;

import com.damjan.quantitystore.domain.Item;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ExcelGenerator {
    public byte[] generateExcel(List<Item> items) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Data Sheet");

        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Артикал");
        headerRow.createCell(1).setCellValue("Шифра");
        headerRow.createCell(2).setCellValue("Цена");
        headerRow.createCell(3).setCellValue("Количина");
        headerRow.createCell(4).setCellValue("Додадено на Дата");

        // Create data rows
        int rowNum = 1;
        for (Item data : items) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(data.getArticleName());
            row.createCell(1).setCellValue(data.getSku());
            row.createCell(2).setCellValue(data.getPrice());
            row.createCell(3).setCellValue(data.getQuantity());
            row.createCell(4).setCellValue(data.getDateAdded().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        workbook.write(byteArrayOutputStream);

        return byteArrayOutputStream.toByteArray();
    }
}


