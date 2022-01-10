package cl.teamweichafe.composer.impl;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.common.dtos.MemberDto;
import cl.teamweichafe.composer.Composer;
import cl.teamweichafe.services.DegreeService;
import cl.teamweichafe.services.MemberService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComposerImpl implements Composer {

    private final MemberService memberService;
    private final DegreeService degreeService;

    public ComposerImpl(MemberService memberService, DegreeService degreeService) {
        this.memberService = memberService;
        this.degreeService = degreeService;
    }

    @Override
    public List<MemberDto> getMembersByDegree(String degreeId) {
        return memberService.getByDegreeId(degreeId);
    }

    @Override
    public List<MemberDto> getMembersByClass(String classId) {
        return memberService.getByClassId(classId);
    }

    @Override
    public List<DegreeDto> getAllDegrees() {
        return degreeService.getAll();
    }
}
