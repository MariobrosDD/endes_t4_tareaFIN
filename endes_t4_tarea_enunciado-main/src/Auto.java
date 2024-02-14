/**
 * Representa un coche particular con su marca y modelo.
 *
 * @author Mario
 * @version 10/02/2024
 */
public class Auto {

    /**
     * La marca del coche.
     */
    private String marca;

    /**
     * El modelo del coche.
     */
    private String modelo;

    /**
     * Crea un nuevo coche con la marca y modelo especificados.
     *
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Obtiene la marca del coche.
     *
     * @return La marca del coche.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del coche.
     *
     * @param marca La nueva marca del coche.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo del coche.
     *
     * @return El modelo del coche.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del coche.
     *
     * @param modelo El nuevo modelo del coche.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Devuelve una representación String del coche con su marca y modelo.
     *
     * @return Una cadena con la marca y modelo del coche.
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
