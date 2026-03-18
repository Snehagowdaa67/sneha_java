
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Sturepository;

@Service
public class StudentService {
	
	@Autowired
	//Creating
	public Sturepository prepo;
	
	//Inserting
	public Student addStudent(Student stu) {
	
		return prepo.save(stu);
	
	}
	
	//Retrieving
	public List<Student> getStudent()
	{
		return prepo.findAll();
	
	}
	
	//Deleting
	public void deleteStudent(Long id) {
		
		prepo.deleteById(id);
	}
	
	//Updating
	public Student updateStudent(Long id, Student updatedStudent) {

	    Student existing = prepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Not found"));

	    existing.setName(updatedStudent.getName());
	    existing.setRoll(updatedStudent.getRoll());
	    existing.setQualification(updatedStudent.getQualification());
	    existing.setCourse(updatedStudent.getCourse());
	    existing.setYear(updatedStudent.getYear());
	    existing.setHallTicketNo(updatedStudent.getHallTicketNo());
	    existing.setCollege(updatedStudent.getCollege());
	    existing.setCertificate(updatedStudent.getCertificate());

	    return prepo.save(existing);
	}
	public boolean existsStudent(Long id) {
	    return prepo.existsById(id);
	}
}