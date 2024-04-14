
package controller;

import dao.ArticuloDAO;
import dao.impl.ArticuloDAOImpl;
import entidades.Articulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ControlArticulo", urlPatterns = {"/ControlArticulo"})
public class ControlArticulo extends HttpServlet {

    private ArticuloDAO articuloDao;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        articuloDao = new ArticuloDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String accion = request.getParameter("accion");
        if(accion.equals("BUSCAR")){
            String txtIdArticulo = request.getParameter("txtIdArticulo");
            Articulo articulo = this.articuloDao.buscaArticulo(Integer.valueOf(txtIdArticulo));
            request.setAttribute("articulobuscado", articulo);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }


}
