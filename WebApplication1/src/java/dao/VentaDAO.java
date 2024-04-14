
package dao;

import entidades.Venta;


public interface VentaDAO {
    
    boolean registrar(Venta venta);
    String getMensaje();
    
}
