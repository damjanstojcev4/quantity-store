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
            Item item10 = new Item(
                    "Kosula",
                    12001L,
                    1450L,
                    50,
                    LocalDate.now()
            );
            Item item11 = new Item(
                    "Kosula",
                    12004L,
                    1750L,
                    50,
                    LocalDate.now()
            );
            Item item12 = new Item(
                    "Kosula",
                    12005L,
                    1250L,
                    50,
                    LocalDate.now()
            );
            Item item13 = new Item(
                    "Kosula",
                    12006L,
                    950L,
                    50,
                    LocalDate.now()
            );
            Item item14 = new Item(
                    "Kosula",
                    12009L,
                    650L,
                    50,
                    LocalDate.now()
            );
            Item item15 = new Item(
                    "Kosula",
                    12010L,
                    450L,
                    50,
                    LocalDate.now()
            );
            Item item16 = new Item(
                    "Kosula",
                    12012L,
                    750L,
                    50,
                    LocalDate.now()
            );
            Item item17 = new Item(
                    "Kosula",
                    12014L,
                    2500L,
                    50,
                    LocalDate.now()
            );
            Item item18 = new Item(
                    "Kosula",
                    12019L,
                    500L,
                    50,
                    LocalDate.now()
            );
            Item item19 = new Item(
                    "Bluza",
                    13001L,
                    1250L,
                    50,
                    LocalDate.now()
            );
            Item item20 = new Item(
                    "Bluza",
                    13002L,
                    1400L,
                    50,
                    LocalDate.now()
            );
            Item item21 = new Item(
                    "Bluza",
                    13003L,
                    1500L,
                    50,
                    LocalDate.now()
            );
            Item item22 = new Item(
                    "Bluza",
                    13004L,
                    1850L,
                    50,
                    LocalDate.now()
            );
            Item item23 = new Item(
                    "Bluza",
                    13005L,
                    1600L,
                    50,
                    LocalDate.now()
            );
            Item item24 = new Item(
                    "Bluza",
                    13006L,
                    2150L,
                    50,
                    LocalDate.now()
            );
            Item item25 = new Item(
                    "Bluza",
                    13007L,
                    2350L,
                    50,
                    LocalDate.now()
            );
            Item item26 = new Item(
                    "Bluza",
                    13008L,
                    1050L,
                    50,
                    LocalDate.now()
            );
            Item item27 = new Item(
                    "Bluza",
                    13010L,
                    2950L,
                    50,
                    LocalDate.now()
            );
            Item item28 = new Item(
                    "Bluza",
                    13011L,
                    1450L,
                    50,
                    LocalDate.now()
            );
            Item item29 = new Item(
                    "Bluza",
                    13013L,
                    950L,
                    50,
                    LocalDate.now()
            );
            Item item30 = new Item(
                    "Bluza",
                    13026L,
                    1450L,
                    30,
                    LocalDate.now()
            );
            Item item31 = new Item(
                    "Maici",
                    17001L,
                    1250L,
                    30,
                    LocalDate.now()
            );
            Item item32 = new Item(
                    "Maici",
                    17002L,
                    750L,
                    40,
                    LocalDate.now()
            );
            Item item33 = new Item(
                    "Maici",
                    17003L,
                    1500L,
                    40,
                    LocalDate.now()
            );
            Item item34 = new Item(
                    "Maici",
                    17006L,
                    950L,
                    40,
                    LocalDate.now()
            );
            Item item35 = new Item(
                    "Maici",
                    17007L,
                    500L,
                    40,
                    LocalDate.now()
            );
            Item item36 = new Item(
                    "Pantolon",
                    14001L,
                    1600L,
                    40,
                    LocalDate.now()
            );
            Item item37 = new Item(
                    "Pantolon",
                    14002L,
                    1950L,
                    40,
                    LocalDate.now()
            );
            Item item38 = new Item(
                    "Pantolon",
                    14003L,
                    1750L,
                    50,
                    LocalDate.now()
            );
            Item item39 = new Item(
                    "Pantolon",
                    14004L,
                    950L,
                    50,
                    LocalDate.now()
            );
            Item item40 = new Item(
                    "Pantolon",
                    14005L,
                    500L,
                    50,
                    LocalDate.now()
            );
            Item item41 = new Item(
                    "Pantolon",
                    14006L,
                    750L,
                    50,
                    LocalDate.now()
            );
            Item item42 = new Item(
                    "Pantolon",
                    14007L,
                    2150L,
                    50,
                    LocalDate.now()
            );
            Item item43 = new Item(
                    "Pantolon",
                    14008L,
                    2350L,
                    50,
                    LocalDate.now()
            );
            Item item44 = new Item(
                    "Pantolon",
                    14009L,
                    1120L,
                    50,
                    LocalDate.now()
            );
            Item item45 = new Item(
                    "Pantolon",
                    14010L,
                    1500L,
                    50,
                    LocalDate.now()
            );
            Item item46 = new Item(
                    "Pantolon",
                    14011L,
                    1250L,
                    50,
                    LocalDate.now()
            );
            Item item47 = new Item(
                    "Pantolon",
                    14012L,
                    1250L,
                    50,
                    LocalDate.now()
            );
            Item item48 = new Item(
                    "Pantolon",
                    14013L,
                    1320L,
                    50,
                    LocalDate.now()
            );
            Item item49 = new Item(
                    "Pantolon",
                    14014L,
                    1450L,
                    50,
                    LocalDate.now()
            );
            Item item50 = new Item(
                    "Pantolon",
                    14015L,
                    1250L,
                    50,
                    LocalDate.now()
            );
            Item item51 = new Item(
                    "Pantolon",
                    14018L,
                    450L,
                    50,
                    LocalDate.now()
            );
            Item item52 = new Item(
                    "Palto",
                    15001L,
                    6500L,
                    50,
                    LocalDate.now()
            );
            Item item53 = new Item(
                    "Palto",
                    15002L,
                    6900L,
                    50,
                    LocalDate.now()
            );
            Item item54 = new Item(
                    "Palto",
                    15005L,
                    4950L,
                    50,
                    LocalDate.now()
            );
            Item item55 = new Item(
                    "Palto",
                    15007L,
                    4950L,
                    50,
                    LocalDate.now()
            );
            Item item56 = new Item(
                    "Palto",
                    15013L,
                    6150L,
                    50,
                    LocalDate.now()
            );
            Item item57 = new Item(
                    "Jakna",
                    15003L,
                    2800L,
                    50,
                    LocalDate.now()
            );
            Item item58 = new Item(
                    "Jakna",
                    15006L,
                    4550L,
                    50,
                    LocalDate.now()
            );
            Item item59 = new Item(
                    "Jakna",
                    15008L,
                    1500L,
                    50,
                    LocalDate.now()
            );
            Item item60 = new Item(
                    "Jakna",
                    15011L,
                    3500L,
                    50,
                    LocalDate.now()
            );
            Item item61 = new Item(
                    "Jakna",
                    15012L,
                    1950L,
                    50,
                    LocalDate.now()
            );
            Item item62 = new Item(
                    "Jakna",
                    15014L,
                    5600L,
                    50,
                    LocalDate.now()
            );
            Item item63 = new Item(
                    "Jakna",
                    15017L,
                    2000L,
                    50,
                    LocalDate.now()
            );
            Item item64 = new Item(
                    "Jakna",
                    15018L,
                    3950L,
                    50,
                    LocalDate.now()
            );
            Item item65 = new Item(
                    "Jakna",
                    15019L,
                    950L,
                    50,
                    LocalDate.now()
            );
            Item item66 = new Item(
                    "Jakna",
                    15034L,
                    1250L,
                    50,
                    LocalDate.now()
            );

            itemRepository.saveAll(
                    List.of(item, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11,item12,
                            item13, item14, item15, item16, item17, item18, item19, item20, item21, item22, item23,
                            item24, item25, item26, item27, item28, item29, item30, item31, item32, item33, item34,
                            item35, item36, item37, item38, item39, item40, item41, item42, item43, item44, item45,
                            item46, item47, item48, item49, item50, item51, item52, item53, item54, item55, item56,
                            item57, item58, item59, item60, item61, item62, item63, item64, item65, item66)
            );
        };
    }
}
