
package tp22;

/**
 *
 * @author Fredy
 */
public class tp22 {
     public static PronosticoDeportivo PRODE;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PRODE = new PronosticoDeportivo();
        PRODE.cargarEquipos();   
        System.out.println ("=== EQUIPOS ===");
        System.out.println (PRODE.listarEquipos());
        
        System.out.println("*".repeat(40));

        PRODE.cargarParticipantes();   
        System.out.println ("=== PARTICIPANTES ===");
        System.out.println (PRODE.listarParticipantes());
        
        System.out.println("*".repeat(40));

        PRODE.cargarPartidos();   
        System.out.println ("=== PARTIDOS ===");
        System.out.println (PRODE.listarPartidos());
        
        System.out.println("*".repeat(40));

        PRODE.cargarPronosticos();   
        System.out.println ("=== PRONOSTICO ===");
        System.out.println (PRODE.listarPronosticos());
        
    }
    
}
