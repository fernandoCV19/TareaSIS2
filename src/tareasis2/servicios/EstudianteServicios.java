package tareasis2.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import tareasis2.models.Estudiante;

public class EstudianteServicios {
    private final String tabla = "estudiante";
   public void guardar(Connection conexion, Estudiante est) throws SQLException{
      try{
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(cod_sis, nombres, apellidos,"+
                 "carrera, ci, fechaNacimiento, noCertificadoNacimiento, noPasaporte,"+
                 "habilitado, noLicenciaConducir) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, est.getCod_sis());
            consulta.setString(2, est.getNombres());
            consulta.setString(3, est.getApellidos());
            consulta.setString(4, est.getCarrera());
            consulta.setInt(5, est.getCi());
            consulta.setDate(6, est.getFechaNacimiento());
            consulta.setInt(8, est.getNoCertificadoNacimiento());
            consulta.setInt(9, est.getNoPasaporte());
            consulta.setBoolean(10, est.isHabilitado());
            consulta.setInt(11, est.getNoLicenciaConducir());
            
            consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
   
   public boolean habilitar(Connection conexion, int codigoSIS, int ci, String carrera) throws SQLException{
       return true;
   }

    public boolean ingresarSistema(Connection obtener, int codSIS, int dia, int mes, int anio) {
        return true;
    }

    public boolean verificarHabilitado(Connection obtener, int codSIS) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }
}
