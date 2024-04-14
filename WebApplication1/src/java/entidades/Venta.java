package entidades;

import java.util.Date;

public class Venta {

    private String idVenta, dniEmp, dniCli;
    private double montoTotal;
    private Date fechaVenta;

    public Venta(String idVenta, String dniEmp, String dniCli, double montoTotal, Date fechaVenta) {
        this.idVenta = idVenta;
        this.dniEmp = dniEmp;
        this.dniCli = dniCli;
        this.montoTotal = montoTotal;
        this.fechaVenta = fechaVenta;
    }

    public Venta() {
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

}
