package tareasis2;

import java.sql.Date;


public class Estudiante {
    private final int cod_sis;
    private String nombres;
    private String apellidos;
    private String carrera;
    private int ci;
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

    
}
