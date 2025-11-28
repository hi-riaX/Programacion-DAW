package Actividades.Actividad8;

public class Reserva {
    private Turista turista;
    private Hotel Hotel;
    private Sucursal Sucursal;
    private String fechaEntrada;
    private String fechaSalida;
    private String regimen;

    public Reserva( String fechaEntrada, String fechaSalida, String regimen){
        this.fechaEntrada=fechaEntrada;
        this.fechaSalida=fechaSalida;
        this.regimen=regimen;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }
}
