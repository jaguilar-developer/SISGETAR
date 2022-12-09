/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.edu.pe.entity.carne;
import utp.edu.pe.entity.empleado;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoCarnes extends dataSource{
    
    public carne buscarCarne(int nroCarne) {        
        carne objCarne = new carne();                
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_CARNE(?)}");
            cstmt.setInt("NROCARNE", nroCarne);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                objCarne.setNroCarne(rs.getInt("NROCARNE"));
                objCarne.setSaldo(rs.getFloat("SALDO"));                
                objCarne.setDescripcion(rs.getString("DESCRIPCION"));
            }            
            return objCarne;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            objCarne.setDescripcionTarjeta("NO DATA");            
            return objCarne;
        }
    }
    
    public List<carne> buscarCarnesXnroDocumento(String nroDocumento) {        
        List<carne> lstCarnes = new ArrayList();
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_CARNES_X_NRODOC(?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                carne objCarne = new carne();                
                objCarne.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                objCarne.setPasajero(rs.getString("PASAJERO"));
                objCarne.setDescripcionTarjeta(rs.getString("DESCRIPCION"));
                objCarne.setNroCarne(rs.getInt("NROCARNE"));
                objCarne.setSaldo(rs.getFloat("SALDO"));
                lstCarnes.add(objCarne);
            }            
            return lstCarnes;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());            
            carne objCarne = new carne();  
            objCarne.setDescripcionTarjeta("NO DATA");
            lstCarnes.add(objCarne);            
            return lstCarnes;
        }
    }
    
}
