package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.Certirepository;

@RestController
@RequestMapping("/certi")
public class CertificateController {
	
	@Autowired
    private Certirepository repo;

    @PostMapping("/add")
    public Certificate addCertificate(@RequestBody Certificate c) {
        return repo.save(c);
    }
    
}