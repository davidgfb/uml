/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros.controlador;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tiendalibros.modelo.Cliente;
import tiendalibros.vista.VistaAltaCliente;

/**
 *
 * @author JoseR
 */
public class ControlAltaCliente implements ActionListener {

    Cliente cliente;
    VistaAltaCliente vistaAltaCliente;

    public ControlAltaCliente(VistaAltaCliente vistaAltaCliente) {
        this.vistaAltaCliente = vistaAltaCliente;
    }

    public void actionPerformed(ActionEvent evento) {

        cliente = new Cliente(
                vistaAltaCliente.getTextoDNI().getText(),
                vistaAltaCliente.getTextoNombre().getText(),
                vistaAltaCliente.getTextoApellido1().getText(),
                vistaAltaCliente.getTextoApellido2().getText(),
                vistaAltaCliente.getTextoCalle().getText(),
                vistaAltaCliente.getTextoMunicipio().getText(),
                vistaAltaCliente.getTextoProvincia().getText(),
                vistaAltaCliente.getTextoCodPostal().getText()
        );
        
        cliente.guardarClienteEnBBDD();
        
        vistaAltaCliente.escribirResultado("Guardado en la Base de Datos");

    }

}
