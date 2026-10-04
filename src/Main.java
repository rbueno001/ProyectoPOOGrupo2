import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Objeto artista
        Artista artista1 = new Artista("Bad Bunny", "Solista");

        // Objeto album
        Album album1 = new Album("Un Verano Sin Ti", "imagen");

        // Objeto cancion
        Cancion cancion1 = new Cancion("Titi Me Pregunto", "Reggaeton", artista1, "Bad Bunny",
                "2022-05-06", album1, 4.5, 1.99);

        // Objeto usuario
        Usuario usuario1 = new Usuario("Ana Mora Solis", "2000-05-10", "Costa Rica", "112345678",
                "imagen", "anamora@gmail.com", "anamora", "Anapassword");

        // Objetos listas de reproduccion (canciones es un String por ahora)
        listaReproduccion lista1 = new listaReproduccion(
                cancion1.getTitulo() + ", ", "2026-10-01", "Para entrenar", 4.4);

        // Mostrar los objetos en consola
        System.out.println(usuario1);
        System.out.println("\n" + artista1);
        System.out.println("\n" + album1);
        System.out.println("\n" + cancion1);
        System.out.println("\n" + lista1);

    }
}