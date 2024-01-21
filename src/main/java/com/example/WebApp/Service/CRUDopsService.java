package com.example.WebApp.Service;

import java.util.List;

import com.example.WebApp.Entity.Student;

public interface CRUDopsService {
public List<Student> getAllStudents();
public void saveStudent(Student student);
public Student updateStudent(int id,Student updatedStudent);
public void deleteStudent(int id);

}
