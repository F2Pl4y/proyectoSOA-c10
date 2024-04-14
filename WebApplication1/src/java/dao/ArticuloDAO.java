
package dao;

import entidades.Articulo;

public interface ArticuloDAO {
    
    Articulo buscaArticulo(int idArticulo);
    String getMensaje();
    
}
