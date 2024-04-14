package entidades;

public class Articulo {

    private String idArticulo, nombreArt;
    private double precio;
    private int stock;

    public Articulo(String idArticulo, String nombreArt, double precio, int stock) {
        this.idArticulo = idArticulo;
        this.nombreArt = nombreArt;
        this.precio = precio;
        this.stock = stock;
    }

    public Articulo() {
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
