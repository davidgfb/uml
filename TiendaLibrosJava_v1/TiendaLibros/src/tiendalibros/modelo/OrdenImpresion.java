/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros.modelo;

import java.awt.List;

/**
 *
 * @author JoseR
 */
public class OrdenImpresion {
    
    private String codigoOrden;
    private Libro libro;
    private int ejemplaresLibroEnOrden;

    public OrdenImpresion(Libro libro, int ejemplaresLibroEnOrden) {
        this.libro = libro;
        this.ejemplaresLibroEnOrden = ejemplaresLibroEnOrden;
        // El código se genera automáticamente
    }


    public void enviarOrden(){
        
    }
    
    public void guardarOrdenEnBBDD(){
    
}
    
}
