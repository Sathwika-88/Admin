package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Employee;
import com.model.ProjectDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class Update extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	int id = Integer.parseInt(req.getParameter( "id"));
	ResultSet rs = ProjectDAO.emp();
	Employee emp;
	try {
		while(rs.next())
		{
			if(rs.getInt(1)==id)
			{
				emp=new Employee(rs.getInt(1),rs.getString(2),rs.getInt( 3),rs.getInt( 4),rs.getString(5),rs.getBoolean(6));
				//System.out.println(emp);
				req.setAttribute( "emp", emp);
				//resp.sendRedirect("update.jsp");;
				RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
				rd.forward(req, resp);
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block 
		e.printStackTrace();
	}
}

	 
}
