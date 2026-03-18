
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController 
@RequestMapping()
public class StudentController {

	@Autowired
	StudentService pser;
	
	 @PostMapping("/addstu")
	public Student regStudent(@RequestBody Student s) {
		
		 return pser.addStudent(s);
		
	}
	 
	@GetMapping("/getstu")
	public List<Student> getStu(){
		
		return pser.getStudent();
		
	}
	
	@DeleteMapping("/deletestu/{id}")
	public void deletestu(@PathVariable Long id) {
		
		pser.deleteStudent(id);
	}
	
	@PutMapping("/updatestu/{id}")
	public Student updateStudent(
	        @PathVariable Long id,
	        @RequestBody Student updatedStudent) {

	    return pser.updateStudent(id, updatedStudent);
	}
	@RequestMapping(value = "/headstu/{id}", method = RequestMethod.HEAD)
	public ResponseEntity<Void> headStudent(@PathVariable Long id) {

	    boolean exists = pser.existsStudent(id);

	    if (exists) {
	        return ResponseEntity.ok().build();   // 200
	    } else {
	        return ResponseEntity.notFound().build(); // 404
	    }
	}
	
	
	}
