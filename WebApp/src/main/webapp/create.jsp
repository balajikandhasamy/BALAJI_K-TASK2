<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="customer" modelAttribute="customerkey">
customer-id:<form:input path="customer_id"/>
customer-name;<form:input path="customer_name"/>
email:<form:input path="email"/>
phone-number:<form:input path="phone_number"/>
booking-id:<form:input path="booking_id"/>
location-id:<form:input path="location_id"/>
drone-shot-id:<form:input path="drone_shot_id"/>
time:<form:input type="time" path="created_time" max="24.00" min="1.00"/>
<form:button>submit</form:button>
</form:form>
</body>
</html>