
package dao.impl;

import dao.ArticuloDAO;
import entidades.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexion;

public class ArticuloDAOImpl implements ArticuloDAO{

    private String mensaje;
    
    @Override
    public Articulo buscaArticulo(int idArticulo) {
        Articulo articulo = null;
        try (Connection conector = Conexion.conectar()){
            StringBuilder sql = new StringBuilder("SELECT idArticulo, nombreArt, ")
                    .append("precio, stock FROM articulo WHERE ")
                    .append("idArticulo = ?");
            try (PreparedStatement pstmt = conector.prepareStatement(sql.toString())){
                pstmt.setInt(1, idArticulo);
                try (ResultSet rs = pstmt.executeQuery()){
                    if(rs.next()){
                        articulo = new Articulo();
                        articulo.setIdArticulo(rs.getInt(1));
                        articulo.setNombreArt(rs.getString(2));
                        articulo.setPrecio(rs.getDouble(3));
                        articulo.setStock(rs.getInt(4));
                    }
                }
            }
            return articulo;
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return articulo;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
    
}
