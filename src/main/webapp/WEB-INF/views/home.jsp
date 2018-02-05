<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Avalie Seu Professor.  
</h1>

<table>
  <tr>
	<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Password</th>
  </tr>
  <c:forEach items="${userList}" var="user">
	<tr>
	  <td>${user.id}</td>
	  <td>${user.f_name}</td>
	  <td>${user.l_name}</td>
	  <td>${user.email}</td>
	  <td>${user.password}</td>
	</tr>
  </c:forEach>
</table>



<P>  The time on the server is ${serverTime}. </P>

</body>
</html>
