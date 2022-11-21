/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.entity;

import java.util.Date;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class Persona {
    
    Integer id;
    String nombre;
    String apellidoPat;
    String apellidoMat;
    String tipoDocumento;
    String numeroDocumento;
    Date fechaNacimiento;
    String nroTelefono1;
    String nroTelefono2;
    String email;    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNroTelefono1() {
        return nroTelefono1;
    }

    public void setNroTelefono1(String nroTelefono1) {
        this.nroTelefono1 = nroTelefono1;
    }

    public String getNroTelefono2() {
        return nroTelefono2;
    }

    public void setNroTelefono2(String nroTelefono2) {
        this.nroTelefono2 = nroTelefono2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
