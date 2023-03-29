
package tp22;

/**
 *
 * @author GRUPO TP JAVA
 */
public class Equipo {
    private int idEquipo;
    private String nombre;
    private String descripcion;
    
    
    //Constructores

    public Equipo(int idEquipo, String nombre) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
    }

    public Equipo() {
        
        
    }
    
    //Shetter and Getter

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Equipo{" + "idEquipo=" + idEquipo + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
    }

    
