package com.raiffsaid.vehiclecontrol.dto;

import com.raiffsaid.vehiclecontrol.entities.Vehicle;

import java.io.Serializable;

public class VehicleRegistryDTO implements Serializable {

    private Long userId;
    private String vehicleType;
    private String carmaker;
    private String model;
    private Integer year;

    public VehicleRegistryDTO() {
    }

    public VehicleRegistryDTO(String vehicleType, String carmaker, String model, Integer year) {
        this.vehicleType = vehicleType;
        this.carmaker = carmaker;
        this.model = model;
        this.year = year;
    }

    public VehicleRegistryDTO(Vehicle entity) {
        this.carmaker = entity.getCarmaker();
        this.model = entity.getModel();
        this.year = entity.getYear();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
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
}
