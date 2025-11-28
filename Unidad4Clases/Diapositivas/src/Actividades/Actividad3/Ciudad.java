package Actividades.Actividad3;

public class Ciudad {
    // Atributos
    private int codigo;
    private String nombre;
    private String apellido;
    private char genero;

    Fecha fechaNacimiento;
    Ciudad ciudadNacimiento;
    Ciudad ciudadResidencia;

    // Constructores
    public Ciudad(int codigo, String nombre, String apellido, char genero) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.genero=genero;
    }

    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre() {
        this.nombre=nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido=apellido;
    }
    
    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero=genero;
    }
}
