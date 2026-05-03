<%@ page import ="java.util.*,com.model.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="emp.html">
<input type="submit" value="add employee">
</form><br><br>
<table border="1">
<tr>
<th>id</th>
<th>name</th>
<th>age</th>
<th>salary</th>
<th>mobile</th>
<th>isActive</th>
<th>link</th>
</tr>
<% List<Employee> list =(List<Employee>) request.getAttribute("list");
for(Employee e:list){%>
<tr>
<th><%=e.getId() %></th>
<th><%=e.getName()%></th>
<th><%=e.getAge() %></th>
<th><%=e.getSalary() %></th>
<th><%=e.getMobile() %></th>
<th><%=e.isActive()%></th>
<th><a href="update?id=<%=e.getId()%>">update</a>|<a href="delete?id=<%=e.getId()%>">delete</a>
</tr>
<%} %>

</table>
</body>
</html>