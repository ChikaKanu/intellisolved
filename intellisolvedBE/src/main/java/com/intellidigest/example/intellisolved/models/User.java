package com.intellidigest.example.intellisolved.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "postcode")
    private String postcode;

    @Column(name="products")
    private ArrayList<Product> products;

    @Column(name="orders")
    private ArrayList<Order> orders;

    @Column(name="stores")
    private ArrayList<Store> storesPreferred;

    public User(String firstName, String surname, String email, String username, String password, String phone, String address, String city, String postcode) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.postcode = postcode;
        this.orders = new ArrayList<>();
        this.products = new ArrayList<>();
        this.storesPreferred = new ArrayList<>();
    }

    public User(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Store> getStoresPreferred() {
        return storesPreferred;
    }

    public void setStoresPreferred(ArrayList<Store> stores) {
        this.storesPreferred = stores;
    }

    public void addStore(Store store){
        this.storesPreferred.add(store);
    }

    public ArrayList removeStore(Store store){
        this.storesPreferred.remove(store);
        return this.storesPreferred;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public ArrayList removeProduct(Product product){
        this.products.remove(product);
        return this.products;
    }


    public void addOrder(Order order){
        this.orders.add(order);
    }

    public ArrayList removeOrder(Order order){
        this.orders.remove(order);
        return this.orders;
    }
}


