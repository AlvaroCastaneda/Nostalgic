<%-- 
    Document   : recupera
    Created on : 24-oct-2017, 13:27:44
    Author     : RigoBono
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion=request.getSession();
            sesion.getAttribute("nombreUsuario");
            out.print(" "+sesion.getAttribute("nombreUsuario"));
        %>
        <h1>Hello World!  ${nombreUsuario}</h1>
    </body>
</html>
