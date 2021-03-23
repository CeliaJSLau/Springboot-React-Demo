package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.SkillRepository;
import com.example.demo.model.Skill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class SkillController {

    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/skills")
    public Collection<Skill> skills() {
        return skillRepository.findAll();
    }

    @GetMapping("/skill/{id}")
    public ResponseEntity<?> getSkill(@PathVariable long id) {
        Optional<Skill> skill = skillRepository.findById(id);
        return skill.map(response -> ResponseEntity.ok().body(skill))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
