package cl.teamweichafe.clients;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.configs.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "degrees-service", path = "/degrees", configuration = FeignConfig.class)
public interface DegreesServiceClient {

    @GetMapping
    List<DegreeDto> getAll();

    @GetMapping("/{id}")
    DegreeDto getById(@PathVariable String id );

    @PostMapping
    DegreeDto create(@RequestBody DegreeDto degreeDto);

    @PutMapping("/{id}")
    DegreeDto update(@PathVariable String id, @RequestBody DegreeDto degreeDto);

    @DeleteMapping("/{id}")
    ResponseEntity delete(@PathVariable String id);
}
