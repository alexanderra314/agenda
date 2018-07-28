
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
            ps.setInt(1, u.getId());
            ps.setString(2,u.getName() );
            ps.setString(3, u.getPass());
            resultado=ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("No es inserto los datos"+ex);
        }
    
    return resultado>0;
    
    }
    
    
}


