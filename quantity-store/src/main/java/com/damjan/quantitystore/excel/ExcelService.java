package com.damjan.quantitystore.excel;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ExcelService {

    private final ItemRepository itemRepository;
    private final ExcelGenerator excelGenerator;
    @Autowired
    public ExcelService(ItemRepository itemRepository, ExcelGenerator excelGenerator) {
        this.itemRepository = itemRepository;
        this.excelGenerator = excelGenerator;
    }

    public ResponseEntity<byte[]> generateAndDownloadExcel(List<Item>items) throws IOException {
        byte[] excelBytes = excelGenerator.generateExcel(items);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        // Format the current date to "dd-MM-yyyy" format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDate = LocalDate.now().format(dateFormatter);

        // Set the content disposition header with the file name
        // pateka za download
        headers.setContentDispositionFormData("attachment", "popis_" + currentDate + ".xlsx");

        return ResponseEntity.ok()
                .headers(headers)
                .body(excelBytes);
    }
}
