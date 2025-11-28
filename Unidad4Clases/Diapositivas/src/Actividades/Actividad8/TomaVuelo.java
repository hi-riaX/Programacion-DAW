package Actividades.Actividad8;

public class TomaVuelo {
    private int id_turista;
    private int id_vuelo;
    private int id_sucursal;
    String clase;

   public TomaVuelo(int id_turista, int id_vuelo, int id_sucursal, String clase) {
        this.id_turista = id_turista;
        this.id_vuelo = id_vuelo;
        this.id_sucursal = id_sucursal;
        this.clase = clase;
    }

   public int getId_turista() {
    return id_turista;
   }

   public void setId_turista(int id_turista) {
    this.id_turista = id_turista;
   }

   public int getId_vuelo() {
    return id_vuelo;
   }

   public void setId_vuelo(int id_vuelo) {
    this.id_vuelo = id_vuelo;
   }

   public int getId_sucursal() {
    return id_sucursal;
   }

   public void setId_sucursal(int id_sucursal) {
    this.id_sucursal = id_sucursal;
   }

   public String getClase() {
    return clase;
   }

   public void setClase(String clase) {
    this.clase = clase;
   }
}
