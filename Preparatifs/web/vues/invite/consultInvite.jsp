<%-- 
    Document   : consultInvite
    Created on : 8 nov. 2018, 18:08:54
    Author     : Minh kiêu
--%>

<%@page import="modele.Invite"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <tr>
             <%
Invite unInvite = (Invite)request.getAttribute("pInvite");
%>
        <td>nom :</td>
        <td><%  out.println(unInvite.getNom());%></td>  
    </tr>
    </body>
</html>
