package Actividades.Actividad10;

public class Libro {
    private String nombre;
    private int codigo;
    private String autor;
    private String categoria;
    private int total;
    
    public Libro(String nombre, int codigo, String autor, String categoria, int total) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.autor = autor;
        this.categoria = categoria;
        this.total = total;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static String prestarLibro(int codigo, String autor, String categoria int total){

    }

    public static String devolverLibro(int codigo, String autor, String categoria, int total){
        
    }
}
