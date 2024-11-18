package co.edu.uniquindio.poo.model;

/*
* Clase admnistrador
 */
public class Administrador extends Persona {

    /*
    * Atributos de la clase
     */
    public String idEmpleado, credencialInicioSeccion;
    public boolean activo;

    /**
     * Constructor con lo atributos de la clase padre y propios
     *
     * @param nombre
     * @param apellido
     * @param cedula
     * @param correo
     * @param telefono
     * @param idEmpleado
     * @param credencialInicioSeccion
     * @param activo
     */
    public Administrador(String nombre, String apellido, String cedula, String correo, String telefono,
            String idEmpleado, String credencialInicioSeccion, boolean activo) {
        super(nombre, apellido, cedula, correo, telefono);
        this.idEmpleado = idEmpleado;
        this.credencialInicioSeccion = credencialInicioSeccion;
        this.activo = activo;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public String getCredencialInicioSeccion() {
        return credencialInicioSeccion;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setCredencialInicioSeccion(String credencialInicioSeccion) {
        this.credencialInicioSeccion = credencialInicioSeccion;
    }

    /*Get
    * Metodo para obtener un dato
     */
    public boolean isActivo() {
        return activo;
    }

    /*Set
    * Metodo para modificar un dato
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /*
     * Constructor con el toString
     */
    @Override
    public String toString() {
        return "Administrador [idEmpleado=" + idEmpleado + ", credencialInicioSeccion=" + credencialInicioSeccion
                + ", toString()=" + super.toString() + "]";
    }

    /*
     * Metodo para agregar
     */
    public void remove(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /*
     * Metodo para eliminar
     */
    public void add(Administrador administrador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
