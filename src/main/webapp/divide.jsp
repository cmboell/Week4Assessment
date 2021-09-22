<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division</title>
</head>
<body>
<h1>Division</h1>
<p>The division is a method of distributing a group of things into equal parts. It is
 one of the four basic operations of arithmetic, which gives a fair 
 result of sharing. The division is an  of multiplication. If 3 groups of 4 
 make 12 in multiplication; 12 divided into 3 equal groups give 4 in each group in 
 division.</p>
<form action="divideNumbersServlet" method="post">
 Enter the two numbers you would like to divide:
 <input type="text" name="userNum" size="10">
 /
 <input type="text" name="userNum1" size="10">
 <input type="submit" value="Divide"/>
 </form>
 <br/>
 <h2>Change your mind? Select another option</h2>
 <a href="add.jsp">Add two numbers</a><br/>
 <a href="subtract.jsp">Subtract two numbers</a><br/>
 <a href="multiply.jsp">Multiply two numbers</a>
</body>
</html>