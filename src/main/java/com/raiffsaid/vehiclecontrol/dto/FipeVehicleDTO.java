package com.raiffsaid.vehiclecontrol.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class FipeVehicleDTO implements Serializable {

    @JsonProperty(value = "Valor")
    private String price;
    @JsonProperty(value = "Marca")
    private String carmaker;
    @JsonProperty(value = "Modelo")
    private String model;
    @JsonProperty(value = "AnoModelo")
    private Integer modelYear;
    @JsonProperty(value = "Combustivel")
    private String fuel;
    @JsonProperty(value = "CodigoFipe")
    private String fipeCode;
    @JsonProperty(value = "MesReferencia")
    private String monthReference;
    @JsonProperty(value = "TipoVeiculo")
    private Integer vehicleType;
    @JsonProperty(value = "SiglaCombustivel")
    private String fuelInitials;

    public FipeVehicleDTO() {
    }

    public FipeVehicleDTO(String price, String carmaker, String model, Integer modelYear, String fuel, String fipeCode, String monthReference, Integer vehicleType, String fuelInitials) {
        this.price = price;
        this.carmaker = carmaker;
        this.model = model;
        this.modelYear = modelYear;
        this.fuel = fuel;
        this.fipeCode = fipeCode;
        this.monthReference = monthReference;
        this.vehicleType = vehicleType;
        this.fuelInitials = fuelInitials;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getFipeCode() {
        return fipeCode;
    }

    public void setFipeCode(String fipeCode) {
        this.fipeCode = fipeCode;
    }

    public String getMonthReference() {
        return monthReference;
    }

    public void setMonthReference(String monthReference) {
        this.monthReference = monthReference;
    }

    public Integer getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Integer vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFuelInitials() {
        return fuelInitials;
    }

    public void setFuelInitials(String fuelInitials) {
        this.fuelInitials = fuelInitials;
    }
}
