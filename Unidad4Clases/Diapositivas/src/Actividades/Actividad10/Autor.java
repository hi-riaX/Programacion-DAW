package Actividades.Actividad10;

public class Autor {
    private String nombre;
    private String listaPremios;
    
    public Autor(String nombre, String listaPremios) {
        this.nombre = nombre;
        this.listaPremios = listaPremios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getListaPremios() {
        return listaPremios;
    }

    public void setListaPremios(String listaPremios) {
        this.listaPremios = listaPremios;
    }

    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", listaPremios=" + listaPremios + "]";
    }

}
