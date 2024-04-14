package entidades;

public class Cliente {

    private int idCliente;
    private String nombreCli, apellidoCli, dniCli;

    public Cliente(int idCliente, String nombreCli, String apellidoCli, String dniCli) {
        this.idCliente = idCliente;
        this.nombreCli = nombreCli;
        this.apellidoCli = apellidoCli;
        this.dniCli = dniCli;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public String getDniCli() {
        return dniCli;
    }

    public void setDniCli(String dniCli) {
        this.dniCli = dniCli;
    }

}
