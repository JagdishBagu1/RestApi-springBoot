package com.example.WebApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id
private int id;
private String fname;
private String lname;
private int rollNo;
private int year;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int id, String fname, String lname, int rollNo, int year, String address) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.rollNo = rollNo;
	this.year = year;
	this.address = address;
}

	
	
}
