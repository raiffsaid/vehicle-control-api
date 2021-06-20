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

    public FipeVehicleDTO() {
    }

    public FipeVehicleDTO(String price, String carmaker, String model, Integer modelYear) {
        this.price = price;
        this.carmaker = carmaker;
        this.model = model;
        this.modelYear = modelYear;
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
}
