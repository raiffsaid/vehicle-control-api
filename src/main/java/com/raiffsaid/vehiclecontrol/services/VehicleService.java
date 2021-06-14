package com.raiffsaid.vehiclecontrol.services;

import com.raiffsaid.vehiclecontrol.dto.VehicleDTO;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;
import com.raiffsaid.vehiclecontrol.repositories.UserRepository;
import com.raiffsaid.vehiclecontrol.repositories.VehicleRepository;
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
        Vehicle entity = new Vehicle();
        User user = userRepository.findById(dto.getUserId()).orElse(null);
//        user.setId(dto.getUserId());

        entity.setCarmaker(dto.getCarmaker());
        entity.setModel(dto.getModel());
        entity.setYear(dto.getYear());
        entity.setPrice(dto.getPrice());
        entity.setUser(user);
        entity = repository.save(entity);

        return new VehicleDTO(entity);
    }
}
