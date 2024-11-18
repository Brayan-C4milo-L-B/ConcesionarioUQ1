package co.edu.uniquindio.poo.model;

/*
* Clase moto
 */
public class Moto extends Vehiculo implements IVehiculoCombustible {

    /*
    * Atributos de la clase
     */
    public int dias;
    public static int COSTO_ALQUILER = 50000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param dias
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Moto(int dias, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.dias = dias;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getDias() {
        return dias;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /*
    * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Moto [velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", cajaCambio=" + cajaCambio
                + ", dias=" + dias + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", nuevo="
                + nuevo + "]";
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Moto Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Moto Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Moto Encendido...");
    }

    /*
     * Metodo para calcular costo de alguier
     */
    public static int calcularCosto(int COSTO_ALQUILER, int dias) {
        int costo = 0;
        costo = COSTO_ALQUILER * dias;
        return costo;
    }

    /*
    * Metodo de imformacion
     */
    public void informacion() {
        System.out.println("Tiene capacidad de 3 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(Moto moto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(Moto moto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
