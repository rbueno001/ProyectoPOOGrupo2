public class listaReproduccion {

    // Atributos
    private String canciones;
    private String fechaCreacion;
    private String nombre;
    private double calificacion;

    // Constructor
    public listaReproduccion(String canciones, String fechaCreacion, String nombre, double calificacion) {
        this.canciones = canciones;
        this.fechaCreacion = fechaCreacion;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Getters
    public String getCanciones() {
        return canciones;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Setters
    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // toString()
    public String toString() {
        return "Lista de reproduccion: " + nombre + "\nCanciones: " + canciones + "\nFecha de creacion: "
                + fechaCreacion +
                "\nCalificacion: " + calificacion;
    }

}
