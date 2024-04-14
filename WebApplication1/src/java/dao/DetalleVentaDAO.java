
package dao;

import entidades.DetalleVenta;

public interface DetalleVentaDAO {
    
    boolean registrar(DetalleVenta detalleVenta);
    String getMensaje();
    
}
