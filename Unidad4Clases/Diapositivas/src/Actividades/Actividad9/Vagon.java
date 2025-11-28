package Actividades.Actividad9;

public class Vagon {
    private int numero;
    private int cargaMax;
    private int cargaActual;
    private String tipoMercancia;

    public Vagon(int numero, int cargaMax, int cargaActual, String tipoMercancia){
        this.numero=numero;
        this.cargaMax=cargaMax;
        this.cargaActual=cargaActual;
        this.tipoMercancia=tipoMercancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void setTipoMercancia(String tipoMercancia) {
        this.tipoMercancia = tipoMercancia;
    }

    @Override
    public String toString() {
        return "Vagon [numero=" + numero + ", cargaMax=" + cargaMax + ", cargaActual=" + cargaActual
                + ", tipoMercancia=" + tipoMercancia + "]";
    }

}
