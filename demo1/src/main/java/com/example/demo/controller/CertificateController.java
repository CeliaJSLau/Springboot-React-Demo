package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.CertificateRepository;
import com.example.demo.model.Certificate;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;


@RestController
@RequestMapping("/api")
public class CertificateController {


    @Autowired
    private CertificateRepository certificateRepository;
    
    @GetMapping("/certificates")
    public Collection<Certificate> certificates(){
        return certificateRepository.findAll();
    }
    
}
