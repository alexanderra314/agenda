
package Model;

import Entity.usuario;
import conexion.conexiondbagenda;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class modeloUsuario {
    private final conexiondbagenda con;

    public modeloUsuario() {
        con=new conexiondbagenda();
    }
    
    
    public boolean selccionAdmin(usuario u){
    
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
    
    public int ingresoadmin(usuario u) {
        int acceso=0;
        int select=0;
        String username;
        String userpass;
        String sql1="SELECT COUNT(*) FROM usuario WHERE name ='"+u.getName()+"'";
        
        String sql2="SELECT name,pass FROM usuario WHERE name ='"+u.getName()+"'";
        try {
            Statement si=con.getConnection().createStatement();
            ResultSet rs=si.executeQuery(sql1);
            
            while (rs.next()) { 
                
                select=rs.getInt(1);
                if (select==1) {
                     try {
                            Statement si1=con.getConnection().createStatement();
                            ResultSet rs1=si1.executeQuery(sql2);
                            while(rs1.next()){
                                username=rs1.getString(1);
                               
                                userpass=rs1.getString(2);
                               
                                    if((username == null ? u.getName() == null : username.equals(u.getName())) && userpass.equals(u.getPass())){
                                        acceso=1;
                                    }else {
                                        System.out.println("El nombre de usuario y la contrasela n conciden");
                                    }      
                            }
                        }catch (SQLException ex) {
                       System.out.println(ex);
                    }
                }else{
                    System.out.println("NOMBRE DE USUARIO NO EXISTE");
                }
            }
        }catch (SQLException ex) {
            System.out.println("nombre de ususario o contraseña incorrecta"+ex);
        }
            System.out.println("accesos permitido"+acceso);
        return acceso;  
    
    }
    
    
}


