package com.controller;

import java.io.IOException;

import com.model.Employee;
import com.model.ProjectDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update1")
public class Update1 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	Employee emp=new Employee(Integer.parseInt( req.getParameter( "id")),req.getParameter("name"),Integer.parseInt(req.getParameter("age")),Integer.parseInt(req.getParameter("salary" )),req.getParameter( "mobile"),Boolean.parseBoolean( req.getParameter("isActive")));
	//System.out.println(emp);
	ProjectDAO.update(emp);
	//resp.sendRedirect( "employees");
	RequestDispatcher rd = req.getRequestDispatcher("employees");
	rd.forward(req, resp);
	}
}
