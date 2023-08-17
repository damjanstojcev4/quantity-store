package com.damjan.quantitystore.repository;

import com.damjan.quantitystore.domain.History;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History, Integer> {
//    @Modifying
//    @Query("UPDATE History i SET i.currentQuantity = :newQuantity WHERE i.id = :id")
//    void updateQuantity(Integer currentQuantity);
}
