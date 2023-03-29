<%@page import="Dto.Customer1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Customer1 customer1=(Customer1)request.getAttribute("key1"); %>
<%=customer1.getCustomer_id() %> 
<%=customer1.getCustomer_name()%>
<%=customer1.getEmail()%>
<%=customer1.getPhone_number()%>
<%=customer1.getBooking_id()%> 
<%=customer1.getDrone_shot_id() %> 
<%=customer1.getLocation_id()%>
<%=customer1.getCreated_time()%>

</body>
</html>