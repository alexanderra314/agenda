
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexiondbagenda {
    
    public static final String URL="jdbc:mysql://db4free.net:3306/agenda154?autoReconnect=true&useSSL=false";
    public static final String USERNAME="admin154";
    public static final String PASSEORD="admin1234";

    public Connection getConnection(){
         Connection con=null;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection(URL,USERNAME,PASSEORD);
             System.out.println("CONEXION EXITOSA");
        } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null,"NO HAY CONEXION CON LA BASE DE DATOS");
        }
         return con;
    }
}


