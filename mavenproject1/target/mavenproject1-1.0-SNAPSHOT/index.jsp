<%-- 
    Document   : newjsp
    Created on : 27/04/2023, 11:41:06 a. m.
    Author     : skafi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
           <form action="miservlett" method="post" class="formulario">
                <div class="campo">
                    <label for="nombre" class="campo_label">Nombre</label>
                    <input type="text" class="campo_field" name="nombre">
                </div>
               
                    <label for="edad" class="campo_label">Edad</label>
                    <input type="number" name="edad">
            
               
            <div >
                <input type="submit"  value="Enviar">
            </div>
    </form>
    </body>
</html>
