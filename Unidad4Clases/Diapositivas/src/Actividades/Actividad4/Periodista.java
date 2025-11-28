package Actividades.Actividad4;

public class Periodista {
    int id;
    String nombre, apellido;
    String telefono;
    String especialidad;

    public Periodista(int id, String nombre, String apellido, String telefono, String especialidad) {
        this.id=id;
        this.nombre=nombre;
        this.telefono=telefono;
        this.especialidad=especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
