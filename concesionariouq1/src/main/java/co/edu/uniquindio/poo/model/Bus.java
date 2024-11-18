package co.edu.uniquindio.poo.model;

/*
* Clase bus
 */
public class Bus extends Vehiculo implements IVehiculoCombustible {

    /*
    * Atributos de la clase
     */
    public int pasajeros, puertas, bolsaAire, ejes, capacidadMaletero, dias, salidasDeEmergencia;
    public boolean aireAcondicionado, camaraReversa, siAbs;
    public static int COSTO_ALQUILER = 80000;

    /**
     * Constructor con los atributos de la clase padre y propios
     *
     * @param aireAcondicionado
     * @param bolsaAire
     * @param camaraReversa
     * @param capacidadMaletero
     * @param dias
     * @param ejes
     * @param pasajeros
     * @param puertas
     * @param salidasDeEmergencia
     * @param siAbs
     * @param cajaCambio
     * @param cilindraje
     * @param marca
     * @param matricula
     * @param modelo
     * @param nuevo
     * @param velocidadMaxima
     */
    public Bus(boolean aireAcondicionado, int bolsaAire, boolean camaraReversa, int capacidadMaletero, int dias, int ejes, int pasajeros, int puertas, int salidasDeEmergencia, boolean siAbs, int cajaCambio, int cilindraje, String marca, String matricula, String modelo, boolean nuevo, int velocidadMaxima) {
        super(cajaCambio, cilindraje, marca, matricula, modelo, nuevo, velocidadMaxima);
        this.aireAcondicionado = aireAcondicionado;
        this.bolsaAire = bolsaAire;
        this.camaraReversa = camaraReversa;
        this.capacidadMaletero = capacidadMaletero;
        this.dias = dias;
        this.ejes = ejes;
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.salidasDeEmergencia = salidasDeEmergencia;
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
    public int getEjes() {
        return ejes;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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
    public int getSalidasDeEmergencia() {
        return salidasDeEmergencia;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setSalidasDeEmergencia(int salidasDeEmergencia) {
        this.salidasDeEmergencia = salidasDeEmergencia;
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
    * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Bus [velocidadMaxima=" + velocidadMaxima + ", cilindraje=" + cilindraje + ", cajaCambio=" + cajaCambio
                + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", nuevo=" + nuevo
                + ", pasajeros=" + pasajeros + ", puertas=" + puertas + ", bolsaAire=" + bolsaAire + ", ejes=" + ejes
                + ", capacidadMaletero=" + capacidadMaletero + ", dias=" + dias + ", salidasDeEmergencia="
                + salidasDeEmergencia + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", siAbs=" + siAbs + "]";
    }

    /*
     * Metodo para andar
     */
    @Override
    public void andar() {
        System.out.println("Bus Andando...");
    }

    /*
     * Metodo para apagar
     */
    @Override
    public void apagar() {
        System.out.println("Bus Apagado...");
    }

    /*
     * Metood para encender
     */
    @Override
    public void encender() {
        System.out.println("Bus Encendido...");
    }

    /*
    * Metodo de imformacion
     */
    public void informacion() {
        System.out.println("Tiene capacidad de 27 galones");
    }

    /*
     * Metodo para agregar
     */
    public void add(Bus bus) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void remove(Bus bus) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
    * Metodo para calcular costo de alquiler
     */
    public int calcularCosto(int COSTO_ALQUILER, int dias) {
        int costo = 0;
        costo = COSTO_ALQUILER * dias;
        return costo;

    }

}
