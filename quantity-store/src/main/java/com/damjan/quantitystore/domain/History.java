package com.damjan.quantitystore.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(optional = false)
    @JoinColumn(name = "sku")
    private Item sku;
    @Column(name = "current_quantity")
    private Integer currentQuantity;

    public History() {
    }

    public History(Item sku, Integer currentQuantity) {
        this.sku = sku;
        this.currentQuantity = currentQuantity;
    }

    public History(Integer id, Item sku, Integer currentQuantity) {
        this.id = id;
        this.sku = sku;
        this.currentQuantity = currentQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getSku() {
        return sku;
    }

    public void setSku(Item sku) {
        this.sku = sku;
    }


    public Integer getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        History history = (History) o;
        return Objects.equals(id, history.id) && Objects.equals(sku, history.sku) &&
                Objects.equals(currentQuantity, history.currentQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sku, currentQuantity);
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", sku=" + sku +
                ", currentQuantity=" + currentQuantity +
                '}';
    }
}
