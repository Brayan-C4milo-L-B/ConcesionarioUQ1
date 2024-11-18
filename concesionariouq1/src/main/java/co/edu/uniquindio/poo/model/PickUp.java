package co.edu.uniquindio.poo.model;

/*
* Clase pickup
 */
public class PickUp extends Vehiculo implements IVehiculoCombustible {

    /*
    * Atributos de la clase
     */
    public int pasajeros, puertas, bolsaAire, dias;
    public boolean aireAcondicionado, camaraReversa, siAbs;
    public static int COSTO_ALQUILER = 75000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param aireAcondicionado
     * @param bolsaAire
     * @param camaraReversa
     * @param dias
     * @param pasajeros
     * @param puertas
     * @param siAbs
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public PickUp(boolean aireAcondicionado, int bolsaAire, boolean camaraReversa, int dias, int pasajeros, int puertas, boolean siAbs, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.aireAcondicionado = aireAcondicionado;
        this.bolsaAire = bolsaAire;
        this.camaraReversa = camaraReversa;
        this.dias = dias;
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.siAbs = siAbs;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getPasajeros() {
        return pasajeros;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getPuertas() {
        return puertas;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getBolsaAire() {
        return bolsaAire;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setBolsaAire(int bolsaAire) {
        this.bolsaAire = bolsaAire;
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

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isSiAbs() {
        return siAbs;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSiAbs(boolean siAbs) {
        this.siAbs = siAbs;
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Pick Up Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Pick Up Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Pick Up Encendido...");
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
        System.out.println("Tiene capacidad de 9 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(PickUp pickUp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(PickUp pickup) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
