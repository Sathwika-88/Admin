package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.ProjectDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class Updatedelete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		int id = Integer.parseInt(req.getParameter("id"));
	ResultSet rs = ProjectDAO.emp();
	try {
		while(rs.next())
		{
			if(rs.getInt(1)==id)
			{
				ProjectDAO.delete(id);
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	resp.sendRedirect("employees");
	}

}
