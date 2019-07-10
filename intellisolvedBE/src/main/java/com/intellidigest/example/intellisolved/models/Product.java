package com.intellidigest.example.intellisolved.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="productId")
    private String productId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @JsonIgnoreProperties("orders")
    @ManyToOne
    @JoinColumn(name="store_id")
    private Store store;

    @Column(name="price")
    private Double price;

    @Column(name="image")
    private byte[] image;

    @JsonIgnoreProperties("stores")
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;

    @Column(name="quantity")
    private Double quantity;

    public Product(String name, String description, String productId, byte[] image, Double price, Order order, Store store, Double quantity) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.image = image;
        this.store = store;
        this.order = order;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
