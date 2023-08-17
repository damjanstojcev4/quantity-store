package com.damjan.quantitystore.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    @Column(name = "article_name", nullable = false)
    private String articleName;
    @Column(name = "sku", nullable = false)
    private Long sku; // An SKU, short for "stock keeping unit",
    // is a unique number combination used by retailers to identify and track products.
    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "date_added", nullable = false)
    private LocalDate dateAdded;

    // description, sku, dateadded, update date, updatedby, currenctquantity

    public Item() {

    }

    public Item(String articleName, Long sku, Integer quantity, String description, LocalDate dateAdded) {
        this.articleName = articleName;
        this.sku = sku;
        this.quantity = quantity;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public Item(Integer itemId, String articleName, Long sku, Integer quantity, String description, LocalDate dateAdded) {
        this.itemId = itemId;
        this.articleName = articleName;
        this.sku = sku;
        this.quantity = quantity;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemId, item.itemId) && Objects.equals(articleName, item.articleName) &&
                Objects.equals(quantity, item.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, articleName, quantity);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", article='" + articleName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
