package com.util;

public class Constants {
public static final String url="jdbc:mysql://localhost:3306/web";
public static final String username="root";
public static final String password="Dimpu*88";
public static final String insert_admin="insert into admin(username,password) values(?,?)";
public static final String select_admin="select * from admin";
public static final String select_employee="select * from employee";
public static final String insert_employee="insert into employee(name,age,salary,mobile,isActive) value(?,?,?,?,?)";
public static final String insert_employee1="insert into employee(name,age,salary,mobile) value(?,?,?,?)";
public static final String update_employee="update employee set name = ?, age = ?,salary=?,mobile=?,isActive=? where id=?";
public static final String delete_employee="update employee set isActive=0 where id=?";
}
