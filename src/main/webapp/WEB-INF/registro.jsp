<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 27-06-2022
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Registro</title>
</head>
<body>
<! -- <div>
    <!-- pasar la info desde la vista a una url(action)
    con get los parametros se ven en la ruta
    con post los parametros quedan ocultos -->
    <form action="/registro/usuario" method="post">
        <label for="nombre"> Nombre: </label>
        <input type="text" id="nombre" name="nombre">
        <br>
        <label for="apellido"> Apellido: </label>
        <input type="text" id="apellido" name="apellido">
        <br>
        <label for="edad"> Edad: </label>
        <input type="number" id="edad" name="edad">
        <br>
        <input type="submit" value="Registrar">
        <br>
        <!-- <input type="button" value="Enviar"> -->

    </form>
</div>
</body>
</html>
