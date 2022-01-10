package cl.teamweichafe.services;

import cl.teamweichafe.common.dtos.DegreeDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DegreeService {

    List<DegreeDto> getAll();

    DegreeDto getById(String id );

    DegreeDto create(DegreeDto degreeDto);

    DegreeDto update(String id, DegreeDto degreeDto);

    ResponseEntity delete(String id);
}
