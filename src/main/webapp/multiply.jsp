<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication</title>
</head>
<body>
<h1>Multiplication</h1>
<p>Essentially, to multiply numbers is to add groups of a number. a mathematical
 operation that at its simplest is an abbreviated process of adding an integer to zero 
 a specified number of times and that is extended to other numbers in accordance with 
 laws that are valid for integers.</p>
<form action="multiplyNumbersServlet" method="post">
 Enter the two numbers you would like to multiply:
 <input type="text" name="userNum" size="10">
 *
 <input type="text" name="userNum1" size="10">
 <input type="submit" value="Multiply"/>
 </form>
 <br/>
 <h2>Change your mind? Select another option</h2>
 <a href="add.jsp">Add two numbers</a><br/>
 <a href="subtract.jsp">Subtract two numbers</a><br/>
 <a href="divide.jsp">Divide two numbers</a>
</body>
</html>