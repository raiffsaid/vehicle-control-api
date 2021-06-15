package com.raiffsaid.vehiclecontrol.dto;

import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate birthDate;

    private List<VehicleDTO> vehicles = new ArrayList<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String cpf, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
        this.cpf = entity.getCpf();
        this.birthDate = entity.getBirthDate();

        for (Vehicle vehicle : entity.getVehicles()) {
            this.vehicles.add(new VehicleDTO(vehicle));
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<VehicleDTO> getVehicles() {
        return vehicles;
    }
}
