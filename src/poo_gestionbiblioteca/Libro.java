package poo_gestionbiblioteca;

/**
 *
 * @author jhoja
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Por defecto, el libro está disponible.
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
    }

    @Override
    public String toString() {
        return titulo + " de " + autor + " (ISBN: " + isbn + ")";
    }
}

