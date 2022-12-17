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
import utp.edu.pe.entity.Pasajero;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoPasajeros extends dataSource{
    
    public Pasajero buscarPasajeroXnroDocumento(String nroDocumento) {
        Pasajero objPasajero = new Pasajero();
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_PASAJEROS_X_NRODOC(?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {                
                objPasajero.setNombre(rs.getString("NOMBRE"));
                objPasajero.setApellidoPat(rs.getString("APELLIDOPAT"));
                objPasajero.setApellidoMat(rs.getString("APELLIDOMAT"));
                objPasajero.setTipoDocumento(rs.getString("TIPODOCUMENTO"));
                objPasajero.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                objPasajero.setNroTelefono1(rs.getString("NROTELEFONO1"));
                objPasajero.setNroTelefono2(rs.getString("NROTELEFONO2"));
                objPasajero.setEmail(rs.getString("EMAIL"));                
                objPasajero.setEstudiante((rs.getInt("ESTUDIANTE")==0)?"NO":"SI");
                //objPasajero.setFechaNacimiento(rs.getDate("FECHANACIMIENTO"));
            }            
            return objPasajero;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());            
            objPasajero.setNombre("NO DATA");            
            return objPasajero;
        }
    }
        
    public List<Pasajero> buscarPasajeros(String valor) {
        List<Pasajero> lstPasajeros = new ArrayList();
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_PASAJEROS(?)}");
            cstmt.setNString("VALOR", valor);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setNombre(rs.getString("NOMBRE"));
                pasajero.setApellidoPat(rs.getString("APELLIDOPAT"));
                pasajero.setApellidoMat(rs.getString("APELLIDOMAT"));
                pasajero.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                pasajero.setNroTelefono1(rs.getString("TELEFONO"));
                pasajero.setEstudiante((rs.getInt("ESTUDIANTE")==0)?"NO":"SI");
                lstPasajeros.add(pasajero);
            }
            
            return lstPasajeros;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            Pasajero pasajero = new Pasajero();
            pasajero.setNombre("NO DATA");
            pasajero.setApellidoPat("");
            pasajero.setApellidoMat("");
            pasajero.setNumeroDocumento("");
            pasajero.setNroTelefono1("");
            pasajero.setEstudiante("");
            return lstPasajeros;
        }
    }
    
    public List<Pasajero> listarPasajeros(){        
        
        List<Pasajero> lstPasajero = new ArrayList();
        Connection con = getConexion();
        
        try {
            Statement stms = con.createStatement();
            ResultSet rs = stms.executeQuery("{call SIS_LISTAR_PASAJEROS}");

            while (rs.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setNombre(rs.getString("NOMBRE"));
                pasajero.setApellidoPat(rs.getString("APELLIDOPAT"));
                pasajero.setApellidoMat(rs.getString("APELLIDOMAT"));
                pasajero.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                pasajero.setNroTelefono1(rs.getString("TELEFONO"));
                pasajero.setEstudiante((rs.getInt("ESTUDIANTE")==0)?"NO":"SI");
                lstPasajero.add(pasajero);
            }
            
            return lstPasajero;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            Pasajero pasajero = new Pasajero();
            pasajero.setNombre("NO DATA");
            pasajero.setApellidoPat("");
            pasajero.setApellidoMat("");
            pasajero.setNumeroDocumento("");
            pasajero.setNroTelefono1("");
            pasajero.setEstudiante("");
            return lstPasajero;
        }
    }
    
     public String eliminarPasajero(String nroDocumento) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_ELIMINAR_PASAJERO(?,?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);            
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
    public String actualizarPasajero(Pasajero objPasajero) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_ACTUALIZAR_PASAJERO(?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setNString("NOMBRE", objPasajero.getNombre());
            cstmt.setNString("APELLIDOPAT", objPasajero.getApellidoPat());
            cstmt.setNString("APELLIDOMAT", objPasajero.getApellidoMat());
            cstmt.setNString("TIPODOCUMENTO", objPasajero.getTipoDocumento());
            cstmt.setNString("NUMERODOCUMENTO", objPasajero.getNumeroDocumento());
            cstmt.setDate("FECHANACIMIENTO", null);
            cstmt.setNString("NROTELEFONO1", objPasajero.getNroTelefono1());
            cstmt.setNString("NROTELEFONO2", objPasajero.getNroTelefono2());
            cstmt.setNString("EMAIL", objPasajero.getEmail());
            cstmt.setInt("ESTUDIANTE", (objPasajero.getEstudiante().equals("SI"))?1:0);
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
    public String crearPasajero(Pasajero objPasajero) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_CREAR_PASAJERO(?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setNString("NOMBRE", objPasajero.getNombre());
            cstmt.setNString("APELLIDOPAT", objPasajero.getApellidoPat());
            cstmt.setNString("APELLIDOMAT", objPasajero.getApellidoMat());
            cstmt.setNString("TIPODOCUMENTO", objPasajero.getTipoDocumento());
            cstmt.setNString("NUMERODOCUMENTO", objPasajero.getNumeroDocumento());
            cstmt.setDate("FECHANACIMIENTO", null);
            cstmt.setNString("NROTELEFONO1", objPasajero.getNroTelefono1());
            cstmt.setNString("NROTELEFONO2", objPasajero.getNroTelefono2());
            cstmt.setNString("EMAIL", objPasajero.getEmail());
            cstmt.setInt("ESTUDIANTE", (objPasajero.getEstudiante().equals("SI"))?1:0);
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
}
