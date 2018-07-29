
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexiondbagenda {
    
    public static final String URL="jdbc:mysql://localhost:3306/agenda";
    public static final String USERNAME="root";
    public static final String PASS="";
    private Connection conexion;

    public Connection getConnection(){
        
         try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASS);
            System.out.println("CONEXION EXITOSA");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            System.out.println("revise la libreria");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("revise la conexion");
        }
         return conexion;
    }
}


