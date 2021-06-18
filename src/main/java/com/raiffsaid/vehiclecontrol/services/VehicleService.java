package com.raiffsaid.vehiclecontrol.services;

import com.raiffsaid.vehiclecontrol.dto.VehicleDTO;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;
import com.raiffsaid.vehiclecontrol.repositories.UserRepository;
import com.raiffsaid.vehiclecontrol.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public VehicleDTO insert(VehicleDTO dto) {
        User userEntity = userRepository.findById(dto.getUserId()).orElseThrow(() -> new IllegalArgumentException("Usuário inválido"));
        Vehicle vehicleEntity = new Vehicle();

        vehicleEntity.setCarmaker(dto.getCarmaker());
        vehicleEntity.setModel(dto.getModel());
        vehicleEntity.setYear(dto.getYear());
        vehicleEntity.setPrice(dto.getPrice());
        vehicleEntity.setUser(userEntity);
        vehicleEntity = repository.save(vehicleEntity);

        return new VehicleDTO(vehicleEntity);
    }
}
