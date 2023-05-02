/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;



public class Registro {
      private JdbcTemplate jTemplate;
      private String nombre;
   private int edad;
   
       

    public Registro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Registro() {
       Conexion con=new Conexion();
        this.jTemplate = new JdbcTemplate(con.conectar());
    }
   public ArrayList mostrarUsua(){
String sql="SELECT * FROM practica";
   List<Registro> lista = jTemplate.query(sql, new Object[]{}, new RowMapper<Registro>() {
    public Registro mapRow(ResultSet rs, int rowNum) throws SQLException {
        Registro user = new Registro();  
        user.setNombre(rs.getString("nombre"));
        user.setEdad(rs.getInt("edad"));
        return user;
      
  }  


    
});
        return (ArrayList)lista;}
int cont=0;
  public void imprimirLis(){
      ArrayList<Registro> listado=new ArrayList<Registro>();
      listado=mostrarUsua();
      Iterator it=listado.iterator();
      while(it.hasNext()){
          
      Registro objeto=(Registro)it.next();
           cont++;
          System.out.println("Usuariooooooooooooooooooooooo" +objeto.getNombre());
          System.out.println("edad"+objeto.getEdad());
      }
      
  }

}