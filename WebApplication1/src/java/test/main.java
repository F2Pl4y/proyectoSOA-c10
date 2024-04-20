package test;

import dao.ArticuloDAO;
import dao.impl.ArticuloDAOImpl;
import java.sql.SQLException;
import util.Conexion;

public class main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        ArticuloDAO articuloDao = new ArticuloDAOImpl();
//        System.out.println(articuloDao.buscaArticulo(1));
//        System.out.println(articuloDao.getMensaje());
        System.out.println("conexion:" + Conexion.conectar());
    }

}
