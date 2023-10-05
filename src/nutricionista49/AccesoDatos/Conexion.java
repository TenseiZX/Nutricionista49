
package nutricionista49.AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL = "jdbc:mariadb://localhost/"; //cambiar por nombre de la base de datos
    private static final String DB = "nutricionista49";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    //singleton crea una unica conexion con la base de datos
    private static Connection conexion;  //clase Conexion,variable conexion

    private Conexion() {}    //>>>>>>>>> cambiar a privada si se quiere volver al default

    public static Connection getConexion() {
        if (conexion == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "CONECTADO");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Clase Conexion= error a cargar el Driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion");
            }

        }
        return conexion;
    }
    
}
