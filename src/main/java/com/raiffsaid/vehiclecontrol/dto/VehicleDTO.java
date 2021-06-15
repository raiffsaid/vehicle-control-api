package com.raiffsaid.vehiclecontrol.dto;

import com.raiffsaid.vehiclecontrol.entities.Vehicle;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class VehicleDTO implements Serializable {

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
        int lastDigit = entity.getYear() % 10;

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();

        switch (lastDigit) {
            case 0:
            case 1:
                this.rotationDay = "segunda-feira";
                if (dayOfWeek == DayOfWeek.MONDAY) {
                    this.rotationDayIsActive = true;
                } else {
                    this.rotationDayIsActive = false;
                }
                break;
            case 2:
            case 3:
                this.rotationDay = "terça-feira";
                if (dayOfWeek == DayOfWeek.TUESDAY) {
                    this.rotationDayIsActive = true;
                } else {
                    this.rotationDayIsActive = false;
                }
                break;
            case 4:
            case 5:
                this.rotationDay = "quarta-feira";
                if (dayOfWeek == DayOfWeek.WEDNESDAY) {
                    this.rotationDayIsActive = true;
                } else {
                    this.rotationDayIsActive = false;
                }
                break;
            case 6:
            case 7:
                this.rotationDay = "quinta-feira";
                if (dayOfWeek == DayOfWeek.THURSDAY) {
                    this.rotationDayIsActive = true;
                } else {
                    this.rotationDayIsActive = false;
                }
                break;
            case 8:
            case 9:
                this.rotationDay = "sexta-feira";
                if (dayOfWeek == DayOfWeek.FRIDAY) {
                    this.rotationDayIsActive = true;
                } else {
                    this.rotationDayIsActive = false;
                }
                break;
        }


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

    public String getRotationDay() {
        return rotationDay;
    }

    public void setRotationDay(String rotationDay) {
        this.rotationDay = rotationDay;
    }

    public Boolean getRotationDayIsActive() {
        return rotationDayIsActive;
    }

    public void setRotationDayIsActive(Boolean rotationDayIsActive) {
        this.rotationDayIsActive = rotationDayIsActive;
    }
}
