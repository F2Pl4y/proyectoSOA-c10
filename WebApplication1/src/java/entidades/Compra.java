package entidades;

import java.util.Date;

public class Compra {

    private String idCompra, dniCli, dniEmp;
    private Date fechaCompra;

    public Compra(String idCompra, String dniCli, String dniEmp, Date fechaCompra) {
        this.idCompra = idCompra;
        this.dniCli = dniCli;
        this.dniEmp = dniEmp;
        this.fechaCompra = fechaCompra;
    }

    public Compra() {
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

    public String getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

}
