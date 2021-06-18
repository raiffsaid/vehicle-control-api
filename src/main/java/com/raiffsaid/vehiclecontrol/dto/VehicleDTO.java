package com.raiffsaid.vehiclecontrol.dto;

import com.raiffsaid.vehiclecontrol.entities.Vehicle;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.ZonedDateTime;

public class VehicleDTO implements Serializable {

    private static final DayOfWeek dayOfWeek = ZonedDateTime.now().getDayOfWeek();

    private Long id;
    private Long userId;
    private String carmaker;
    private String model;
    private Integer year;
    private String price;
    private String rotationDay;
    private Boolean rotationDayIsActive;

    public VehicleDTO() {
    }

    public VehicleDTO(VehicleRegistryDTO vehicleRegistryDTO, FipeVehicleDTO fipeVehicleDTO) {
        this.userId = vehicleRegistryDTO.getUserId();
        this.carmaker = fipeVehicleDTO.getCarmaker();
        this.model = fipeVehicleDTO.getModel();
        this.year = fipeVehicleDTO.getModelYear();
        this.price = fipeVehicleDTO.getPrice();
    }

    public VehicleDTO(Vehicle entity) {
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.carmaker = entity.getCarmaker();
        this.model = entity.getModel();
        this.year = entity.getYear();
        this.price = entity.getPrice();
        setRotations(entity.getYear() % 10);
    }

    public Long getId() {
        return id;
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

    public Long getUserId() {
        return userId;
    }

    public String getPrice() {
        return price;
    }

    public String getRotationDay() {
        return rotationDay;
    }

    public Boolean getRotationDayIsActive() {
        return rotationDayIsActive;
    }

    public void setRotations(Integer lastDigit) {
        switch (lastDigit) {
            case 0:
            case 1:
                rotationDay = "segunda-feira";
                rotationDayIsActive = dayOfWeek == DayOfWeek.MONDAY;
                break;
            case 2:
            case 3:
                rotationDay = "terça-feira";
                rotationDayIsActive = dayOfWeek == DayOfWeek.TUESDAY;
                break;
            case 4:
            case 5:
                rotationDay = "quarta-feira";
                rotationDayIsActive = dayOfWeek == DayOfWeek.WEDNESDAY;
                break;
            case 6:
            case 7:
                rotationDay = "quinta-feira";
                rotationDayIsActive = dayOfWeek == DayOfWeek.THURSDAY;
                break;
            case 8:
            case 9:
                rotationDay = "sexta-feira";
                rotationDayIsActive = dayOfWeek == DayOfWeek.FRIDAY;
                break;
        }
    }
}
