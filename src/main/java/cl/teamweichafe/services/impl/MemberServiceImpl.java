package cl.teamweichafe.services.impl;

import cl.teamweichafe.clients.MemberServiceClient;
import cl.teamweichafe.common.dtos.MemberDto;
import cl.teamweichafe.services.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberServiceClient memberServiceClient;

    public MemberServiceImpl(MemberServiceClient memberServiceClient) {
        this.memberServiceClient = memberServiceClient;
    }

    @Override
    public MemberDto create(MemberDto memberDto) {
        return this.memberServiceClient.create(memberDto);
    }

    @Override
    public MemberDto getById(String id) {
        return this.memberServiceClient.getById(id);
    }

    @Override
    public List<MemberDto> getByDegreeId(String id) {
        return this.memberServiceClient.getByDegreeId(id);
    }

    @Override
    public List<MemberDto> getByClassId(String id) {
        return this.memberServiceClient.getByClassId(id);
    }

    @Override
    public MemberDto update(String id, MemberDto memberDto) {
        return this.memberServiceClient.update(id, memberDto);
    }

    @Override
    public List<MemberDto> getAll() {
        return this.memberServiceClient.getAll();
    }

    @Override
    public ResponseEntity delete(String id) {
        return this.memberServiceClient.delete(id);
    }
}
