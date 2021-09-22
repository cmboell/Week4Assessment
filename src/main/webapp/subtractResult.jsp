<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subtraction Result</title>
</head>
<body>
<!-- her displays the results as well as the two numbers the user entered -->
<p>
Below is your problem with the sum: <br/>
${userNumResult.getFirstNumber()} - 
${userNumResult.getSecondNumber()} = 
${userNumResult.getResult()}
</p>
 <br/>
 <!-- link to return us home -->
 <h5>If you would like to do another math problem return to home</h5>
 <a href="index.jsp">Home</a><br/>
</body>
</html>