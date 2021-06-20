package com.raiffsaid.vehiclecontrol.dto;

import com.raiffsaid.vehiclecontrol.entities.Vehicle;

import java.io.Serializable;

public class VehicleRegistryDTO implements Serializable {

    private Long userId;
    private String vehicleType;
    private String carmaker;
    private String model;
    private Integer year;
    private Integer fuelType;

    public VehicleRegistryDTO() {
    }

    public VehicleRegistryDTO(String vehicleType, String carmaker, String model, Integer year, Integer fuelType) {
        this.vehicleType = vehicleType;
        this.carmaker = carmaker;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public VehicleRegistryDTO(Vehicle entity) {
        this.carmaker = entity.getCarmaker();
        this.model = entity.getModel();
        this.year = entity.getYear();
    }

    public Long getUserId() {
        return userId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCarmaker() {
        return carmaker;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getFuelType() {
        return fuelType;
    }

}
