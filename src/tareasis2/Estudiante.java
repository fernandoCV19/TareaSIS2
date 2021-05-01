package tareasis2;

import java.sql.Date;


public class Estudiante {
    private final int cod_sis;
    private String nombres;
    private String apellidos;
    private String carrera;
    private final int ci;
    private Date fechaNacimiento;
    private String ciudadNacimiento;
    private int noCertificadoNacimiento;
    private int noPasaporte;
    private int noLicenciaConducir;
    private boolean habilitado;

    public Estudiante(int cod_sis, String nombres, String apellidos, String carrera, int ci, Date fechaNacimiento, String ciudadNacimiento, int noCertificadoNacimiento, int noPasaporte, int noLicenciaConducir, boolean habilitado) {
        this.cod_sis = cod_sis;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.ci = ci;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadNacimiento = ciudadNacimiento;
        this.noCertificadoNacimiento = noCertificadoNacimiento;
        this.noPasaporte = noPasaporte;
        this.noLicenciaConducir = noLicenciaConducir;
        this.habilitado = habilitado;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCiudadNacimiento(String ciudadNacimiento) {
        this.ciudadNacimiento = ciudadNacimiento;
    }

    public void setNoCertificadoNacimiento(int noCertificadoNacimiento) {
        this.noCertificadoNacimiento = noCertificadoNacimiento;
    }

    public void setNoLicenciaConducir(int noLicenciaConducir) {
        this.noLicenciaConducir = noLicenciaConducir;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getCod_sis() {
        return cod_sis;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCi() {
        return ci;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCiudadNacimiento() {
        return ciudadNacimiento;
    }

    public int getNoCertificadoNacimiento() {
        return noCertificadoNacimiento;
    }

    public int getNoPasaporte() {
        return noPasaporte;
    }

    public int getNoLicenciaConducir() {
        return noLicenciaConducir;
    }

    public boolean isHabilitado() {
        return habilitado;
    }
}