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
    @Column(nullable = false)
    private String articleName;
    @Column(nullable = false)
    private Long sku;
    @Column(nullable = false)
    private Long price;
    @Column(nullable = false)
    private Integer quantity;
    @Column()
    private LocalDate dateAdded;

    @PrePersist
    protected void onCreate() {
        dateAdded = LocalDate.now();
    }

    // description, sku, dateadded, update date, updatedby, currenctquantity

    public Item() {

    }

    public Item(String articleName, Long sku, Long price, Integer quantity, LocalDate dateAdded) {
        this.articleName = articleName;
        this.sku = sku;
        this.price = price;
        this.quantity = quantity;
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

    public Long getSku() {
        return sku;
    }

    public void setSku(Long sku) {
        this.sku = sku;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(itemId, item.itemId) && Objects.equals(articleName, item.articleName) && Objects.equals(sku, item.sku) && Objects.equals(price, item.price) && Objects.equals(quantity, item.quantity) && Objects.equals(dateAdded, item.dateAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, articleName, sku, price, quantity, dateAdded);
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", articleName='" + articleName + '\'' +
                ", sku=" + sku +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
