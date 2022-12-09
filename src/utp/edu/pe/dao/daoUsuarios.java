/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import utp.edu.pe.entity.usuario;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoUsuarios extends dataSource{
    
    public Boolean validarUsuario(usuario objUsuario) {
        Connection con = getConexion();
        String rol, codRespuesta;
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_VALIDAR_USUARIO(?,?,?,?)}");
            cstmt.setNString("USUARIO", objUsuario.getUsuario());
            cstmt.setNString("PASSWORD", objUsuario.getPassword());
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.registerOutParameter("ROLRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            
            codRespuesta = cstmt.getString("CODRESPUESTA");
            rol = cstmt.getString("ROLRESPUESTA");
            return codRespuesta.equals("0");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;            
        }
    }    
}
