package tareasis2;

import java.sql.Date;
import java.sql.SQLException;
import tareasis2.servicios.EstudianteServicios;

public class main {
    public static void main(String [] args) throws SQLException, ClassNotFoundException{
        Conexion.obtener();
        Estudiante est;
        est = new Estudiante (201900520, "Dilan Alejandro", "Antezana Serrano", "Informatica", 9364973,
                new Date(2001, 3, 20), "Cercado", 123, 345, 567, false);
        EstudianteServicios es = new EstudianteServicios();
        es.guardar(Conexion.obtener(), est);
    }
}
