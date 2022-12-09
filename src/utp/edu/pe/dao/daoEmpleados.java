/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import utp.edu.pe.entity.empleado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoEmpleados extends dataSource{
    
    public empleado buscarEmpleadoXnroDocumento(String nroDocumento) {
        empleado objEmpleado = new empleado();
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_EMPLEADOS_X_NRODOC(?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {                
                objEmpleado.setNombre(rs.getString("NOMBRE"));
                objEmpleado.setApellidoPat(rs.getString("APELLIDOPAT"));
                objEmpleado.setApellidoMat(rs.getString("APELLIDOMAT"));
                objEmpleado.setTipoDocumento(rs.getString("TIPODOCUMENTO"));
                objEmpleado.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                objEmpleado.setNroTelefono1(rs.getString("NROTELEFONO1"));
                objEmpleado.setNroTelefono2(rs.getString("NROTELEFONO2"));
                objEmpleado.setEmail(rs.getString("EMAIL"));                
                objEmpleado.setCargo(rs.getString("CARGO"));
                //objEmpleado.setFechaNacimiento(rs.getDate("FECHANACIMIENTO"));
            }            
            return objEmpleado;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());            
            objEmpleado.setNombre("NO DATA");            
            return objEmpleado;
        }
    }
    
    public List<empleado> buscarEmpleados(String valor) {
        List<empleado> lstEmpleados = new ArrayList();
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_EMPLEADOS(?)}");
            cstmt.setNString("VALOR", valor);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                empleado empleado = new empleado();
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setApellidoPat(rs.getString("APELLIDOPAT"));
                empleado.setApellidoMat(rs.getString("APELLIDOMAT"));
                empleado.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                empleado.setNroTelefono1(rs.getString("TELEFONO"));
                empleado.setCargo(rs.getString("CARGO"));
                lstEmpleados.add(empleado);
            }
            
            return lstEmpleados;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            empleado empleado = new empleado();
            empleado.setNombre("NO DATA");
            empleado.setApellidoPat("");
            empleado.setApellidoMat("");
            empleado.setNumeroDocumento("");
            empleado.setNroTelefono1("");
            empleado.setCargo("");
            return lstEmpleados;
        }
    }
    
    public List<empleado> listarEmpleados(){        
        
        List<empleado> lstEmpleados = new ArrayList();
        Connection con = getConexion();
        
        try {
            Statement stms = con.createStatement();
            ResultSet rs = stms.executeQuery("{call SIS_LISTAR_EMPLEADOS}");

            while (rs.next()) {
                empleado empleado = new empleado();
                empleado.setNombre(rs.getString("NOMBRE"));
                empleado.setApellidoPat(rs.getString("APELLIDOPAT"));
                empleado.setApellidoMat(rs.getString("APELLIDOMAT"));
                empleado.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                empleado.setNroTelefono1(rs.getString("TELEFONO"));
                empleado.setCargo(rs.getString("CARGO"));
                lstEmpleados.add(empleado);
            }
            
            return lstEmpleados;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            empleado empleado = new empleado();
            empleado.setNombre("NO DATA");
            empleado.setApellidoPat("");
            empleado.setApellidoMat("");
            empleado.setNumeroDocumento("");
            empleado.setNroTelefono1("");
            empleado.setCargo("");
            return lstEmpleados;
        }
    }
    
    public String eliminarEmpleado(String nroDocumento) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_ELIMINAR_EMPLEADO(?,?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);            
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
    public String actualizarEmpleado(empleado objEmpleado) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_ACTUALIZAR_EMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setNString("NOMBRE", objEmpleado.getNombre());
            cstmt.setNString("APELLIDOPAT", objEmpleado.getApellidoPat());
            cstmt.setNString("APELLIDOMAT", objEmpleado.getApellidoMat());
            cstmt.setNString("TIPODOCUMENTO", objEmpleado.getTipoDocumento());
            cstmt.setNString("NUMERODOCUMENTO", objEmpleado.getNumeroDocumento());
            cstmt.setDate("FECHANACIMIENTO", null);
            cstmt.setNString("NROTELEFONO1", objEmpleado.getNroTelefono1());
            cstmt.setNString("NROTELEFONO2", objEmpleado.getNroTelefono2());
            cstmt.setNString("EMAIL", objEmpleado.getEmail());
            cstmt.setNString("CARGO", objEmpleado.getCargo());
            cstmt.setFloat("CALIFICACION", 100);
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
    public String crearEmpleado(empleado objEmpleado) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_CREAR_EMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setNString("NOMBRE", objEmpleado.getNombre());
            cstmt.setNString("APELLIDOPAT", objEmpleado.getApellidoPat());
            cstmt.setNString("APELLIDOMAT", objEmpleado.getApellidoMat());
            cstmt.setNString("TIPODOCUMENTO", objEmpleado.getTipoDocumento());
            cstmt.setNString("NUMERODOCUMENTO", objEmpleado.getNumeroDocumento());
            cstmt.setDate("FECHANACIMIENTO", null);
            cstmt.setNString("NROTELEFONO1", objEmpleado.getNroTelefono1());
            cstmt.setNString("NROTELEFONO2", objEmpleado.getNroTelefono2());
            cstmt.setNString("EMAIL", objEmpleado.getEmail());
            cstmt.setNString("CARGO", objEmpleado.getCargo());
            cstmt.setFloat("CALIFICACION", 100);
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
}
