package com.damjan.quantitystore.repository;

import com.damjan.quantitystore.domain.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item>findAll();
    Item findBySku(Integer sku);
    @Modifying
    @Query("UPDATE Item i SET i.quantity = :quantity WHERE i.sku = :sku")
    void updateQuantityBySku(@Param("sku") Integer sku, @Param("quantity") int quantity);

    void deleteBySku(Integer sku);

}
