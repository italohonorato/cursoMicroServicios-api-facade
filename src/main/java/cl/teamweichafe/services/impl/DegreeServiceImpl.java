package cl.teamweichafe.services.impl;

import cl.teamweichafe.clients.DegreesServiceClient;
import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.services.DegreeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeServiceImpl implements DegreeService {

    private final DegreesServiceClient degreesServiceClient;

    public DegreeServiceImpl(DegreesServiceClient degreesServiceClient) {
        this.degreesServiceClient = degreesServiceClient;
    }

    @Override
    public List<DegreeDto> getAll() {
        return this.degreesServiceClient.getAll();
    }

    @Override
    public DegreeDto getById(String id) {
        return this.degreesServiceClient.getById(id);
    }

    @Override
    public DegreeDto create(DegreeDto degreeDto) {
        return this.degreesServiceClient.create(degreeDto);
    }

    @Override
    public DegreeDto update(String id, DegreeDto degreeDto) {
        return this.degreesServiceClient.update(id, degreeDto);
    }

    @Override
    public ResponseEntity delete(String id) {
        return this.degreesServiceClient.delete(id);
    }
}
