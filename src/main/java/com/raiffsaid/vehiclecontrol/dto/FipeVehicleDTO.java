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

    public String getCarmaker() {
        return carmaker;
    }

    public String getModel() {
        return model;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public String getFuel() {
        return fuel;
    }

    public String getFipeCode() {
        return fipeCode;
    }

    public String getMonthReference() {
        return monthReference;
    }

    public Integer getVehicleType() {
        return vehicleType;
    }

    public String getFuelInitials() {
        return fuelInitials;
    }
}
