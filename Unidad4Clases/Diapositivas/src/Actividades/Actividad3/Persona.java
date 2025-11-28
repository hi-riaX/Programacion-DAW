package Actividades.Actividad3;

public class Persona {
    // Atributos
    private String cedula;
    private String nombre;
    private String apellidos;
    private char genero;

    // Constructores
    public Persona() {

    }

    public Persona(String cedula, String nombre, String apellidos, char genero) {
        this.cedula = cedula;
    }

    public String getcedula() {
        return this.cedula;
    }
    
    public void setcedula(String cedula) {
        this.cedula=cedula;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getapellidos() {
        return this.apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos=apellidos;
    }

    public char getgenero() {
        return this.genero;
    }

    public void setgenero(char genero) {
        this.genero=genero;
    }

}
