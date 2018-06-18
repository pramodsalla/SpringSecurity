<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<html>


<head>

<title>Custom login Page</title>
	
		<style>.failed{color: red; }
		.logoff{color:green;}
		</style>
</head>

<body>

<h3>Pramod's Custom Login Page</h3>

<c:if test="${param.error != null}">
<i class=failed> Sorry User, You have entered wrong Credentials !!</i>
</c:if>	

<c:if test="${param.logout != null}">
<i class=logoff> Great User You have successfully logged Out !!</i>
</c:if>	

<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">


<p>User Name :<input type="text" name="username"></p>

<p>User Password :<input type="password" name="password"></p>

<input type="submit" value ="Login" >

</form:form>



</body>

</html>


