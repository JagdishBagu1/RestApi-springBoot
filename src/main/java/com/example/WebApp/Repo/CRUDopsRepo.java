package com.example.WebApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.WebApp.Entity.Student;


public interface CRUDopsRepo extends JpaRepository<Student ,Integer> {

}
