
package dao;

import entidades.Cliente;

public interface ClienteDAO {
    
    Cliente buscaCliente(String dni);
    String getMensaje();
    
}
