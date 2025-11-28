package Actividades.Actividad4;

public class Revista {
    int numReg;
    String titulo;
    String tipo;
    String periodicidad;

    public Revista(int numReg, String titulo, String tipo, String periodicidad){
        this.numReg=numReg;
        this.titulo=titulo;
        this.tipo=tipo;
        this.periodicidad=periodicidad;
    }

    public int getNumReg() {
        return numReg;
    }

    public void setNumReg(int numReg) {
        this.numReg=numReg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    
}
