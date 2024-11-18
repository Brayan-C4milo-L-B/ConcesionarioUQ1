package co.edu.uniquindio.poo.model;

/*
    * Clase costo para compras
 */
public class Costo {

    /*
     * Atributos de la clase
     */
    public double costoVehiculo;

    /**
     * Constructor con los atributos de la clase
     *
     * @param costoVehiculo
     */
    public Costo(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

    /*Get
     * Metodo para obter un dato
     */
    public double getCostoVehiculo() {
        return costoVehiculo;
    }

    /*Set
     * Metodo para modificar un dato
     */
    public void setCostoVehiculo(double costoVehiculo) {
        this.costoVehiculo = costoVehiculo;
    }

}
