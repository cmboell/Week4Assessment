<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition</title>
</head>
<body>
<h1>Addition</h1>
<p>The addition is an operation used in math to add numbers. The obtained result or 
answer after addition is known as a sum. For example, 
if we add 2 and 3, (2 + 3) we get the sum as 5. 
Here we performed the addition operation on two numbers 2 and 3 to 
get the sum i.e. 5.</p>
<form action="addNumbersServlet" method="post">
 Enter the two numbers you would like to add:
 <input type="text" name="userNum" size="10">
 +
 <input type="text" name="userNum1" size="10">
 <input type="submit" value="Add"/>
 </form>
 <br/>
 <h2>Change your mind? Select another option:</h2>
 <a href="subtract.jsp">Subtract two numbers</a><br/>
 <a href="multiply.jsp">Multiply two numbers</a><br/>
 <a href="divide.jsp">Divide two numbers</a>
</body>
</html>