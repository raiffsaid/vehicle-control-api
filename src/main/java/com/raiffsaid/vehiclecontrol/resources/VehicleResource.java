package com.raiffsaid.vehiclecontrol.resources;

import com.raiffsaid.vehiclecontrol.client.GetClient;
import com.raiffsaid.vehiclecontrol.dto.FipeVehicleDTO;
import com.raiffsaid.vehiclecontrol.dto.VehicleDTO;
import com.raiffsaid.vehiclecontrol.dto.VehicleRegistryDTO;
import com.raiffsaid.vehiclecontrol.services.VehicleService;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleResource {

    @Autowired
    private GetClient getClient;

    @Autowired
    private VehicleService service;

    @GetMapping
    public ResponseEntity<List<VehicleDTO>> findAll() {
        List<VehicleDTO> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<VehicleDTO> insert(@RequestBody VehicleRegistryDTO registry) {
        FipeVehicleDTO fipe = getClient.vehiclePrice(
                registry.getVehicleType(),
                registry.getCarmaker(),
                registry.getModel(),
                registry.getYear());
        VehicleDTO dto = new VehicleDTO(registry, fipe);

        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(dto.getId())
                .toUri();

        return ResponseEntity.created(uri).body(dto);
    }
}
