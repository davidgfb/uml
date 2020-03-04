/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros.modelo;

/**
 *
 * @author JoseR
 */
public class Usuario {

    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario;

    public Usuario() {
        nombreUsuario="";
        contrasena="";
        tipoUsuario="";
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

 
    public void obtenerTipoUsuarioDeBBDD (){
        tipoUsuario="Empleado confianza";
        
    }
    

}
