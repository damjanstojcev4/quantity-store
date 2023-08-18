package com.damjan.quantitystore.repository;

import com.damjan.quantitystore.domain.Item;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item>findAll();
    Item findBySku(Long sku);
    @Modifying
    @Query("UPDATE Item i SET i.quantity = :newQuantity WHERE i.itemId = :itemId")
    void updateQuantity(Integer itemId);

}
