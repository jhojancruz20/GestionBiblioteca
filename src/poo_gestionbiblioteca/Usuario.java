
package poo_gestionbiblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String idUsuario;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void prestarLibro(Libro libro) {
        if (librosPrestados.size() < 3 && libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.prestar();
        } else if (librosPrestados.size() >= 3) {
            System.out.println(nombre + " ya ha prestado el maximo de 3 libros.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.devolver();
        } else {
            System.out.println("El libro no está en la lista de libros prestados por " + nombre + ".");
        }
    }
}

