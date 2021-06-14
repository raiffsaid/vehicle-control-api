package com.raiffsaid.vehiclecontrol.repositories;

import com.raiffsaid.vehiclecontrol.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
