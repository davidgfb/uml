/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tiendalibros.modelo.Pedido;
import tiendalibros.vista.VistaBorrarPedido;

/**
 *
 * @author JoseR
 */
public class ControlBorrarPedido implements ActionListener {

    Pedido pedido;
    VistaBorrarPedido vistaBorrarPedido;

    public ControlBorrarPedido(VistaBorrarPedido v) {
        vistaBorrarPedido = v;
    }

    public void actionPerformed(ActionEvent evento) {
        pedido = new Pedido();
        String codigoPedido = vistaBorrarPedido.leerCodigoPedido();
        String resultado;
        if (pedido.borrarPedido(codigoPedido)) {
            resultado = "Borrado con éxito";
        } else {
            resultado = "No se ha podido borrar";
        };
        vistaBorrarPedido.escribirResultado(resultado);
    }

}
