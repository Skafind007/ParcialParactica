/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloo;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conexion {
      public DriverManagerDataSource conectar(){
        DriverManagerDataSource data = new DriverManagerDataSource();
        data.setDriverClassName("com.mysql.cj.jdbc.Driver");
        data.setUrl("jdbc:mysql://localhost:3306/practicap?useSSL=false");
        data.setUsername("root");
        data.setPassword("");
        return data;
}
}
