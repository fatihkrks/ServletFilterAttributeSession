<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ page import="request.dispatch.model.Person" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List<Person> personList= (List<Person>)request.getAttribute("persons");


%>

<table>
<%
for(Person p:personList){
%>
<tr>
<td><%=p.getName() %></td>
<td><%=p.getSurname() %> </td>
</tr>
<%
}
%>
</table>
</body>
</html>