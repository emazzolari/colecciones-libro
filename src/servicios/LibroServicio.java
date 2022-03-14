package servicios;

import entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LibroServicio {

    private HashSet<Libro> nuevoMapa; // Creo el mapa
    // private HashSet<Libro> prestamo;
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public LibroServicio() {
        this.nuevoMapa = new HashSet<>(); // Creo el espacio en memoria del LISTAS
        //   this.prestamo = new HashSet<>();

        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void crearLibro() {
        String respuesta = "";
        do {
            Libro libro = new Libro();

            System.out.println("Ingrese el Título del Libro");
            String titulo = (leer.next());
            libro.setTituloDelLibro(titulo);

            System.out.println("Ingrese el Autor");
            String autor = (leer.next());
            libro.setAutor(autor);

            System.out.println("Ingrese la cantidad de ejemplares que hay");
            Integer cantidad = leer.nextInt();
            libro.setCantdadDeLibros(cantidad);

            Integer cantPres = 0;
            libro.setCantidadDeLibrosPrestados(cantPres);

            nuevoMapa.add(libro);

            System.out.println("Quiere ingresar otro Libro?");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void prestamoBusqueda() {
        System.out.println("");
        System.out.println("Ingrese el Titulo del libro a prestar");
        String libroABuscar = leer.next();
        boolean aux = false;

        for (Libro libro : nuevoMapa) {
            if (libro.getTituloDelLibro().equals(libroABuscar)) {
                if (libro.getCantdadDeLibros() > 0) {
                    Integer auxCant = libro.getCantdadDeLibros() - 1;
                    libro.setCantdadDeLibros(auxCant);

                    Integer auxCantPres = libro.getCantidadDeLibrosPrestados() + 1;
                    libro.setCantidadDeLibrosPrestados(auxCantPres);
                    System.out.println("Se presto el libro correctamente");
                    //prestamo.add(libro);

                } else {
                    System.out.println("No hay cantidad suficiente");
                }
                aux = true;
            }
        }
        if (aux == false) {
            System.out.println("");
            System.out.println("El libro no se encuentra");

        }
    }

    public void devolucion() {
        System.out.println("");
        System.out.println("Ingrese el Titulo del libro a devolver");
        String libroABuscar = leer.next();
        boolean aux = false;

        for (Libro libro : nuevoMapa) {
            if (libro.getTituloDelLibro().equals(libroABuscar)) {
                if (libro.getCantidadDeLibrosPrestados() > 0) {
                    Integer auxCant = libro.getCantidadDeLibrosPrestados() - 1;
                    libro.setCantidadDeLibrosPrestados(auxCant);

                    Integer auxCantPres = libro.getCantdadDeLibros() + 1;
                    libro.setCantdadDeLibros(auxCantPres);
                    System.out.println("Se devolvio el libro correctamente");
                } else {
                    System.out.println("No hay cantidad suficiente");
                }
                aux = true;
            }
        }
        if (aux == false) {
            System.out.println("");
            System.out.println("El libro no se encuentra");
        }

    }

    public void ListaDeLibros() {
        System.out.println("Lista de libros");
        for (Libro libro : nuevoMapa) {
            System.out.println("");
            System.out.println(libro);
        }
    }

    public void menu() {
        LibroServicio p1 = new LibroServicio();
        int opcion;
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("");
            System.out.println("Ingrese la operación que desea realizar: ");
            System.out.println("1.Ingresar un Libro\n2.Sacar un libro\n3.devolver un libro\n4.Listar los libros\n5.Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    p1.crearLibro();
                    break;
                case 2:
                    p1.prestamoBusqueda();
                    break;
                case 3:
                    p1.devolucion();
                    break;
                case 4:
                    p1.ListaDeLibros();
                    break;
                case 5:
                    salir = true;
                    break;
                //default: System.out.println("Ingrese una opcion valida: ");
            }
        }
    }
}
