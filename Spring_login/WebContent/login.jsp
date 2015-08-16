<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<h2>User Login Page</h2>

<%-- <s:form modelAttribute="LoginBean" action="log_in.htm"> --%>
<%-- Customer ID:<s:input path="LoginBean.customerId"></s:input><br> --%>
<%-- Password:<s:input path="LoginBean.password"></s:input><br> --%>
<!-- <input type="submit" value="submit" > -->
<%-- </s:form> --%>

<!-- <!-- <form action="log_in.htm" >  --> 
<!-- <!-- Customer ID:<input name="customerId"></input><br>  --> 
<!-- <!-- Password:<input name="password"></input><br> -->
<!-- <!-- <input type="submit" value="Submit" > --> 
<!-- <!-- </form>  --> 

<form:form method="POST" modelAttribute="mylogin" action="/loginInto">
   <table>
    <tr>
        <td><form:label path="customerId">Customer Id</form:label></td>
     <td><form:input path="customerId" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Login"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>