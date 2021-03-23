package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.VendorRepository;
import com.example.demo.model.Vendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VendorController {

    @Autowired
    private VendorRepository vendorRepository;

    @GetMapping("/vendors")
    public Collection<Vendor> vendors() {
        return vendorRepository.findAll();
    }

    @GetMapping("/vendor/{id}")
    public ResponseEntity<?> getVendor(@PathVariable long id) {
        Optional<Vendor> vendor = vendorRepository.findById(id);
        return vendor.map(response -> ResponseEntity.ok().body(vendor))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
