<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
    <meta charset="utf-8">
    <title>Driver's License</title>
	
  </head>
  <body>
  	<div class="all">
  		<h4>License <c:out value="${license.number}"/></h4>
		<p>License Holder: <i><c:out value="${license.person.first_name}"/> <c:out value="${license.person.last_name}"/></i></p>
		<p>State Issued: <i><c:out value="${license.state}"/></i></p>	
		<p>Expiration Date: <i><fmt:formatDate pattern = "yyyy-MM-dd"  value="${license.expiration_date}"/></i></p>
		<a href="/">Back</a> || <a href="/licenses/delete/${license.id}">Delete</a>
  	</div>
  </body>
</html>