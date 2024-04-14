
package dao.impl;

import dao.DetalleVentaDAO;
import entidades.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Conexion;

public class DetalleVentaDAOImpl implements DetalleVentaDAO{

    private String mensaje;
    
    @Override
    public boolean registrar(DetalleVenta detalleVenta) {
        try (Connection conector = Conexion.conectar()){
            StringBuilder sql = new StringBuilder("INSERT INTO detalleventa(")
                    .append("cantidad, subtotalventa, idventa, idarticulo) VALUES (")
                    .append("?, ?, ?, ?)");
            try (PreparedStatement pstmt = conector.prepareStatement(sql.toString())){
                pstmt.setInt(1, detalleVenta.getCantidad());
                pstmt.setDouble(2, detalleVenta.getSubTotal());
                pstmt.setInt(3, detalleVenta.getIdVenta());
                pstmt.setInt(4, detalleVenta.getIdArticulo());
                
                int validador = pstmt.executeUpdate();
                return validador == 1;
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return false;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
    
    
    
}
