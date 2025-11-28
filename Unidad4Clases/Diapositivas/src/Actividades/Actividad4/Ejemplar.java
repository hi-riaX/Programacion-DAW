package Actividades.Actividad4;

public class Ejemplar {
    int fecha;
    int numPag;
    int numEjemplares;

    public Ejemplar(int fecha, int numPag, int numEjemplares) {
        this.fecha=fecha;
        this.numPag=numPag;
        this.numEjemplares=numEjemplares;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    
    
}
