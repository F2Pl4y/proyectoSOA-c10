
package dao.impl;

import dao.VentaDAO;
import entidades.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.Conexion;

public class VentaDAOImpl implements VentaDAO{

    private String mensaje;
    
    @Override
    public boolean registrar(Venta venta) {
        try (Connection conector = Conexion.conectar()){
            StringBuilder sql = new StringBuilder("INSERT INTO venta(")
                    .append("montoTotal, dniEmp, dniCliente) VALUES (")
                    .append("?, ?, ?)");
            try (PreparedStatement pstmt = conector.prepareStatement(sql.toString())){
                pstmt.setDouble(1, venta.getMontoTotal());
                pstmt.setString(2, venta.getDniEmp());
                pstmt.setString(3, venta.getDniCli());
                
                int validador = pstmt.executeUpdate();
                return validador == 1;
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return false;
    }
    
    @Override
    public String getMensaje(){
        return mensaje;
    }
    
}
