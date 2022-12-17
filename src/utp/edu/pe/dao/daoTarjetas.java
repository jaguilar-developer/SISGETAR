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
import utp.edu.pe.entity.Tarjeta;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoTarjetas extends dataSource {
    
    public List<Tarjeta> listaTarjetas() {
        List<Tarjeta> lstTarjetas = new ArrayList();
        Connection con = getConexion();
        
        try {
            Statement stms = con.createStatement();            
            ResultSet rs = stms.executeQuery("{call SIS_LISTAR_TARJETAS}");
            
            while (rs.next()) {
                Tarjeta tarjeta = new Tarjeta();        
                tarjeta.setIdTarjeta(rs.getInt("IDTARJETA"));
                tarjeta.setServicio(rs.getString("SERVICIO"));
                tarjeta.setMontoPasaje(rs.getFloat("MONTOPASAJE"));
                tarjeta.setDescripcion(rs.getString("DESCRIPCION"));
                
                lstTarjetas.add(tarjeta);
            }            
            return lstTarjetas;
        } catch (SQLException e) {
            Tarjeta tarjeta = new Tarjeta();            
            tarjeta.setServicio("NO DATOS");            
            return lstTarjetas;
        }        
    }    
    
}
