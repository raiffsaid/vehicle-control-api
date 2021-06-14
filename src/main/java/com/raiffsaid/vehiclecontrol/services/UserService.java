package com.raiffsaid.vehiclecontrol.services;

import com.raiffsaid.vehiclecontrol.dto.UserDTO;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<User> list = repository.findAll();

        return list.stream().map(UserDTO::new).collect(Collectors.toList());
    }
}
