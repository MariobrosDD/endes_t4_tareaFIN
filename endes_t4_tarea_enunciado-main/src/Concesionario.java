import java.util.ArrayList;
/**
 * Representa un concesionario de coches, con la capacidad de agregar, listar e imprimir autos.
 *
 * @author Mario
 * @version 10/02/2024
 */
public class Concesionario {

    /**
     * La lista de coches disponibles en el concesionario.
     */
    private ArrayList<Auto> autos;

    /**
     * Crea un nuevo concesionario.
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo coche al concesionario.
     *
     * @param auto El coche a agregar.
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * Devuelve la lista de coches disponibles en el concesionario.
     *
     * @return La lista de coches en el concesionario.
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Imprime la información de cada coche en el concesionario por consola.
     */
    public void imprimirAutos() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }
}
