<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subtraction</title>
</head>
<body>
<h1>Subtraction</h1>
<p>Subtraction is the operation of taking the difference d=x-y of two numbers x and y. 
Here, x is called the minuend, y is called the subtrahend, and the symbol between the x
 and y is called the minus sign. The expression "x-y" is read "x minus y." 
 Subtraction is the inverse of addition, so x+y-y=x-y+y=x.The subtraction of a number 
 from itself gives 0, while the subtraction of a real number from a smaller real 
 number gives a negative real number. Subtraction of real numbers can be naturally 
 extended to complex numbers.</p>
<form action="subtractNumbersServlet" method="post">
 Enter the two numbers you would like to subtract:
 <input type="text" name="userNum" size="10">
 -
 <input type="text" name="userNum1" size="10">
 <input type="submit" value="Subtract"/>
 </form>
<br/>
 <h2>Change your mind? Select another option</h2>
 <a href="add.jsp">Add two numbers</a><br/>
 <a href="multiply.jsp">Multiply two numbers</a><br/>
 <a href="divide.jsp">Divide two numbers</a>
</body>
</html>