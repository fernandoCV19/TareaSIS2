package tareasis2.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tareasis2.Estudiante;

public class EstudianteServicios {
    private final String tabla = "estudiante";
   public void guardar(Connection conexion, Estudiante est) throws SQLException{
      try{
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(cod_sis, nombres, apellidos,"+
                 "carrera, ci, fechaNacimiento, ciudadNacimiento, noCertificadoNacimiento, noPasaporte,"+
                 "habilitado, noLicenciaConducir) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, est.getCod_sis());
            consulta.setString(2, est.getNombres());
            consulta.setString(3, est.getApellidos());
            consulta.setString(4, est.getCarrera());
            consulta.setInt(5, est.getCi());
            consulta.setDate(6, est.getFechaNacimiento());
            consulta.setString(7, est.getCiudadNacimiento());
            consulta.setInt(8, est.getNoCertificadoNacimiento());
            consulta.setInt(9, est.getNoPasaporte());
            consulta.setBoolean(10, est.isHabilitado());
            consulta.setInt(11, est.getNoLicenciaConducir());
            
            consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
}
