/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.edu.pe.entity;

/**
 *
 * @author Jerry Aguilar - U21229611
 */
public class Usuario extends Persona {
    
    Integer idUsuario;
    String usuario;
    String password;
    String rol;
    Boolean estado;    

    public Integer getIdUsuario() {
        
        return idUsuario;
        
    }

    public void setIdUsuario(Integer idUsuario) {
        
        this.idUsuario = idUsuario;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
}
