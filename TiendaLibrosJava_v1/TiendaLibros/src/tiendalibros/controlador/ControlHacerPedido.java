/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tiendalibros.modelo.Libro;
import tiendalibros.modelo.OrdenImpresion;
import tiendalibros.modelo.FacturaVenta;
import tiendalibros.modelo.Pedido;
import tiendalibros.vista.VistaHacerPedido;

/**
 *
 * @author JoseR
 */
public class ControlHacerPedido implements ActionListener {

    Pedido pedido;
    VistaHacerPedido vistaHacerPedido;

    FacturaVenta facturaVenta;
    OrdenImpresion ordenImpresion;

    public ControlHacerPedido(VistaHacerPedido v) {
        this.vistaHacerPedido = v;
    }

    public void actionPerformed(ActionEvent evento) {
        if ("Recuperar pedido".equals(evento.getActionCommand())) {
            recuperarPedido();
        } else if ("Guardar".equals(evento.getActionCommand())) {
            guardarPedido();
        } else if ("Generar factura".equals(evento.getActionCommand())) {
            FacturaVenta facturaVenta = generarFactura();
            imprimirFactura(facturaVenta);
        } else if ("Generar orden imprenta".equals(evento.getActionCommand())) {
            generarOrdenImprenta();
        }
    }

    public void recuperarPedido() {
        String codigoPedido = vistaHacerPedido.leerCodigoPedido();
        // Se crea un pedido recuperando de la BBDD los datos a partir del código
        pedido = new Pedido();
        pedido.leerPedidoDeBBDD(codigoPedido);
        vistaHacerPedido.escribirDNI(pedido.getCliente().getDni());
        vistaHacerPedido.escribirFechaPedido(pedido.getFechaPedido());
        for (int i = 0; i < pedido.getDetallesLibros().length; i += 1) {
            //Recorrer el detalle del pedido
            vistaHacerPedido.escribirLineaDePedido(pedido.getDetallesLibros()[i].getLibro().getIsbnLibro(), pedido.getDetallesLibros()[i].getEjemplaresLibroEnPedido());
        }

    }

    public void guardarPedido() {
        //Comprobar si hay existencias
        //Si no hay no dejar guardar
        //Si hay se guarda

    }

    public FacturaVenta generarFactura() {
        //Se genera factura en un objeto facturaVenta
        facturaVenta = new FacturaVenta(pedido);
        return facturaVenta;
    }

    public void imprimirFactura(FacturaVenta f){
        // Se imprime la factura recibida
    }
    
    public void generarOrdenImprenta() {
        pedido.setEstadoPedido("Pendiente");

        // Por cada libro de los que falten ejemplares se genera una orden
        //Por ejemplo libro de la línea 2 del pedido
        
        Libro libroAPedir = pedido.getDetallesLibros()[2].getLibro();
        int ejemplaresAPedir = pedido.getDetallesLibros()[2].getEjemplaresLibroEnPedido() - libroAPedir.getEjemplaresEnTienda();

        ordenImpresion = new OrdenImpresion(libroAPedir, ejemplaresAPedir);
        ordenImpresion.enviarOrden();
    }

}
