package cl.teamweichafe.services.impl;

import cl.teamweichafe.clients.MemberMeasuresServiceClient;
import cl.teamweichafe.common.dtos.MemberMeasureDto;
import cl.teamweichafe.services.MemberMeasuresService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberMeasuresServiceImpl implements MemberMeasuresService {

    private final MemberMeasuresServiceClient memberMeasuresServiceClient;

    public MemberMeasuresServiceImpl(MemberMeasuresServiceClient memberMeasuresServiceClient) {
        this.memberMeasuresServiceClient = memberMeasuresServiceClient;
    }

    @Override
    public MemberMeasureDto create(MemberMeasureDto memberMeasureDto) {
        return this.memberMeasuresServiceClient.create(memberMeasureDto);
    }

    @Override
    public List<MemberMeasureDto> get() {
        return this.memberMeasuresServiceClient.get();
    }

    @Override
    public MemberMeasureDto get(String id) {
        return this.memberMeasuresServiceClient.get(id);
    }

    @Override
    public MemberMeasureDto update(String id, MemberMeasureDto memberMeasureDto) {
        return this.memberMeasuresServiceClient.update(id, memberMeasureDto);
    }

    @Override
    public ResponseEntity delete(String id) {
        return this.memberMeasuresServiceClient.delete(id);
    }
}
