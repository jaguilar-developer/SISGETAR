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
    
    public String crearEmpleado(empleado objEmpleado) {
        Connection con = getConexion();
        String codRespuesta = "";
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_CREAR_EMPLEADO(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setNString("NOMBRE", objEmpleado.getNombre());
            cstmt.setNString("APELLIDOPAT", objEmpleado.getNombre());
            cstmt.setNString("APELLIDOMAT", objEmpleado.getNombre());
            cstmt.setNString("TIPODOCUMENTO", objEmpleado.getNombre());
            cstmt.setNString("NUMERODOCUMENTO", objEmpleado.getNombre());
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
