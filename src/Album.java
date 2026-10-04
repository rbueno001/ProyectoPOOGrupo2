public class Album {

    // Atributos
    private String nombre;
    private String caratula;

    // Constructor
    public Album(String nombre, String caratula) {
        this.nombre = nombre;
        this.caratula = caratula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCaratula() {
        return caratula;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    // toString()
    public String toString() {
        return "Album: " + nombre + "\nCaratula: " + caratula;
    }

}
