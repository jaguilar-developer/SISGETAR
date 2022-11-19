/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.entity;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class pasajero extends persona {
    
    Integer idPasajero;
    Boolean estudiante;
    Boolean estado;

    public Integer getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(Integer idPasajero) {
        this.idPasajero = idPasajero;
    }

    public Boolean getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Boolean estudiante) {
        this.estudiante = estudiante;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
