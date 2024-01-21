package com.example.WebApp.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebApp.Entity.Student;
import com.example.WebApp.Service.CRUDopsService;
@RestController
public class CRUDopsController {

	@Autowired
	CRUDopsService crudservice;

	public CRUDopsController(CRUDopsService crudservice) {
		super();
		this.crudservice = crudservice;
	}
	
	@GetMapping("/students")
	List<Student> getAll(){
		return crudservice.getAllStudents();
	}
	 
	@PostMapping("/student")
	void newStudent(@RequestBody Student student) {
		 crudservice.saveStudent(student);
	}
	
	@PutMapping("/student/{id}")
	Student updatestudent(@PathVariable( value="id") int id,Student student) {
		
		return crudservice.updateStudent(id, student);
	}
	@DeleteMapping("/student/{id}")
	void deleteStudent(@PathVariable( value="id") int id) {
		 crudservice.deleteStudent(id);
	}
}
