/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros;

import tiendalibros.controlador.ControlIdentificarUsuario;
import tiendalibros.modelo.Usuario;
import tiendalibros.vista.VistaIdentificarUsuario;

public class Main {

    // Variables para patrón MVC
    static VistaIdentificarUsuario vistaIdentificarUsuario;
    static ControlIdentificarUsuario controlIdentificarUsuario;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                vistaIdentificarUsuario = new VistaIdentificarUsuario();
                controlIdentificarUsuario = new ControlIdentificarUsuario(vistaIdentificarUsuario);
                
                vistaIdentificarUsuario.asignarControlador(controlIdentificarUsuario);
                vistaIdentificarUsuario.arranca();

            }
        });
    }

}
