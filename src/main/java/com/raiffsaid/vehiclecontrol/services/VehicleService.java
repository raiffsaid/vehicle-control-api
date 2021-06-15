package com.raiffsaid.vehiclecontrol.services;

import com.raiffsaid.vehiclecontrol.dto.VehicleDTO;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;
import com.raiffsaid.vehiclecontrol.repositories.UserRepository;
import com.raiffsaid.vehiclecontrol.repositories.VehicleRepository;
import com.raiffsaid.vehiclecontrol.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<VehicleDTO> findAll() {
        List<Vehicle> list = repository.findAll();

        return list.stream().map(VehicleDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public VehicleDTO insert(VehicleDTO dto) {
        Vehicle vehicleEntity = new Vehicle();
        User userEntity = userRepository.findById(dto.getUserId()).orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));

        vehicleEntity.setCarmaker(dto.getCarmaker());
        vehicleEntity.setModel(dto.getModel());
        vehicleEntity.setYear(dto.getYear());
        vehicleEntity.setPrice(dto.getPrice());
        vehicleEntity.setUser(userEntity);
        vehicleEntity = repository.save(vehicleEntity);

        return new VehicleDTO(vehicleEntity);
    }
}
