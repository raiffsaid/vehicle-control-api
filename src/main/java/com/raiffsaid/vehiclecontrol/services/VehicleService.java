package com.raiffsaid.vehiclecontrol.services;

import com.raiffsaid.vehiclecontrol.dto.VehicleDTO;
import com.raiffsaid.vehiclecontrol.entities.Vehicle;
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

    @Transactional(readOnly = true)
    public List<VehicleDTO> findAll() {
        List<Vehicle> list = repository.findAll();

        return list.stream().map(VehicleDTO::new).collect(Collectors.toList());
    }

}
