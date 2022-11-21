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
public class Recarga {
    
    Integer idRecarga;
    Integer nroRecarga;
    Integer nroCarne;
    Double montoRecarga;

    public Integer getIdRecarga() {
        return idRecarga;
    }

    public void setIdRecarga(Integer idRecarga) {
        this.idRecarga = idRecarga;
    }

    public Integer getNroRecarga() {
        return nroRecarga;
    }

    public void setNroRecarga(Integer nroRecarga) {
        this.nroRecarga = nroRecarga;
    }

    public Integer getNroCarne() {
        return nroCarne;
    }

    public void setNroCarne(Integer nroCarne) {
        this.nroCarne = nroCarne;
    }

    public Double getMontoRecarga() {
        return montoRecarga;
    }

    public void setMontoRecarga(Double montoRecarga) {
        this.montoRecarga = montoRecarga;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    Date fechaRegistro;
    Boolean estado;
    
}
