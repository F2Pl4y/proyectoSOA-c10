
package dao.impl;

import dao.ClienteDAO;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexion;

public class ClienteDAOImpl implements ClienteDAO{
    
    private String mensaje;

    @Override
    public Cliente buscaCliente(String dni) {
        Cliente cliente = null;
        try (Connection conector = Conexion.conectar()){
            StringBuilder sql = new StringBuilder("SELECT idCliente, dniCliente, ")
                    .append("nombreCliente, apellidoCliente FROM cliente WHERE ")
                    .append("dniCliente = ?");
            try (PreparedStatement pstmt = conector.prepareStatement(sql.toString())){
                pstmt.setString(1, dni);
                try (ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        cliente = new Cliente();
                        cliente.setIdCliente(rs.getInt(1));
                        cliente.setDniCli(rs.getString(2));
                        cliente.setNombreCli(rs.getString(3));
                        cliente.setApellidoCli(rs.getString(4));
                    }
                }
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return cliente;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
    
}
