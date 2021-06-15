package com.raiffsaid.vehiclecontrol.client;

import com.raiffsaid.vehiclecontrol.dto.FipeVehicleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "get",
        url = "https://parallelum.com.br/fipe/api/v1",
        configuration = FipeVehicleDTO.class) // Serializa para FipeVehicleDTO
public interface GetClient {

    @GetMapping(value = "/carros/marcas/{carmaker}/modelos/{model}/anos/{year}-1")
    FipeVehicleDTO vehiclePrice(@PathVariable("carmaker") String carmaker,
                                @PathVariable("model") String model,
                                @PathVariable("year") Integer year);
}
