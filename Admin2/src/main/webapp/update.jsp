<%@ page import="com.model.Employee" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Employee emp=(Employee)request.getAttribute("emp"); %>
<form action="update1" method="get">
 
<label for="id">id</label>
<input type="number" name="id" value="<%=emp.getId() %>"><br><br>
<label for="name">name</label>
<input type="text" name="name" value="<%=emp.getName() %>"><br><br>
<label for="age">age</label>
<input type="number" name="age" value="<%=emp.getAge() %>"><br><br>
<label for="salary">salary</label>
<input type="number" name="salary" value="<%=emp.getSalary() %>"><br><br>
<label for="mobile">Mobile</label>
<input type="text" name="mobile" value="<%=emp.getMobile() %>"><br><br>
<label for="isActive">isActive</label>
<input type="boolean" name="isActive" value="<%=emp.isActive() %>"><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>