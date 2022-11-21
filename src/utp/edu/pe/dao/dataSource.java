/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author Jerry Aguilar - U21229611
 */
public class dataSource {
    
    public Connection getConexion() {
        
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=DB_SISGETAR;"
                + "user=sa;"
                + "password=123;"
                +  "encrypt=true;trustServerCertificate=true";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }    
}