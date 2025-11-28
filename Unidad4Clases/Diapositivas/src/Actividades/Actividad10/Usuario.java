package Actividades.Actividad10;

public class Usuario {
    private String nombre;
    private int codigo;
    private String listaPrestados;
    
    public Usuario(String nombre, int codigo, String listaPrestados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaPrestados = listaPrestados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getListaPrestados() {
        return listaPrestados;
    }

    public void setListaPrestados(String listaPrestados) {
        this.listaPrestados = listaPrestados;
    }

    public static String prestarLibro(int codigo, String listaPrestamos){

    }

    public static String devolverLibro(int codigo, String listaPrestados){

    }

}
