package com.raiffsaid.vehiclecontrol.services;

import com.raiffsaid.vehiclecontrol.dto.UserDTO;
import com.raiffsaid.vehiclecontrol.dto.VehicleDTO;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;
import com.raiffsaid.vehiclecontrol.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    @Autowired
    private UserService userService;

    @Transactional
    public VehicleDTO insert(VehicleDTO dto) {
        UserDTO userDto = userService.findById(dto.getUserId());
        Vehicle vehicleEntity = new Vehicle();

        vehicleEntity.setCarmaker(dto.getCarmaker());
        vehicleEntity.setModel(dto.getModel());
        vehicleEntity.setYear(dto.getYear());
        vehicleEntity.setPrice(dto.getPrice());
        vehicleEntity.setUser(User.dtoToEntity(userDto));
        vehicleEntity = repository.save(vehicleEntity);

        return new VehicleDTO(vehicleEntity);
    }
}
