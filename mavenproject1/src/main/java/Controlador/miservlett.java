/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modeloo.*;

/**
 *
 * @author skafi
 */
@WebServlet(name = "miservlett", urlPatterns = {"/miservlett"})
public class miservlett extends HttpServlet {




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String nombre=request.getParameter("nombre");
      int edad=Integer.parseInt( request.getParameter("edad"));
         Consulta obj=new Consulta();
         obj.agregar(nombre, edad);
            response.sendRedirect("muestra.jsp");

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
