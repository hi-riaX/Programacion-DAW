package Actividades.Actividad9;

public class Mecanicos {
    private String nombre;
    private int DNI;
    private String telefono;
    private Especialidad especialidad;
    
    public Mecanicos(String nombre, int dNI, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        DNI = dNI;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanicos [nombre=" + nombre + ", DNI=" + DNI + ", telefono=" + telefono + ", especialidad="
                + especialidad + "]";
    }
    
}
