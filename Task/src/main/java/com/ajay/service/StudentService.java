package com.ajay.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentService {
	List<Student> std1 = new ArrayList<Student>();
	
	StudentService() {	
	}
		
	public void save(Student std) {
		std1.add(std);
		System.out.println("adding studnnet name");
		for (Student student : std1) {}		
	}
	public List<Student> dispaly() {
	for (Student student : std1) {
			System.out.println(student);
		}
		return std1;
	}
}


