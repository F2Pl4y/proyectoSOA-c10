package entidades;

import java.util.Date;

public class Movimiento {

    private String idMovimiento, idTipoMovimiento, nomOpMovimiento;
    private double costoUnitario;
    private int cantidad;
    private Date fechaMovimiento;

    public Movimiento(String idMovimiento, String idTipoMovimiento, String nomOpMovimiento, double costoUnitario, int cantidad, Date fechaMovimiento) {
        this.idMovimiento = idMovimiento;
        this.idTipoMovimiento = idTipoMovimiento;
        this.nomOpMovimiento = nomOpMovimiento;
        this.costoUnitario = costoUnitario;
        this.cantidad = cantidad;
        this.fechaMovimiento = fechaMovimiento;
    }

    public Movimiento() {
    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(String idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public String getNomOpMovimiento() {
        return nomOpMovimiento;
    }

    public void setNomOpMovimiento(String nomOpMovimiento) {
        this.nomOpMovimiento = nomOpMovimiento;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

}
