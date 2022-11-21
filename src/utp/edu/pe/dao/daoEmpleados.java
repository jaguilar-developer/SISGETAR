/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import utp.edu.pe.entity.Empleado;
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
    
    public List<Empleado> listarEmpleados(){        
        
        List<Empleado> lstEmpleados = new ArrayList();
        Connection con = getConexion();
        
        try {
            Statement stms = con.createStatement();
            ResultSet rs = stms.executeQuery("{call SIS_LISTAR_EMPLEADOS}");

            while (rs.next()) {
                Empleado empleado = new Empleado();
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
            Empleado empleado = new Empleado();
            empleado.setNombre("NO DATA");
            empleado.setApellidoPat("");
            empleado.setApellidoMat("");
            empleado.setNumeroDocumento("");
            empleado.setNroTelefono1("");
            empleado.setCargo("");
            return lstEmpleados;
        }
    }
    
}
