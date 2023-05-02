/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloo;


import org.springframework.jdbc.core.JdbcTemplate;


public class Consulta {
    private JdbcTemplate jt;

    public Consulta() {
        Conexion hola=new Conexion();
        this.jt=new JdbcTemplate(hola.conectar());
    }

    public void agregar(String nombre, int edad){
        String sql="INSERT INTO practica (Nombre,Edad,Promedio) VALUES (?,?)";
        double pr=0;
            pr=    edad/2;
        jt.update(sql,nombre,edad,pr);
       
   }

    }

