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
public class FacturaVenta {

    private String numeroFactura;
    private String fechaFactura;
    private float precioFinalVenta;
    private Pedido pedido;

    public FacturaVenta(Pedido pedido) {
        this.pedido = pedido;
        this.numeroFactura = "F0001"; //Ejemplo, habríaque generar un número
        this.fechaFactura = "una fecha";
        this.calcularPrecioVenta();
        this.aplicarPosibleDescuento();
    }

    public void calcularPrecioVenta() {

        //Se recorre el pedido y se accede al precio de cada libro
        //Se suman todos los precios
    }

    public void aplicarPosibleDescuento() {

        if (pedido.getCliente().getTipoCliente() == "Habitual") {
            this.precioFinalVenta *= 0.95f;
        } else if (pedido.getCliente().getTipoCliente() == "VIP") {
            this.precioFinalVenta *= 0.90f;
        }
    }

    public void guardarFacturaVentaEnBBDD (){
        
    }
    
}
