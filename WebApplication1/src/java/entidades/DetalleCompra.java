package entidades;

public class DetalleCompra {

    private String idDetalleCompra, idCompra, idArticulo;
    private double subTotal;
    private int cantidad;

    public DetalleCompra(String idDetalleCompra, String idCompra, String idArticulo, double subTotal, int cantidad) {
        this.idDetalleCompra = idDetalleCompra;
        this.idCompra = idCompra;
        this.idArticulo = idArticulo;
        this.subTotal = subTotal;
        this.cantidad = cantidad;
    }

    public DetalleCompra() {
    }

    public String getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(String idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
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
