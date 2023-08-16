package com.damjan.quantitystore.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "item")
public class Item {
    @Id
    private Integer id;
    @Column(name = "article", nullable = false)
    private String article;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    // description, sku, dateadded, update date, updatedby, currenctquantity

    public Item() {

    }

    public Item(String article, Integer price, Integer quantity) {
        this.article = article;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Integer id, String article, Integer price, Integer quantity) {
        this.id = id;
        this.article = article;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
        return Objects.equals(id, item.id) && Objects.equals(article, item.article) &&
                Objects.equals(price, item.price) && Objects.equals(quantity, item.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article, price, quantity);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", article='" + article + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
