
package Model;

import Entity.usuario;
import conexion.conexiondbagenda;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class modeloUsuario {
    private final conexiondbagenda con;

    public modeloUsuario() {
        con=new conexiondbagenda();
    }
    
    
    public boolean crearAdmin(usuario u){
    
    int resultado=0;
    String sql= "INSERT INTO `usuario`(`id_usuario`, `name`, `pass`) VALUES (?,?,?)";
   
        try {
            PreparedStatement ps=con.getConnection().prepareStatement(sql);
        
        } catch (SQLException ex) {
            Logger.getLogger(modeloUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return resultado>0;
    
    }
}
