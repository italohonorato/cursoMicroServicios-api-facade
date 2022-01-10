package cl.teamweichafe.clients;

import cl.teamweichafe.common.dtos.MemberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "members-service", path = "/members")
public interface MemberServiceClient {

    @PostMapping
    MemberDto create(@RequestBody MemberDto memberDto);

    @GetMapping("/{id}")
    MemberDto getById(@PathVariable String id);

    @GetMapping("/degree/{id}")
    List<MemberDto> getByDegreeId(@PathVariable String id);

    @GetMapping("/class/{id}")
    List<MemberDto> getByClassId(@PathVariable String id);

    @PutMapping("/{id}")
    MemberDto update(@PathVariable String id, @RequestBody MemberDto memberDto);

    @GetMapping
    List<MemberDto> getAll();

    @DeleteMapping("/{id}")
    ResponseEntity delete(@PathVariable String id);
}
