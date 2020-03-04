
package tiendalibros.modelo;

import java.util.Date;
import com.mongodb.MongoClientException;

public class Pedido {
    
    	private String codigoPedido;
	private String estadoPedido;
	private String fechaPedido;
	private FacturaVenta facturaVenta;
	private Cliente cliente;
        private DetalleLibroPedido detallesLibros[];

	public Pedido(){

	}

    public void leerPedidoDeBBDD(String codigoPedido) {
        this.codigoPedido = codigoPedido;
        //Acceder a la BBDD conel código y leer el resto de atributos
        //Ejemplo
        this.estadoPedido = "Pendiente";
        this.fechaPedido="10-10-2018";
        this.cliente = new Cliente ("12345678A");
        
        
    }
        
  public void guardarPedidoEnBBDD (){
      
  }     


    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public FacturaVenta getFacturaVenta() {
        return facturaVenta;
    }

    public void setFacturaVenta(FacturaVenta facturaVenta) {
        this.facturaVenta = facturaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DetalleLibroPedido[] getDetallesLibros() {
        return detallesLibros;
    }

    public void setDetallesLibros(DetalleLibroPedido[] detallesLibros) {
        this.detallesLibros = detallesLibros;
    }


        
        public boolean borrarPedido (String codigoPedido) {
            
            MongoClientException mongoClient = new MongoClientException("prueba");
            
            return false;
            
        
        }
        
        public void generarFacturaDePedido (){
            
        }
        
    
}
