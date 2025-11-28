package Actividades.Actividad12TAREA;
// Creamos clase Personaje y agregamos todos sus atributos
public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private TipoPersonaje tipo;

    public Personaje(){

    }

    // Asignamos valores a las variables con el método constructor
    public Personaje(String nombre, int vida, int ataque, int defensa, TipoPersonaje tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    // Generamos los Getters and Setters de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() { 
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    // Generamos el método atacar
    public void atacar(Personaje enemigo){
        int daño = this.ataque - enemigo.defensa;
        if (daño < 0) daño = 0; 
        enemigo.recibirDaño(daño);

    }

    // Generamos el método recibirDaño
    public void recibirDaño(int daño){
        this.vida -= daño;
        if (this.vida < 0) this.vida = 0;
    } 

    // Generamos el método está vivo
    public boolean estaVivo(){
        // Devolvemos si vida es mayor a 0
        return this.vida > 0;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
                + ", tipo=" + tipo + "]";
    }
}
