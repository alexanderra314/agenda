/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author USUARIO
 */
public interface Configuracion {

//    String DRIVER = "oracle.jdbc.driver.OracleDriver";
//    String CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:xe";
//    String USERNAME = "system";
//    String PASSWORD = "oracle";
    
//    String DRIVER = "com.mysql.jdbc.Driver";
//    String CONNECTION_URL = "jdbc:mysql://localhost/pruebas";
//    String DATA_BASE = "pruebas";
//    String USERNAME = "root";
//    String PASSWORD = "";
    
//    String DRIVER = "org.postgresql.Driver";
//    String DATA_BASE = "postgres";
//    String CONNECTION_URL = "jdbc:postgresql://localhost:5432/"+DATA_BASE;    
//    String USERNAME = "postgres";
//    String PASSWORD = "jaime";
    
    String DRIVER = "org.apache.derby.jdbc.ClientDriver";
    String DATA_BASE = "agenda";
    String CONNECTION_URL = "jdbc:derby://localhost:3600/"+DATA_BASE;    
    String USERNAME = "root";
    String PASSWORD = "";
}

