package com.controller;

import java.io.IOException;

import com.model.Employee;
import com.model.ProjectDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		int salary=Integer.parseInt(req.getParameter("salary"));
		String mobile= req.getParameter("mobile");
		//boolean isActive= Boolean.parseBoolean(req.getParameter("isActive"));
		ProjectDAO.insertEmp1(new Employee(name,age,salary,mobile));
		resp.sendRedirect("employees");
	}

}
