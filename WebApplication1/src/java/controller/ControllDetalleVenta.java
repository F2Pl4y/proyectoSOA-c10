package controller;

import dao.ArticuloDAO;
import dao.impl.ArticuloDAOImpl;
import entidades.Articulo;
import entidades.DetalleVenta;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ControllDetalleVenta", urlPatterns = {"/ControllDetalleVenta"})
public class ControllDetalleVenta extends HttpServlet {

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
        if (accion.equals("AGREGARCARRITO")) {
            Integer cantidad = Integer.valueOf(request.getParameter("txtCantidad"));
            Integer idProducto = Integer.valueOf(request.getParameter("txtIdArtCarrito"));
            HttpSession session = request.getSession();
            List<DetalleVenta> carrito = session.getAttribute("CARRITOVENTA") == null ? new ArrayList<DetalleVenta>() : (List<DetalleVenta>) session.getAttribute("CARRITOVENTA");
            DetalleVenta detalle = new DetalleVenta();
            detalle.setIdArticulo(idProducto);
            detalle.setCantidad(cantidad);
            Articulo articulo = articuloDao.buscaArticulo(idProducto);
            detalle.setSubTotal(articulo.getPrecio() * cantidad);
            carrito.add(detalle);
            session.setAttribute("CARRITOVENTA", carrito);
            session.invalidate();
            request.setAttribute("LISTADETALLEVENTA", carrito);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

}
