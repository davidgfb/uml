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
public class Libro {
    
    private String isbnLibro;
    private int ejemplaresEnTienda;
    private float precioLibro;
    private String tituloLibro;

    public Libro(String isbnLibro, int ejemplaresEnTienda, float precioLibro, String tituloLibro) {
        this.isbnLibro = isbnLibro;
        this.ejemplaresEnTienda = ejemplaresEnTienda;
        this.precioLibro = precioLibro;
        this.tituloLibro = tituloLibro;
    }

    public int getEjemplaresEnTienda() {
        return ejemplaresEnTienda;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public float getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(float precioLibro) {
        this.precioLibro = precioLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

 
    
    
}
