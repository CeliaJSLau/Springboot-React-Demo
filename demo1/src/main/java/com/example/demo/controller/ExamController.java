package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.ExamInfoRepository;
import com.example.demo.model.ExamInfo;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;


@RestController
@RequestMapping("/api")
public class ExamController {

    @Autowired
    private ExamInfoRepository examInfoRepository;

    @GetMapping("/exams")
    public Collection<ExamInfo> exams() {
        return examInfoRepository.findAll();
    }

}
