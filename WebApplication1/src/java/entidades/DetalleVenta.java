package entidades;

public class DetalleVenta {

    private String idDetalleVenta, idVenta, idArticulo;
    private double subTotal;
    private int cantidad;

    public DetalleVenta(String idDetalleVenta, String idVenta, String idArticulo, double subTotal, int cantidad) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idArticulo = idArticulo;
        this.subTotal = subTotal;
        this.cantidad = cantidad;
    }

    public DetalleVenta() {
    }

    public String getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(String idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
