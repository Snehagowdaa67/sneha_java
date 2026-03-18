package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Certificate;

public interface Certirepository extends JpaRepository<Certificate, Long> {

}