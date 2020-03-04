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
public class Cliente {
    
    private String dni;
    private String nombreCliente;
    private String primerApellidoCliente;
    private String segundoApellidoCliente;
    private String calleCliente;
    private String municipioCliente;
    private String provinciaCliente;
    private String codigoPostalClilente;
    private String tipoCliente; //Básico, Habitual o VIP

    public Cliente(String dni, String nombreCliente, String primerApellidoCliente, String segundoApellidoCliente, String calleCliente, String municipioCliente, String provinciaCliente, String codigoPostalClilente) {
        this.dni = dni;
        this.nombreCliente = nombreCliente;
        this.primerApellidoCliente = primerApellidoCliente;
        this.segundoApellidoCliente = segundoApellidoCliente;
        this.calleCliente = calleCliente;
        this.municipioCliente = municipioCliente;
        this.provinciaCliente = provinciaCliente;
        this.codigoPostalClilente = codigoPostalClilente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPrimerApellidoCliente() {
        return primerApellidoCliente;
    }

    public void setPrimerApellidoCliente(String primerApellidoCliente) {
        this.primerApellidoCliente = primerApellidoCliente;
    }

    public String getSegundoApellidoCliente() {
        return segundoApellidoCliente;
    }

    public void setSegundoApellidoCliente(String segundoApellidoCliente) {
        this.segundoApellidoCliente = segundoApellidoCliente;
    }

    public String getCalleCliente() {
        return calleCliente;
    }

    public void setCalleCliente(String calleCliente) {
        this.calleCliente = calleCliente;
    }

    public String getMunicipioCliente() {
        return municipioCliente;
    }

    public void setMunicipioCliente(String municipioCliente) {
        this.municipioCliente = municipioCliente;
    }

    public String getProvinciaCliente() {
        return provinciaCliente;
    }

    public void setProvinciaCliente(String provinciaCliente) {
        this.provinciaCliente = provinciaCliente;
    }

    public String getCodigoPostalClilente() {
        return codigoPostalClilente;
    }

    public void setCodigoPostalClilente(String codigoPostalClilente) {
        this.codigoPostalClilente = codigoPostalClilente;
    }
    
    



    public Cliente(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
    
    public void guardarClienteEnBBDD(){
        
    }
    
}
