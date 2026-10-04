public class Cancion {

    private String titulo;
    private String genero;
    private Artista artista;
    private String compositor;
    private String fechaLanzamiento;
    private Album album;
    private double calificacion;
    private double precio;

    // Constructor
    public Cancion(String titulo, String genero, Artista artista, String compositor,
            String fechaLanzamiento, Album album, double calificacion, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.compositor = compositor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.album = album;
        this.calificacion = calificacion;
        this.precio = precio;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public Album getAlbum() {
        return album;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // toString()
    public String toString() {
        return "Cancion: " + titulo + "\nGenero: " + genero + "\nArtista: " + artista.getNombre() +
                "\nCompositor: " + compositor + "\nFecha de lanzamiento: " + fechaLanzamiento +
                "\nAlbum: " + album.getNombre() + "\nCalificacion: " + calificacion + "\nPrecio: " + precio;
    }
}