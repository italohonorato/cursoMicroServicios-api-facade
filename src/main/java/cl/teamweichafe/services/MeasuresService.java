package cl.teamweichafe.services;

import cl.teamweichafe.common.dtos.MeasureDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MeasuresService {

    List<MeasureDto> getAll();

    MeasureDto getById(String id );

    MeasureDto create(MeasureDto measure);

    MeasureDto update(String id, MeasureDto measureDto);

    ResponseEntity delete(String id);
}
