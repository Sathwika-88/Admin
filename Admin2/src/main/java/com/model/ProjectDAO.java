package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.Constants;

public class ProjectDAO {
static Connection connection;
public static Connection getConnection()
{
	if(connection==null)
	{
	 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
		connection=DriverManager.getConnection(Constants.url,Constants.username, Constants.password);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	return connection;
}
public static void save(Admin admin)
{
	Connection connection=getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement(Constants.insert_admin);
		statement.setString(1,admin.getUsername());
		statement.setString( 2,admin.getPassword());
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static boolean check(Admin admin)
{
	Connection connection=getConnection();
	 try {
		PreparedStatement statement = connection.prepareStatement(Constants.select_admin);
		 ResultSet rs = statement.executeQuery();
		 while(rs.next())
		 {
			 if(rs.getString(2).equals(admin.getUsername()))
			 {
				 if(rs.getString(3).equals( admin.getPassword()))
					 return true;
			 }
		 }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return false;
}
public static  ResultSet emp()
{
	Connection connection=getConnection();
	ResultSet rs = null;
	 	try {
	 		PreparedStatement statement = connection.prepareStatement(Constants.select_employee);

		 rs=statement.executeQuery();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 	return rs;
}
public static void insertEmp(Employee emp)
{
	Connection connection=getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement(Constants.insert_employee);
		statement.setString( 1, emp.getName());
		statement.setInt( 2, emp.getAge());
		statement.setInt( 3,emp.getSalary());
		statement.setString(4,emp.getMobile());
		statement.setBoolean( 5,emp.isActive());
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void insertEmp1(Employee emp)
{
	Connection connection=getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement(Constants.insert_employee1);
		statement.setString( 1, emp.getName());
		statement.setInt( 2, emp.getAge());
		statement.setInt( 3,emp.getSalary());
		statement.setString(4,emp.getMobile());
		//statement.setBoolean( 5,emp.isActive());
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void delete(int id)
{
	Connection connection=getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement(Constants.delete_employee);
		statement.setInt( 1, id);
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void update(Employee emp)
{
	Connection connection=getConnection();
	try {
		PreparedStatement statement = connection.prepareStatement( Constants.update_employee);
		statement.setString( 1, emp.getName());
		statement.setInt( 2,emp.getAge());
		statement.setInt( 3,emp.getSalary());
		statement.setString( 4, emp.getMobile());
		statement.setInt( 6,emp.getId());
		statement.setBoolean( 5, emp.isActive());
		
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
