package Actividades.Actividad7;

public class Alumno {
    String nombre, apellido;
    String fechaNac;
    int expediente;
    Modulo cursa;

    public Alumno(String nombre, String apellido, String fechaNac, int expediente) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNac=fechaNac;
        this.expediente=expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getExpediente() {
        return expediente;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", expediente="
                + expediente + ", cursa=" + cursa + "]";
    }
    
    
}
