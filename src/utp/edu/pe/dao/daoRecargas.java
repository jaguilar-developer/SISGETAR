/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import utp.edu.pe.entity.Recarga;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoRecargas extends dataSource{
    
        public String crearRecarga(Recarga objRecarga) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_CREAR_RECARGA(?,?,?)}");
            cstmt.setInt("NROCARNE", objRecarga.getNroCarne());
            cstmt.setFloat("MONTORECARGA", objRecarga.getMontoRecarga());                        
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
}
