
package Entity;

import java.sql.Timestamp;


public class cronograma {
    private int id;
    private String tipo;
    private Timestamp fecha;
    private String descripcion;
    private Timestamp programar_alarma;
    private int id_admin;

    public cronograma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Timestamp getProgramar_alarma() {
        return programar_alarma;
    }

    public void setProgramar_alarma(Timestamp programar_alarma) {
        this.programar_alarma = programar_alarma;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    
    
    
}
