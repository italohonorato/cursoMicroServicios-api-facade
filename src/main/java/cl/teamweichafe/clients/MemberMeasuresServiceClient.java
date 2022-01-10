package cl.teamweichafe.clients;

import cl.teamweichafe.common.dtos.MemberMeasureDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "member-measures-service")
public interface MemberMeasuresServiceClient {

    @PostMapping
    MemberMeasureDto create(@RequestBody MemberMeasureDto memberMeasureDto);

    @GetMapping
    List<MemberMeasureDto> get();

    @GetMapping("/{id}")
    MemberMeasureDto get(@PathVariable String id);

    @PutMapping("/{id}")
    MemberMeasureDto update(@PathVariable String id, @RequestBody MemberMeasureDto memberMeasureDto);

    @DeleteMapping("/{id}")
    ResponseEntity delete(@PathVariable String id);
}
