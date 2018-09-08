package com.ajay.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDisplay extends HttpServlet {
	
	List<Student> students = new ArrayList<Student>();	
	StudentService sd = new StudentService();	  
	public StudentDisplay() {		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String cpi = request.getParameter("cpi");
		int result = Integer.parseInt(cpi);
		
		if(result == 1) {		
			Student st = new Student();
			String abc = request.getParameter("abc");
			int xyz = Integer.parseInt(request.getParameter("xyz"));
			int age = Integer.parseInt(request.getParameter("age"));
			st.setStdId(xyz);
			st.setStdName(abc);
			st.setStdAge(age);
			sd.save(st);
			students = sd.dispaly();
			request.setAttribute("student", students);
			request.getRequestDispatcher("something.jsp").forward(request, response);
		}
		else if(result ==2) {
			students = sd.dispaly();
			request.setAttribute("student", students);
			request.getRequestDispatcher("something.jsp").forward(request, response);
		}		
		
	}
}
