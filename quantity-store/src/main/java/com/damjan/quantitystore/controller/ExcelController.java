package com.damjan.quantitystore.controller;

import com.damjan.quantitystore.excel.ExcelService;
import com.damjan.quantitystore.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/linkesti")
public class ExcelController {
    private final ItemService itemService;
    private final ExcelService excelService;

    @Autowired
    public ExcelController(ItemService itemService, ExcelService excelService) {
        this.itemService = itemService;
        this.excelService = excelService;
    }

    @GetMapping("/download-excel")
    public ResponseEntity<byte[]> downloadExcel() throws IOException {
        ResponseEntity<byte[]> excelBytes = excelService.generateAndDownloadExcel(itemService.getAllItems());
        return excelBytes;
    }
}