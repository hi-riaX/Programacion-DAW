package Actividades.Actividad9;

public class Maquinistas {
    private String nombre;
    private int DNI;
    private int sueldo;
    private String rango;

    public Maquinistas() {
    }

    public Maquinistas(String nombre, int dNI, int sueldo, String rango) {
        this.nombre = nombre;
        DNI = dNI;
        this.sueldo = sueldo;
        this.rango = rango;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinistas [nombre=" + nombre + ", DNI=" + DNI + ", sueldo=" + sueldo + ", rango=" + rango + "]";
    }
}
