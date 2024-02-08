<%-- 
    Document   : index
    Created on : 8/02/2024, 1:25:47 p. m.
    Author     : rzapata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page de prueba </title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvUsuarios" method="POST">
            <p><label>Dni </label> <input type="text" name="dni"></p>
            <p><label>nombre</label> <input type="text" name="nombre"></p>
            <p><label>apellido</label> <input type="text" name="apellido"></p>
            <p><label>telefono</label> <input type="text" name="telefono"></p>
            
            <button type="submit">Enviar</button>
            
        </form>
        
        <<h2>Traer informacion</h2>
        <form action="SvUsuarios" method="GET">
            <p>Haga click para traer la informacion de los usuarios</p>
            <button type="submit">Mostrar Usuarios</button>
        </form>
    </body>
</html>
