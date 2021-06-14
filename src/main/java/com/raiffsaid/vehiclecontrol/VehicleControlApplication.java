package com.raiffsaid.vehiclecontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class VehicleControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleControlApplication.class, args);
    }
}
