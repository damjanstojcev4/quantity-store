package com.damjan.quantitystore.repository;

import com.damjan.quantitystore.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item>findAll();
    Optional<Item>findById(Integer id);
}
