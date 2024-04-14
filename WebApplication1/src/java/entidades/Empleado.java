package entidades;

public class Empleado {

    private String idEmpleado, nombreEmp, apellidoEmp, dniEmp, idRol;

    public Empleado(String idEmpleado, String nombreEmp, String apellidoEmp, String dniEmp, String idRol) {
        this.idEmpleado = idEmpleado;
        this.nombreEmp = nombreEmp;
        this.apellidoEmp = apellidoEmp;
        this.dniEmp = dniEmp;
        this.idRol = idRol;
    }

    public Empleado() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getApellidoEmp() {
        return apellidoEmp;
    }

    public void setApellidoEmp(String apellidoEmp) {
        this.apellidoEmp = apellidoEmp;
    }

    public String getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
    }

}
