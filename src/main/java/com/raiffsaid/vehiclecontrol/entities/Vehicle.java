package com.raiffsaid.vehiclecontrol.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_vehicle")
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String carmaker;
    @Column
    private String model;
    @Column
    private Integer year;
    @Column
    private String price; //BIGDECIMAL

    @JsonIgnore // Barra a serialização do objeto JSON
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    public Vehicle() {
    }

    public Vehicle(Long id, String carmaker, String model, Integer year, String price, User user) {
        this.id = id;
        this.carmaker = carmaker;
        this.model = model;
        this.year = year;
        this.price = price;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarmaker() {
        return carmaker;
    }

    public void setCarmaker(String carmaker) {
        this.carmaker = carmaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}