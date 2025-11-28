package Actividades.Actividad2;

public class Editorial {
    private int codigo;
    private String nombre;
    private int anyo;

    public Editorial() {
    }

    public Editorial(int codigo, String nombre, int anyo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anyo = anyo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    
}
