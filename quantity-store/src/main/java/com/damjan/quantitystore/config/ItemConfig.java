package com.damjan.quantitystore.config;

import com.damjan.quantitystore.domain.Item;
import com.damjan.quantitystore.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class ItemConfig {

    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository) {
        return args -> {
            Item item = new Item(
                    "Kosula",
                    13001L,
                    25,
                    "Bela Kosula",
                    LocalDate.now()
            );

            Item item1 = new Item(
                    "Sako",
                    13002L,
                    20,
                    "Crno Sako",
                    LocalDate.now()
            );
            Item item2 = new Item(
                    "Pantoloni",
                    13003L,
                    45,
                    "Crni Pantoloni",
                    LocalDate.now()
            );

            itemRepository.saveAll(
                    List.of(item,item1,item2)
            );
        };
    }
}
