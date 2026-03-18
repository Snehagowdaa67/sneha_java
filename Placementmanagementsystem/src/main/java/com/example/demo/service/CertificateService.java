package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.Certirepository;

@Service
public class CertificateService {

	@Autowired
	public Certirepository cerepo;
	
	public Certificate addCertificate(Certificate cert) {
	
		return cerepo.save(cert);
	
	}
	
}