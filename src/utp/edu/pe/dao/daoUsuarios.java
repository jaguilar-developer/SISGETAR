/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import utp.edu.pe.entity.Usuario;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoUsuarios extends dataSource{
    
    public Usuario validarUsuario(Usuario objUsuario) {
        Connection con = getConexion();
        Usuario objUser = new Usuario();
        String codRespuesta;
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_VALIDAR_USUARIO(?,?,?,?,?)}");
            cstmt.setNString("USUARIO", objUsuario.getUsuario());
            cstmt.setNString("PASSWORD", objUsuario.getPassword());
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.registerOutParameter("ROLRESPUESTA", java.sql.Types.VARCHAR);
            cstmt.registerOutParameter("NRODOCUMENTO", java.sql.Types.VARCHAR);
            cstmt.execute();            
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
            objUser.setUsuario(objUsuario.getUsuario());
            objUser.setEstado(codRespuesta.equals("0"));
            objUser.setRol(cstmt.getString("ROLRESPUESTA"));
            objUser.setNumeroDocumento(cstmt.getString("NRODOCUMENTO"));
            
            return objUser;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            objUser.setEstado(false);
            return objUser;            
        }
    }    
}
