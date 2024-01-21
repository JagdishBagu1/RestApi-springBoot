package com.example.WebApp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebApp.Entity.Student;
import com.example.WebApp.Repo.CRUDopsRepo;
import com.example.WebApp.Service.CRUDopsService;

@Service
public class CRUDopsServiceImpl implements CRUDopsService {
	
	@Autowired
	CRUDopsRepo crudReop;
	
	

	public CRUDopsServiceImpl(CRUDopsRepo crudReop) {
		super();
		this.crudReop = crudReop;
	}



	@Override
	public List<Student> getAllStudents() {

		return  crudReop.findAll();
	}



	@Override
	public void saveStudent(Student student) {
		crudReop.save(student);
	System.out.print("Save");
	}



	@Override
	public Student updateStudent(int id,Student updateStudent) {
		// TODO Auto-generated method stub
		Student existingStudent = crudReop.getById(id);
		
		existingStudent.setFname(updateStudent.getFname());
		existingStudent.setLname(updateStudent.getLname());
		existingStudent.setRollNo(updateStudent.getRollNo());
		existingStudent.setYear(updateStudent.getYear());
		existingStudent.setAddress(updateStudent.getAddress());
		Student savedEntity = crudReop.save(existingStudent);
	return savedEntity;
	}
	@Override
	public void deleteStudent(int id) {
		  crudReop.deleteById(id);
	}
}
