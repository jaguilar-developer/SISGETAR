/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utp.edu.pe.entity.tarjeta;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoTarjetas extends dataSource {
    
    public List<tarjeta> listaTarjetas() {
        List<tarjeta> lstTarjetas = new ArrayList();
        Connection con = getConexion();
        
        try {
            Statement stms = con.createStatement();
            //{} NO COLOQUES LLAVES SI ES UN SELECT DIRECTO
            ResultSet rs = stms.executeQuery("SELECT SERVICIO, MONTOPASAJE, DESCRIPCION FROM TB_TARJETA");
            
            while (rs.next()) {
                tarjeta tarjeta = new tarjeta();                
                tarjeta.setServicio(rs.getString("SERVICIO"));
                tarjeta.setMontoPasaje(rs.getFloat("MONTOPASAJE"));
                tarjeta.setDescripcion(rs.getString("DESCRIPCION")); //VALIDA QUE EL NOMBRE SEA IGUAL A TU SELECT
                
                lstTarjetas.add(tarjeta);
            } 
            
            return lstTarjetas;
        } catch (SQLException e) {
            tarjeta tarjeta = new tarjeta();            
            tarjeta.setServicio("NO DATOS");            
            return lstTarjetas;
        }        
    }    
    
}
