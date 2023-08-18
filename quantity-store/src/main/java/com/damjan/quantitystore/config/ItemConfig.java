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
                    "Kostum",
                    11001L,
                    7950L,
                    27,
                    LocalDate.now()
            );
            Item item1 = new Item(
                    "Sako",
                    13002L,
                    9500L,
                    20,
                    LocalDate.now()
            );
            Item item2 = new Item(
                    "Kostum",
                    13005L,
                    6150L,
                    45,
                    LocalDate.now()
            );
            Item item3 = new Item(
                    "Kostum",
                    13006L,
                    5200L,
                    50,
                    LocalDate.now()
            );
            Item item4 = new Item(
                    "Kostum",
                    13008L,
                    8500L,
                    50,
                    LocalDate.now()
            );
            Item item5 = new Item(
                    "Kostum",
                    13018L,
                    7700L,
                    50,
                    LocalDate.now()
            );
            Item item6 = new Item(
                    "Kostum",
                    13019L,
                    6850L,
                    50,
                    LocalDate.now()
            );
            Item item7 = new Item(
                    "Kostum",
                    13020L,
                    5500L,
                    50,
                    LocalDate.now()
            );
            Item item8 = new Item(
                    "Kostum",
                    13030L,
                    10500L,
                    50,
                    LocalDate.now()
            );
            Item item9 = new Item(
                    "Kostum",
                    13031L,
                    9900L,
                    50,
                    LocalDate.now()
            );

            itemRepository.saveAll(
                    List.of(item,item1,item2,item3,item4,item5,item6,item7,
                    item8,item9)
            );
        };
    }
}
