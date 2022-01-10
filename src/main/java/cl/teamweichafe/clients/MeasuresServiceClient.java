package cl.teamweichafe.clients;

import cl.teamweichafe.common.dtos.MeasureDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "measures-service")
public interface MeasuresServiceClient {

    @GetMapping
    List<MeasureDto> getAll();

    @GetMapping("/{id}")
    MeasureDto getById(@PathVariable String id );

    @PostMapping
    MeasureDto create(@RequestBody MeasureDto measure);

    @PutMapping("/{id}")
    MeasureDto update(@PathVariable String id, @RequestBody MeasureDto measureDto);

    @DeleteMapping("/{id}")
    ResponseEntity delete(@PathVariable String id);
}
