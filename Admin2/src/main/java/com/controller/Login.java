package com.controller;

import java.io.IOException;

import com.model.Admin;
import com.model.ProjectDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	Admin ad=new Admin(username,password);
	if(ProjectDAO.check(ad))
	{
		 resp.sendRedirect("employees");
	}
	else
	{
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.forward(req, resp);
	}
}
}
