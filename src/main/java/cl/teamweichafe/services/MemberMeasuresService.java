package cl.teamweichafe.services;

import cl.teamweichafe.common.dtos.MemberMeasureDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MemberMeasuresService {

    MemberMeasureDto create(MemberMeasureDto memberMeasureDto);

    List<MemberMeasureDto> get();

    MemberMeasureDto get(String id);

    MemberMeasureDto update(String id, MemberMeasureDto memberMeasureDto);

    ResponseEntity delete(String id);
}
