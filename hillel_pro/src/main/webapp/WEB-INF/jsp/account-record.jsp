<%--
  Created by IntelliJ IDEA.
  User: Skogarren
  Date: 14.05.2025
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="lesson_35_Web_Services.classwork.model.Account" %>
<html>
<head>
    <title>Account Record</title>
</head>
<body>
<%
    if (request.getAttribute("accountRecord") != null) {
        Account account = (Account) request.getAttribute("accountRecord");
%>

<h1>Account Record</h1>
<div>ID: <%=account.getId()%></div>
<div>First Name: <%=account.getFirstName()%></div>
<div>Last Name: <%=account.getLastName()%></div>

<%
} else {
%>

<h1>No Account Record Found.</h1>


<% } %>
</body>
</html>
