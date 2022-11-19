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
public class pasajes {
    
    Integer idPasaje;
    Integer nroCarne;
    Double montoPasaje;
    Date fechaRegistro;

    public Integer getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(Integer idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Integer getNroCarne() {
        return nroCarne;
    }

    public void setNroCarne(Integer nroCarne) {
        this.nroCarne = nroCarne;
    }

    public Double getMontoPasaje() {
        return montoPasaje;
    }

    public void setMontoPasaje(Double montoPasaje) {
        this.montoPasaje = montoPasaje;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
