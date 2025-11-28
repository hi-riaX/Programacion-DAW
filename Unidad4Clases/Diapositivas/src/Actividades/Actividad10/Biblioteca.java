package Actividades.Actividad10;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> listaLibros = new ArrayList<>();
    
    public Biblioteca(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(String listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void agregarLibro(Libro libro){
        this.listaLibros.add(libro);
    }

    public static String buscarLibro(Libro listaLibros) {
        int index = this.listaLibros.indexOf(libro);

        if(index != -1) {

            return libro null;
            
        }
    }

    public void  eliminarLibro(Libro libro){

        int index = this.listaLibros.indexOf(libro);

        if ( index != -1 ) {
            
            this.listaLibros.remove(index);
        }
    }

    
}
