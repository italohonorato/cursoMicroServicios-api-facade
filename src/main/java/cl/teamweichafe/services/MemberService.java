package cl.teamweichafe.services;

import cl.teamweichafe.common.dtos.MemberDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MemberService {

    MemberDto create(MemberDto memberDto);

    MemberDto getById(String id);

    List<MemberDto> getByDegreeId(String id);

    List<MemberDto> getByClassId(String id);

    MemberDto update(String id, MemberDto memberDto);

    List<MemberDto> getAll();

    ResponseEntity delete(String id);
}
