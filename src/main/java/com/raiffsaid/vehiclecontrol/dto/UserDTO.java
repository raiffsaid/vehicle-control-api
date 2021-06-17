package com.raiffsaid.vehiclecontrol.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.services.validation.UserInsertValid;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@UserInsertValid // Processa a verificação se já existe email e cpf no banco
public class UserDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Campo obrigatório")
    private String name;

    @NotBlank(message = "Campo obrigatório")
    @Email(message = "Inserir email válido")
    private String email;

    @NotBlank(message = "Campo obrigatório")
    @Pattern(regexp = "(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)",
            message = "O CPF deve ter o formato 123.456.789-09")
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonSerialize(using = LocalDateSerializer.class)
    @NotNull(message = "Campo obrigatório")
    @Past(message = "A data de nascimento não pode ser futura")
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
        entity.getVehicles().forEach(vehicle -> vehicles.add(new VehicleDTO(vehicle)));
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
