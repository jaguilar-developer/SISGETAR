/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utp.edu.pe.entity.Usuario;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoUsuarios extends dataSource{
    
    public String cambiarPass(String usuario, String pass) {
        String codRespuesta;
        Connection con = getConexion();
        
        try {
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_CAMBIAR_PASS(?,?,?)}");
            cstmt.setNString("USUARIO", usuario);
            cstmt.setNString("PASSWORD", pass);
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);
            cstmt.execute();            
            codRespuesta = cstmt.getString("CODRESPUESTA");            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }
        
        return codRespuesta;        
    }
    
    public String restaurarUsuario(String usuario) {
        String codRespuesta;
        Connection con = getConexion();
        
        try {
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_RESTAURAR_USUARIO(?,?)}");
            cstmt.setNString("USUARIO", usuario);
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);
            cstmt.execute();            
            codRespuesta = cstmt.getString("CODRESPUESTA");            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }
        
        return codRespuesta;        
    }
    
    public List<Usuario> listarUsuarios() {
        List<Usuario> lstUsuario = new ArrayList();
        Connection con = getConexion();
        
        try {
            Statement stms = con.createStatement();            
            ResultSet rs = stms.executeQuery("{call SIS_LISTAR_USUARIOS}");
            
            while (rs.next()) {
                Usuario objUsuario = new Usuario();
                objUsuario.setNombre(rs.getString("NOMBRE"));
                objUsuario.setApellidoPat(rs.getString("APELLIDOPAT"));
                objUsuario.setApellidoMat(rs.getString("APELLIDOMAT"));
                objUsuario.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                objUsuario.setUsuario(rs.getString("USUARIO"));
                objUsuario.setRol(rs.getString("ROL"));
                lstUsuario.add(objUsuario);
            }
            return lstUsuario;
        } catch (SQLException e) {
            Usuario objUsuario = new Usuario();            
            objUsuario.setNombre("NO DATOS");  
            lstUsuario.add(objUsuario);
            return lstUsuario;
        }        
    }
    
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
