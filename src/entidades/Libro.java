
package entidades;

import java.util.Objects;

public class Libro {
    private String tituloDelLibro;
    private String autor;
    private Integer cantdadDeLibros;
    private Integer cantidadDeLibrosPrestados;

    public Libro() {
    }

    public Libro(String tituloDelLibro, String autor, Integer cantdadDeLibros, Integer cantidadDeLibrosPrestados) {
        this.tituloDelLibro = tituloDelLibro;
        this.autor = autor;
        this.cantdadDeLibros = cantdadDeLibros;
        this.cantidadDeLibrosPrestados = cantidadDeLibrosPrestados;
    }

    public String getTituloDelLibro() {
        return tituloDelLibro;
    }

    public void setTituloDelLibro(String tituloDelLibro) {
        this.tituloDelLibro = tituloDelLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCantdadDeLibros() {
        return cantdadDeLibros;
    }

    public void setCantdadDeLibros(Integer cantdadDeLibros) {
        this.cantdadDeLibros = cantdadDeLibros;
    }

    public Integer getCantidadDeLibrosPrestados() {
        return cantidadDeLibrosPrestados;
    }

    public void setCantidadDeLibrosPrestados(Integer cantidadDeLibrosPrestados) {
        this.cantidadDeLibrosPrestados = cantidadDeLibrosPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "tituloDelLibro=" + tituloDelLibro + ", autor=" + autor + ", cantdadDeLibros=" + cantdadDeLibros + ", cantidadDeLibrosPrestados=" + cantidadDeLibrosPrestados + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.tituloDelLibro);
        hash = 29 * hash + Objects.hashCode(this.autor);
        hash = 29 * hash + Objects.hashCode(this.cantdadDeLibros);
        hash = 29 * hash + Objects.hashCode(this.cantidadDeLibrosPrestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.tituloDelLibro, other.tituloDelLibro)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.cantdadDeLibros, other.cantdadDeLibros)) {
            return false;
        }
        if (!Objects.equals(this.cantidadDeLibrosPrestados, other.cantidadDeLibrosPrestados)) {
            return false;
        }
        return true;
    }
    
    
}
