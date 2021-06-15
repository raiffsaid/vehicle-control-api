package com.raiffsaid.vehiclecontrol.dto;

import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;

import java.io.Serializable;

public class VehicleDTO implements Serializable {

    private Long id;
    private Long userId;
    private String carmaker;
    private String model;
    private Integer year;
    private String price;

    private User user;

    public VehicleDTO() {
    }

    public VehicleDTO(VehicleRegistryDTO vehicleRegistryDTO, FipeVehicleDTO fipeVehicleDTO) {
        this.userId = vehicleRegistryDTO.getUserId();
        this.carmaker = fipeVehicleDTO.getMarca();
        this.model = fipeVehicleDTO.getModelo();
        this.year = fipeVehicleDTO.getAnoModelo();
        this.price = fipeVehicleDTO.getValor();
    }

    public VehicleDTO(Vehicle entity) {
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.carmaker = entity.getCarmaker();
        this.model = entity.getModel();
        this.year = entity.getYear();
        this.price = entity.getPrice();
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long user_id) {
        this.userId = user_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
