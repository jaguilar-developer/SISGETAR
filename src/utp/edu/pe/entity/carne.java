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
public class carne {
    
    Integer idPasajero;
    Integer idTarjeta;
    Integer nroCarne;
    Date fechaRegistro;
    Date fechaVigente;
    Boolean estado;

    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public Integer getNroCarne() {
        return nroCarne;
    }

    public void setNroCarne(Integer nroCarne) {
        this.nroCarne = nroCarne;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaVigente() {
        return fechaVigente;
    }

    public void setFechaVigente(Date fechaVigente) {
        this.fechaVigente = fechaVigente;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    Double saldo;
    String descripcion;
    
}
