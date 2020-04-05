<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
wait authentication going onn
<% 
String x=request.getParameter("uname"); 
String y=request.getParameter("pass"); 
if(x.equals("fresherpro") && y.equals("fresherpro")){
	response.sendRedirect("urin.jsp");
}
else{
	response.sendRedirect("iinv.jsp");
	//response.sendRedirect("login.jsp");
}

%>

</body>
</html>