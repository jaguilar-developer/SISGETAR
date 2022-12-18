/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.dao;

import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utp.edu.pe.entity.Carne;
import utp.edu.pe.entity.Historial;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class daoCarnes extends dataSource{
    
    public String registrarSiniestro(Carne objCarne, Historial objHistorial) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_REGISTRAR_SINIESTRO(?,?,?,?,?,?)}");
            cstmt.setInt("NROCARNE", objCarne.getNroCarne());
            cstmt.setInt("IDTARJETA", objCarne.getIdTarjeta());
            cstmt.setNString("MOTIVO", objHistorial.getMotivo());
            cstmt.setFloat("SALDOACTUAL", objHistorial.getSaldoActual());
            cstmt.setNString("DESCRIPCION", objHistorial.getDescripcion());
            
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
        
    }
    
    public Float recuperarSaldoSiniestro(String nroDocumento, int idTarjeta) {
       Connection con = getConexion();
       Float saldo = Float.valueOf("0");
       
        try {
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_RESTAURAR_SALDO(?,?,?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);
            cstmt.setInt("IDTARJETA", idTarjeta);            
            cstmt.registerOutParameter("ULTIMOSALDO", java.sql.Types.FLOAT);
            cstmt.execute();
            
            saldo = cstmt.getFloat("ULTIMOSALDO");
            return saldo;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return saldo;
        }
    }    
    
    public String crearCarne(Carne objCarne) {
        Connection con = getConexion();
        String codRespuesta;
        
        try {
            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_CREAR_CARNE(?,?,?,?,?)}");
            cstmt.setInt("NROCARNE", objCarne.getNroCarne());
            cstmt.setNString("NRODOCUMENTO", objCarne.getNumeroDocumento());
            cstmt.setInt("IDTARJETA", objCarne.getIdTarjeta());
            cstmt.setFloat("SALDO", objCarne.getSaldo());
            cstmt.registerOutParameter("CODRESPUESTA", java.sql.Types.VARCHAR);            
            cstmt.execute();
            codRespuesta = cstmt.getString("CODRESPUESTA");
            
        } catch (SQLException e) {
            codRespuesta = e.getMessage();
        }        
        
        return codRespuesta;
    }
    
    
    public int generarCarne() {        
        Connection con = getConexion();
        int nroCarne = 0;
        try {
            Statement stmt = con.createStatement();
            String SQL = "SELECT dbo.F_MAX_NUM_CARNE() NROCARNE";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                nroCarne = rs.getInt("NROCARNE");
            }            
            return nroCarne;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 1;
        }        
    }
    
    public Carne buscarCarne(int nroCarne) {        
        Carne objCarne = new Carne();                
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_CARNE(?)}");
            cstmt.setInt("NROCARNE", nroCarne);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                objCarne.setNroCarne(rs.getInt("NROCARNE"));
                objCarne.setSaldo(rs.getFloat("SALDO"));                
                objCarne.setDescripcion(rs.getString("DESCRIPCION"));
                objCarne.setIdTarjeta(rs.getInt("IDTARJETA"));
                objCarne.setDescripcionTarjeta(rs.getString("SERVICIO"));
            }            
            return objCarne;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
            objCarne.setDescripcionTarjeta("NO DATA");            
            return objCarne;
        }
    }
    
    public List<Carne> buscarCarnesXnroDocumento(String nroDocumento) {        
        List<Carne> lstCarnes = new ArrayList();
        Connection con = getConexion();
        
        try {            
            CallableStatement cstmt = con.prepareCall("{call dbo.SIS_BUSCAR_CARNES_X_NRODOC(?)}");
            cstmt.setNString("NUMERODOCUMENTO", nroDocumento);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()) {
                Carne objCarne = new Carne();                
                objCarne.setNumeroDocumento(rs.getString("NUMERODOCUMENTO"));
                objCarne.setPasajero(rs.getString("PASAJERO"));
                objCarne.setDescripcionTarjeta(rs.getString("DESCRIPCION"));
                objCarne.setNroCarne(rs.getInt("NROCARNE"));
                objCarne.setSaldo(rs.getFloat("SALDO"));
                objCarne.setEstado(rs.getString("ESTADO_CARNE"));
                lstCarnes.add(objCarne);
            }            
            return lstCarnes;
            
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());            
            Carne objCarne = new Carne();  
            objCarne.setDescripcionTarjeta("NO DATA");
            lstCarnes.add(objCarne);            
            return lstCarnes;
        }
    }
    
}
