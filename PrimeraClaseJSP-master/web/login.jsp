<%-- 
    Document   : login
    Created on : 24-oct-2017, 12:54:26
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
        <form method="POST" action="/validaLogin.do">
            <input type="text" name="usuario" placeholder="Ingresa usuario">
            <input type="text" name="pass" placeholder="Ingresa la contrasena">
            <input type="submit" value="Envia">
        </form>
    </body>
</html>
