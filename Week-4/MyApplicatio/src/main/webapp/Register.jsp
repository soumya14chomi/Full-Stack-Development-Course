<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "EmployeeServlet" method = "post">
	Id: <input type ="text" name ="eid"><br>
	Name : <input type ="text" name ="ename"><br>
	Email: <input type = "text" name ="email"><br>
	Password: <input type= "password" name = "epassword"><br>
	salary: <input type ="text" name ="esalary"><br>

	<input type ="submit" value ="Register">
</form>
</body>
</html>