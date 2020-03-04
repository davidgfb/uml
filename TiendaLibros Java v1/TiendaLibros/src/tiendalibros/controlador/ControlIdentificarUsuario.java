/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendalibros.controlador;

import gestionusuarios.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import tiendalibros.modelo.Usuario;
import tiendalibros.vista.VistaIdentificarUsuario;
import tiendalibros.vista.VistaMenuPrincipal;

/**
 *
 * @author JoseR
 */

public class ControlIdentificarUsuario implements ActionListener {

    Usuario usuario;
    VistaIdentificarUsuario vistaIdentificarUsuario;
    VistaMenuPrincipal vistaMenuPrincipal;

    public ControlIdentificarUsuario(VistaIdentificarUsuario v
    ) {
        this.vistaIdentificarUsuario = v;
    }
    
     public void actionPerformed(ActionEvent evento) {
         
         vistaMenuPrincipal = new VistaMenuPrincipal ();
         usuario = new Usuario();
         
        usuario.setNombreUsuario(vistaIdentificarUsuario.leerNombreUsuario());
        usuario.setContrasena(vistaIdentificarUsuario.leerContrasena());
        usuario.obtenerTipoUsuarioDeBBDD();
        String tipo = usuario.getTipoUsuario();
        
        if ((tipo=="Responsable") || (tipo=="Empleado confianza")) {vistaMenuPrincipal.setVisible(true);}
        
        else if (tipo=="Empleado") {
            // Ocultar el botón de dar de alat cliente
            
              vistaMenuPrincipal.ocultarAltaCliente();
              vistaMenuPrincipal.setVisible(true);
        } else {
            vistaIdentificarUsuario.mostrarError();
//             JOptionPane.showMessageDialog( null, "Acceso no permitido" );
        };
    }

}
