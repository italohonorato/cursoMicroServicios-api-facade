package cl.teamweichafe.services.impl;

import cl.teamweichafe.clients.MeasuresServiceClient;
import cl.teamweichafe.common.dtos.MeasureDto;
import cl.teamweichafe.services.MeasuresService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeasuresServiceImpl implements MeasuresService {

    private final MeasuresServiceClient measuresServiceClient;

    public MeasuresServiceImpl(MeasuresServiceClient measuresServiceClient) {
        this.measuresServiceClient = measuresServiceClient;
    }

    @Override
    public List<MeasureDto> getAll() {
        return this.measuresServiceClient.getAll();
    }

    @Override
    public MeasureDto getById(String id) {
        return this.measuresServiceClient.getById(id);
    }

    @Override
    public MeasureDto create(MeasureDto measureDto) {
        return this.measuresServiceClient.create(measureDto);
    }

    @Override
    public MeasureDto update(String id, MeasureDto measureDto) {
        return this.measuresServiceClient.update(id, measureDto);
    }

    @Override
    public ResponseEntity delete(String id) {
        return this.measuresServiceClient.delete(id);
    }
}
