package tareasis2.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tareasis2.Fecha;
import tareasis2.GenerarCodigos;
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
   public boolean habilitar(Connection conexion, int cod_sis, int ci, String carrera) throws SQLException {
      boolean habilitado = false;
      Estudiante est = null;
      Fecha f = null;
      String carer;
      int carnet;
      
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT cod_sis, ci, carrera, fechaNacimiento, nombres, apellidos FROM " + this.tabla + " WHERE cod_sis = ?" );
         consulta.setInt(1, cod_sis);
         ResultSet resultado = consulta.executeQuery();
         if(resultado.next()){
             Date d = resultado.getDate("fechaNacimiento");
            f = new Fecha(d.getDay(), d.getMonth(), d.getYear());
            carer = resultado.getString("carrera");
            carnet = resultado.getInt("ci");
            System.out.println(resultado.getString("ci"));
            System.out.println(resultado.getString("carrera"));
         }
        
         
         //GenerarCodigos generador = new GenerarCodigos();
         //generador.getListaCodigos(Fecha fecha_naci, nombre, apellidos);
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return habilitado;
   }
}
