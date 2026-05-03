package com.controller;

import java.io.IOException;

import com.model.Admin;
import com.model.ProjectDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class Signup extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String username=req.getParameter("username");
	String password = req.getParameter("password");
	Admin ad=new Admin(username,password);
	System.out.println(ad);
	ProjectDAO.save(ad);
	resp.sendRedirect("index.html");
}
}
