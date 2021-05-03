package tareasis2.servicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tareasis2.models.Codigo;
import tareasis2.models.Estudiante;

public class CodigoServicios {
   private final String tabla = "codigo";
   public void guardar(Connection conexion, Codigo cod) throws SQLException{
      try{
         PreparedStatement consulta;
         consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(codigo1, codigo2, codigo3, codigo4,codigo5, cod_sis) VALUES(?, ?, ?, ?, ?, ?)");
            consulta.setString(1, cod.getCodigo1());
            consulta.setString(2, cod.getCodigo2());
            consulta.setString(3, cod.getCodigo3());
            consulta.setString(4, cod.getCodigo4());
            consulta.setString(5, cod.getCodigo5());
            consulta.setInt(6, cod.getCod_sis());
            
            consulta.executeUpdate();
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
   }
}