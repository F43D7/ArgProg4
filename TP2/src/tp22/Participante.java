
package tp22;

/**
 *
 * @author Fredy
 */
public class Participante {
    
    //Declaraciones
    private int idParticipante;
    private String nombre;
    private Pronostico[] pronosticos;
    private int puntaje;
    
    
    //Constructores

    public Participante(int idParticipante, Pronostico[] pronosticos, int puntaje) {
        this.idParticipante = idParticipante;
        this.pronosticos = pronosticos;
        this.puntaje = puntaje;
    }

    public Participante() {
    }

    public int getIdParticipante() {
        return idParticipante;
    }

    public void setIdParticipante(int idParticipante) {    
        this.idParticipante = idParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(Pronostico[] pronosticos) {
        this.pronosticos = pronosticos;
    }

    public int getPuntaje() {
        return puntaje;
    }

    //Getter and Setter
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //toString

    @Override
    public String toString() {
        return "Participante{" + "idParticipante=" + idParticipante + ", nombre=" + nombre + ", pronosticos=" + pronosticos + ", puntaje=" + puntaje + '}';
    }

    }
    

