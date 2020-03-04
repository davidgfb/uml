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
public class DetalleLibroPedido {
    
    private Libro libro;
    private int ejemplaresLibroEnPedido;
    
    public DetalleLibroPedido(Libro libro, int ejemplaresLibroEnPedido) {
        this.libro = libro;
        this.ejemplaresLibroEnPedido = ejemplaresLibroEnPedido;
    }    

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getEjemplaresLibroEnPedido() {
        return ejemplaresLibroEnPedido;
    }

    public void setEjemplaresLibroEnPedido(int ejemplaresLibroEnPedido) {
        this.ejemplaresLibroEnPedido = ejemplaresLibroEnPedido;
    }
    
    
}
