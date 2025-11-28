package Actividades.Actividad7;

public class Profesor {
    int dni;
    String nombre;
    String telefono;
    Modulo imparte;

    public Profesor(int dni, String nombre, String telefono) {
        this.dni=dni;
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Profesor [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", imparte=" + imparte + "]";
    }

    
    
}
