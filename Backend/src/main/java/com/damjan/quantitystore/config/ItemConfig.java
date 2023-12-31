//package com.damjan.quantitystore.config;
//
//import com.damjan.quantitystore.domain.Item;
//import com.damjan.quantitystore.repository.ItemRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Configuration
//public class ItemConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(ItemRepository itemRepository) {
//        return args -> {
//            Item item = new Item(
//                    "Kostum",
//                    11001,
//                    7950,
//                    27,
//                    LocalDate.now()
//            );
//            Item item1 = new Item(
//                    "Sako",
//                    13002,
//                    9500,
//                    20,
//                    LocalDate.now()
//            );
//            Item item2 = new Item(
//                    "Kostum",
//                    13005,
//                    6150,
//                    45,
//                    LocalDate.now()
//            );
//            Item item3 = new Item(
//                    "Kostum",
//                    13006,
//                    5200,
//                    50,
//                    LocalDate.now()
//            );
//            Item item4 = new Item(
//                    "Kostum",
//                    13008,
//                    8500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item5 = new Item(
//                    "Kostum",
//                    13018,
//                    7700,
//                    50,
//                    LocalDate.now()
//            );
//            Item item6 = new Item(
//                    "Kostum",
//                    13019,
//                    6850,
//                    50,
//                    LocalDate.now()
//            );
//            Item item7 = new Item(
//                    "Kostum",
//                    13020,
//                    5500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item8 = new Item(
//                    "Kostum",
//                    13030,
//                    10500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item9 = new Item(
//                    "Kostum",
//                    13031,
//                    9900,
//                    50,
//                    LocalDate.now()
//            );
//            Item item10 = new Item(
//                    "Kosula",
//                    12001,
//                    1450,
//                    50,
//                    LocalDate.now()
//            );
//            Item item11 = new Item(
//                    "Kosula",
//                    12004,
//                    1750,
//                    50,
//                    LocalDate.now()
//            );
//            Item item12 = new Item(
//                    "Kosula",
//                    12005,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item13 = new Item(
//                    "Kosula",
//                    12006,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item14 = new Item(
//                    "Kosula",
//                    12009,
//                    650,
//                    50,
//                    LocalDate.now()
//            );
//            Item item15 = new Item(
//                    "Kosula",
//                    12010,
//                    450,
//                    50,
//                    LocalDate.now()
//            );
//            Item item16 = new Item(
//                    "Kosula",
//                    12012,
//                    750,
//                    50,
//                    LocalDate.now()
//            );
//            Item item17 = new Item(
//                    "Kosula",
//                    12014,
//                    2500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item18 = new Item(
//                    "Kosula",
//                    12019,
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item19 = new Item(
//                    "Bluza",
//                    13001,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item20 = new Item(
//                    "Bluza",
//                    18001, // Nov SKU
//                    1400,
//                    50,
//                    LocalDate.now()
//            );
//            Item item21 = new Item(
//                    "Bluza",
//                    13003,
//                    1500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item22 = new Item(
//                    "Bluza",
//                    13004,
//                    1850,
//                    50,
//                    LocalDate.now()
//            );
//            Item item23 = new Item(
//                    "Bluza",
//                    18002, // Nov sku
//                    1600,
//                    50,
//                    LocalDate.now()
//            );
//            Item item24 = new Item(
//                    "Bluza",
//                    18003, // nov sku
//                    2150,
//                    50,
//                    LocalDate.now()
//            );
//            Item item25 = new Item(
//                    "Bluza",
//                    13007,
//                    2350,
//                    50,
//                    LocalDate.now()
//            );
//            Item item26 = new Item(
//                    "Bluza",
//                    18004, // nov sku
//                    1050,
//                    50,
//                    LocalDate.now()
//            );
//            Item item27 = new Item(
//                    "Bluza",
//                    13010,
//                    2950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item28 = new Item(
//                    "Bluza",
//                    13011,
//                    1450,
//                    50,
//                    LocalDate.now()
//            );
//            Item item29 = new Item(
//                    "Bluza",
//                    13013,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item30 = new Item(
//                    "Bluza",
//                    13026,
//                    1450,
//                    30,
//                    LocalDate.now()
//            );
//            Item item31 = new Item(
//                    "Maici",
//                    17001,
//                    1250,
//                    30,
//                    LocalDate.now()
//            );
//            Item item32 = new Item(
//                    "Maici",
//                    17002,
//                    750,
//                    40,
//                    LocalDate.now()
//            );
//            Item item33 = new Item(
//                    "Maici",
//                    17003,
//                    1500,
//                    40,
//                    LocalDate.now()
//            );
//            Item item34 = new Item(
//                    "Maici",
//                    17006,
//                    950,
//                    40,
//                    LocalDate.now()
//            );
//            Item item35 = new Item(
//                    "Maici",
//                    17007,
//                    500,
//                    40,
//                    LocalDate.now()
//            );
//            Item item36 = new Item(
//                    "Pantolon",
//                    14001,
//                    1600,
//                    40,
//                    LocalDate.now()
//            );
//            Item item37 = new Item(
//                    "Pantolon",
//                    14002,
//                    1950,
//                    40,
//                    LocalDate.now()
//            );
//            Item item38 = new Item(
//                    "Pantolon",
//                    14003,
//                    1750,
//                    50,
//                    LocalDate.now()
//            );
//            Item item39 = new Item(
//                    "Pantolon",
//                    14004,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item40 = new Item(
//                    "Pantolon",
//                    14005,
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item41 = new Item(
//                    "Pantolon",
//                    14006,
//                    750,
//                    50,
//                    LocalDate.now()
//            );
//            Item item42 = new Item(
//                    "Pantolon",
//                    14007,
//                    2150,
//                    50,
//                    LocalDate.now()
//            );
//            Item item43 = new Item(
//                    "Pantolon",
//                    14008,
//                    2350,
//                    50,
//                    LocalDate.now()
//            );
//            Item item44 = new Item(
//                    "Pantolon",
//                    14009,
//                    1120,
//                    50,
//                    LocalDate.now()
//            );
//            Item item45 = new Item(
//                    "Pantolon",
//                    14010,
//                    1500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item46 = new Item(
//                    "Pantolon",
//                    14011,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item47 = new Item(
//                    "Pantolon",
//                    14012,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item48 = new Item(
//                    "Pantolon",
//                    14013,
//                    1320,
//                    50,
//                    LocalDate.now()
//            );
//            Item item49 = new Item(
//                    "Pantolon",
//                    14014,
//                    1450,
//                    50,
//                    LocalDate.now()
//            );
//            Item item50 = new Item(
//                    "Pantolon",
//                    14015,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item51 = new Item(
//                    "Pantolon",
//                    14018,
//                    450,
//                    50,
//                    LocalDate.now()
//            );
//            Item item52 = new Item(
//                    "Palto",
//                    15001,
//                    6500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item53 = new Item(
//                    "Palto",
//                    15002,
//                    6900,
//                    50,
//                    LocalDate.now()
//            );
//            Item item54 = new Item(
//                    "Palto",
//                    15005,
//                    4950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item55 = new Item(
//                    "Palto",
//                    15007,
//                    4950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item56 = new Item(
//                    "Palto",
//                    15013,
//                    6150,
//                    50,
//                    LocalDate.now()
//            );
//            Item item57 = new Item(
//                    "Jakna",
//                    15003,
//                    2800,
//                    50,
//                    LocalDate.now()
//            );
//            Item item58 = new Item(
//                    "Jakna",
//                    15006,
//                    4550,
//                    50,
//                    LocalDate.now()
//            );
//            Item item59 = new Item(
//                    "Jakna",
//                    15008,
//                    1500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item60 = new Item(
//                    "Jakna",
//                    15011,
//                    3500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item61 = new Item(
//                    "Jakna",
//                    15012,
//                    1950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item62 = new Item(
//                    "Jakna",
//                    15014,
//                    5600,
//                    50,
//                    LocalDate.now()
//            );
//            Item item63 = new Item(
//                    "Jakna",
//                    15017,
//                    2000,
//                    50,
//                    LocalDate.now()
//            );
//            Item item64 = new Item(
//                    "Jakna",
//                    15018,
//                    3950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item65 = new Item(
//                    "Jakna",
//                    15019,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item66 = new Item(
//                    "Jakna",
//                    15034,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item67 = new Item(
//                    "Kozhna Jakna",
//                    15020,
//                    12300,
//                    50,
//                    LocalDate.now()
//            );
//            Item item68 = new Item(
//                    "Sako",
//                    15004,
//                    3100,
//                    50,
//                    LocalDate.now()
//            );
//            Item item69 = new Item(
//                    "Kravata",
//                    16001,
//                    750,
//                    50,
//                    LocalDate.now()
//            );
//            Item item70 = new Item(
//                    "Kaish",
//                    16002,
//                    390,
//                    50,
//                    LocalDate.now()
//            );
//            Item item71 = new Item(
//                    "leptir",
//                    16003,
//                    300,
//                    50,
//                    LocalDate.now()
//            );
//            Item item72 = new Item(
//                    "Kravata",
//                    18005, // IZMENET SKU
//                    390,
//                    50,
//                    LocalDate.now()
//            );
//            Item item73 = new Item(
//                    "Igli za kravati",
//                    18006, // nov sku
//                    390,
//                    50,
//                    LocalDate.now()
//            );
//            Item item74 = new Item(
//                    "Elek i Marama",
//                    18007, // nov sku
//                    960,
//                    50,
//                    LocalDate.now()
//            );
//            Item item75 = new Item(
//                    "Shal",
//                    18008, // nov sku
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item76 = new Item(
//                    "Kravata",
//                    18009, // nov sku
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item77 = new Item(
//                    "Novcanik",
//                    18010, // nov sku
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item78 = new Item(
//                    "Kravata",
//                    16006,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item79 = new Item(
//                    "Futroli",
//                    16007,
//                    250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item80 = new Item(
//                    "Kaish",
//                    16008,
//                    790,
//                    50,
//                    LocalDate.now()
//            );
//            Item item81 = new Item(
//                    "Kopcinja",
//                    16009,
//                    1300,
//                    50,
//                    LocalDate.now()
//            );
//            Item item82 = new Item(
//                    "Kopcinja",
//                    16010,
//                    610,
//                    50,
//                    LocalDate.now()
//            );
//            Item item83 = new Item(
//                    "Kopcinja",
//                    16011,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item84 = new Item(
//                    "Novcanik",
//                    18011,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item85 = new Item(
//                    "Pojas",
//                    18012,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item86 = new Item(
//                    "Tregeri",
//                    18013,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item87 = new Item(
//                    "Marama",
//                    18014,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item88 = new Item(
//                    "Komplet Novcanik",
//                    16012,
//                    650,
//                    50,
//                    LocalDate.now()
//            );
//            Item item89 = new Item(
//                    "Remen",
//                    16013,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item90 = new Item(
//                    "Cador Mal",
//                    16014,
//                    650,
//                    50,
//                    LocalDate.now()
//            );
//            Item item91 = new Item(
//                    "Cador Sreden",
//                    16015,
//                    750,
//                    50,
//                    LocalDate.now()
//            );
//            Item item92 = new Item(
//                    "Cador Golem",
//                    16016,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item93 = new Item(
//                    "Kopcinja",
//                    16017,
//                    430,
//                    50,
//                    LocalDate.now()
//            );
//            Item item94 = new Item(
//                    "Kutii Mali",
//                    16018,
//                    410,
//                    50,
//                    LocalDate.now()
//            );
//            Item item95 = new Item(
//                    "Kutii Golemi",
//                    16019,
//                    560,
//                    50,
//                    LocalDate.now()
//            );
//            Item item96 = new Item(
//                    "Narakvici",
//                    16020,
//                    1500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item97 = new Item(
//                    "Kapa",
//                    16021,
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item98 = new Item(
//                    "Elek",
//                    16022,
//                    2500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item99 = new Item(
//                    "Remen",
//                    16023,
//                    890,
//                    50,
//                    LocalDate.now()
//            );
//            Item item100 = new Item(
//                    "Pojas",
//                    16024,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item101 = new Item(
//                    "Pojas",
//                    16025,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item102 = new Item(
//                    "Kaish",
//                    16027,
//                    500,
//                    50,
//                    LocalDate.now()
//            );
//            Item item103 = new Item(
//                    "Kapa",
//                    16028,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//            Item item104 = new Item(
//                    "Kravata-Leptir",
//                    16029,
//                    100,
//                    50,
//                    LocalDate.now()
//            );
//            Item item105 = new Item(
//                    "Remen",
//                    16036,
//                    850,
//                    50,
//                    LocalDate.now()
//            );
//            Item item106 = new Item(
//                    "Pojas",
//                    16048,
//                    1250,
//                    50,
//                    LocalDate.now()
//            );
//            Item item107 = new Item(
//                    "Marama",
//                    16049,
//                    950,
//                    50,
//                    LocalDate.now()
//            );
//
//            itemRepository.saveAll(
//                    List.of(item, item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12,
//                            item13, item14, item15, item16, item17, item18, item19, item20, item21, item22, item23,
//                            item24, item25, item26, item27, item28, item29, item30, item31, item32, item33, item34,
//                            item35, item36, item37, item38, item39, item40, item41, item42, item43, item44, item45,
//                            item46, item47, item48, item49, item50, item51, item52, item53, item54, item55, item56,
//                            item57, item58, item59, item60, item61, item62, item63, item64, item65, item66, item67,
//                            item68, item69, item70, item71, item72, item73, item74, item75, item76, item77, item78,
//                            item79, item80, item81, item82, item83, item84, item85, item86, item87, item88, item89,
//                            item90, item91, item92, item93, item94, item95, item96, item97, item98, item99, item100,
//                            item101, item102, item103, item104, item105, item106, item107)
//            );
//        };
//    }
//}
