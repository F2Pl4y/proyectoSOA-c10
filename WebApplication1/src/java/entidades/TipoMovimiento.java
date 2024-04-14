package entidades;

public class TipoMovimiento {

    private String idTipoMovimiento, nomTipoMovimiento;

    public TipoMovimiento(String idTipoMovimiento, String nomTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
        this.nomTipoMovimiento = nomTipoMovimiento;
    }

    public TipoMovimiento() {
    }

    public String getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(String idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public String getNomTipoMovimiento() {
        return nomTipoMovimiento;
    }

    public void setNomTipoMovimiento(String nomTipoMovimiento) {
        this.nomTipoMovimiento = nomTipoMovimiento;
    }

}
