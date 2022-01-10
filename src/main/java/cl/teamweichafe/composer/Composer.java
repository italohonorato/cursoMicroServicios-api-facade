package cl.teamweichafe.composer;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.common.dtos.MemberDto;

import java.util.List;

public interface Composer {
    List<MemberDto> getMembersByDegree(String degreeId);
    List<MemberDto> getMembersByClass(String classId);
    List<DegreeDto> getAllDegrees();
}
