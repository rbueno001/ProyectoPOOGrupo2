public class Artista {

    private String nombre;
    private String tipo; // Tipo de artista (solista o banda)

    // Constructor
    public Artista(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // toString()
    public String toString() {
        return "Artista: " + nombre + "\nTipo: " + tipo;
    }

}
