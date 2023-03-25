package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/findAll")
	List<Student> getAllStudents(){
		
		return studentRepo.findAll();
	}
	
	@PostMapping("/insert")
	Student insertStudent(@RequestBody Student student) {
		
	 return studentRepo.save(student);
	}
}
