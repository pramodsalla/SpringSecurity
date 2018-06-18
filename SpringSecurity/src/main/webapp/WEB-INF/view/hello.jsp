<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
		<h1>Hello,<security:authentication property="principal.username"/>. Welcome to Spring Security. Namasthe</h1>
		
		
		
		<h2> Your roles	: </h2> <security:authentication property="principal.authorities"/>
		<br>
		<security:authorize access="hasRole('Manager')">
		<a href="${pageContext.request.contextPath}/leader">Only Managers Can access this link!</a>
		</security:authorize>
		
		
		<br>
		
		<security:authorize access="hasRole('Admin')">
		<a href="${pageContext.request.contextPath}/admin">Only Admins Can access this link!</a>
		</security:authorize>
		
		
		
		
		<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value ="Logout" />

		</form:form>
		
		
   </body>
   
</html>