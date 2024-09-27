
package poo_gestionbiblioteca;

public class Main {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Crear algunos libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456");
        Libro libro2 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", "234567");
        Libro libro3 = new Libro("Donde los arboles cantan", "Laura Gallego", "345678");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Ana", "001");
        Usuario usuario2 = new Usuario("Carlos", "002");

        // Agregar usuarios a la biblioteca
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Préstamos de libros
        usuario1.prestarLibro(libro1); // Ana toma prestado "El Quijote"
        usuario1.prestarLibro(libro2); // Ana toma prestado "Cien años de soledad"
        usuario1.prestarLibro(libro3); // Ana toma prestado "Donde los árboles cantan"

        // Intentar prestar más libros (debería fallar)
        usuario1.prestarLibro(libro1); // Ana ya tiene 3 libros, no puede prestar más.

        // Devoluciones de libros
        usuario1.devolverLibro(libro1); // Ana devuelve "El Quijote"
        usuario1.prestarLibro(libro1);  // Ahora puede volver a tomar prestado "El Quijote"
    }
}

