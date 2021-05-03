package tareasis2.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tareasis2.Conexion;
import tareasis2.Fecha;
import tareasis2.GenerarCodigos;
import tareasis2.models.Codigo;
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
   public boolean habilitar(Connection conexion, int cod_sis, int ci, String carrera) throws SQLException, ClassNotFoundException {
      boolean habilitado = false;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT cod_sis, ci, carrera, fechaNacimiento, nombres, apellidos FROM " + this.tabla + " WHERE cod_sis = ?" );
         consulta.setInt(1, cod_sis);
         ResultSet resultado = consulta.executeQuery();
         if(resultado.next()){
             Date d = resultado.getDate("fechaNacimiento");
            //System.out.println(resultado.getString("ci"));
            //System.out.println(resultado.getString("carrera"));
            if(ci == resultado.getInt("ci") && carrera == resultado.getString("carrera")){ 
                habilitado = true;
                GenerarCodigos generador = new GenerarCodigos();
                ArrayList<String> lista = generador.getListaCodigos(new Fecha(d.getDay(), d.getMonth(), d.getYear()), resultado.getString("nombres"), resultado.getString("apellidos"));
                CodigoServicios cod = new CodigoServicios();
                cod.guardar(Conexion.obtener(), new Codigo(lista.get(0),lista.get(1),lista.get(2),lista.get(3),lista.get(4), cod_sis));
                consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET habilitado = ? WHERE id_tarea = ?");
                consulta.setBoolean(1, true);
                consulta.setInt(2,cod_sis);
            }
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return habilitado;
   }
   public boolean ingresarSistema(Connection conexion, int cod_sis,int dia, int mes, int anio) throws SQLException, ClassNotFoundException {
      boolean habilitado = false;
      Date d = new Date(anio-1900, mes, dia );
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT cod_sis, fechaNacimiento, nombres, apellidos FROM " + this.tabla + " WHERE cod_sis = ?" );
         consulta.setInt(1, cod_sis);
         ResultSet resultado = consulta.executeQuery();
         if(resultado.next()){
            if(d.equals(resultado.getDate("fechaNacimiento"))) habilitado = true;  
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return habilitado;
   }
   
   public boolean verificarHabilitado(Connection conexion, int cod_sis) throws SQLException, ClassNotFoundException {
      boolean habilitado = false;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT habilitado, fechaNacimiento, nombres, apellidos FROM " + this.tabla + " WHERE cod_sis = ?" );
         consulta.setInt(1, cod_sis);
         ResultSet resultado = consulta.executeQuery();
         if(resultado.next()){
            if(resultado.getBoolean("habilitado")) habilitado = true;  
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return habilitado;
   } 
  public Codigo getCodigos(Connection conexion, int cod_sis) throws SQLException, ClassNotFoundException {
      Codigo cod = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM " + "codigo" + " WHERE cod_sis = ?" );
         consulta.setInt(1, cod_sis);
         ResultSet resultado = consulta.executeQuery();
         if(resultado.next()){
             cod = new Codigo(resultado.getString("codigo1"),resultado.getString("codigo2"),
                              resultado.getString("codigo3"),resultado.getString("codigo4"),
                              resultado.getString("codigo5"),cod_sis);
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return cod;
   } 
  public boolean setDocumentos(Connection conexion, int cod_sis, int noCertificadoNacimiento, int noPasaporte, int noLicencia) throws SQLException, ClassNotFoundException {
      boolean habilitado = false;
      try{
         PreparedStatement consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET noCertificadoNacimiento = ? , noPasaporte = ?," +
                    "noLicenciaConducir = ? WHERE id_tarea = ?");
         consulta.setInt(1, noCertificadoNacimiento);
         consulta.setInt(2, noPasaporte);
         consulta.setInt(3, noLicencia);
         consulta.setInt(4, cod_sis);
         ResultSet resultado = consulta.executeQuery();
         habilitado = true;  
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return habilitado;
   } 
}
