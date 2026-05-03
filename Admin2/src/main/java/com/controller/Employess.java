package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.model.ProjectDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees")
public class Employess extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	ResultSet rs=ProjectDAO.emp();
	List<Employee> list = new ArrayList<>();
	try {
		while(rs.next())
		{
			try {
				list.add(new Employee(rs.getInt( 1),rs.getString( 2),rs.getInt( 3),rs.getInt( 4),rs.getString( 5),rs.getBoolean( 6)));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//System.out.println(list);
	req.setAttribute( "list", list);
	RequestDispatcher rd = req.getRequestDispatcher("employess.jsp");
	rd.forward(req, resp);
}
}
