package cl.teamweichafe.controllers;

import cl.teamweichafe.common.dtos.DegreeDto;
import cl.teamweichafe.common.dtos.MemberDto;
import cl.teamweichafe.composer.Composer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiFacadeController {

    private final Composer composer;

    public ApiFacadeController(Composer composer) {
        this.composer = composer;
    }

    @GetMapping("/members/degree/{degreeId}")
    public ResponseEntity<List<MemberDto>> getMembersByDegree(@PathVariable String degreeId) {

        return ResponseEntity.ok(composer.getMembersByDegree(degreeId));
    }

    @GetMapping("/members/class/{classId}")
    public ResponseEntity<List<MemberDto>> getMembersByClass(@PathVariable String classId) {

        return ResponseEntity.ok(composer.getMembersByClass(classId));
    }

    @GetMapping("/degrees")
    public ResponseEntity<List<DegreeDto>> getAllDegrees() {

        return ResponseEntity.ok(composer.getAllDegrees());
    }
}
