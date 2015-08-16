<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html> <head> <title>Spring Sample - Login Page</title> </head> 
<body> 

<h3>Login Page</h3> <br/> 
<form:form commandName="login" method="POST" name="login" modelAttribute="mylogin"> 
User name:<form:input path="customerId"/> 
<font color="red"><form:errors path="customerId"/></font><br/><br/> 
Password:<form:password path="password"/> <font color="red">
<form:errors path="password"/></font><br/><br/> 
<input type="submit" value="Login"/> 
</form:form> 

</body> 
</html>	

