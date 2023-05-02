<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modeloo.*" %>

<%
    Registro use = new Registro();
    
    ArrayList hola = new ArrayList();
    hola= use.mostrarUsua(); 
use.imprimirLis();
 int num = hola.size();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <table border="2">
            <thead>
                <th>Nombre</th>
                <th>Edad</th>
             
            </thead>
           
            <tbody>
                <% 
                        Iterator it = hola.iterator();
                        while(it.hasNext()){
                            Registro holaa = (Registro)it.next();%>
                            <tr>
                                <td><%= holaa.getNombre() %></td>
                                <td><%= holaa.getEdad() %></td>
                           
                                
                            </tr>
                    <% } %>
                    
            </tbody>
           
        </table>
                    <h1><%=num%></h1>
    </body>
</html>
