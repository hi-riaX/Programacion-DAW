package Actividades.Actividad12TAREA;
import java.util.Scanner;
import java.util.Random;
public class Actividad9 {
    private Personaje[] buenos;     // Serian caballeros y magos
    private Personaje[] orcos;   // Serian los orcos
    private int countBuenos=0;  // Asignamos 0 como valor de las variables
    private int countOrcos=0;

    // Haremos uso de teclado y random para generar aleatoriamente
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    public Actividad9(){
        buenos = new Personaje[2];
        orcos = new Personaje[2];
    }

    // Creamos el método para crear personaje
    public void crearPersonaje(Personaje personaje){
        System.out.println("\n --Crear Personaje--");
        System.out.println("Nombre: ");
        String nombre=teclado.nextLine();
        System.out.println("Vida: ");
        int vida=teclado.nextInt();
        System.out.println("Ataque: ");
        int ataque=teclado.nextInt();
        System.out.println("Defensa: ");
        int defensa=teclado.nextInt();

        System.out.println("Elige 1,2 o 3 si 1. CABALLERO, 2. MAGO, 3. ORCO): ");
        int opc = teclado.nextInt();
        //----------------------------------------------//
        TipoPersonaje tipo;
        if (opc == 2) tipo = TipoPersonaje.MAGO;
        else if (opc == 3) tipo = TipoPersonaje.ORCO;

        Personaje p = new Personaje(nombre, vida, ataque, defensa, tipo);

         if (tipo == Tipo.ORCO) {
            orcos[countOrcos++] = p;
        } else {
            buenos[countBuenos++] = p;
        }
        System.out.println("Personaje añadido correctamente");

        //-----------------------------------------------//
    }
    // Creamos el método iniciarBatalla con los atributos
    public void iniciarBatalla(int vida, int ataque, int defensa){
        this.iniciarBatalla(vida, ataque, defensa);
        String personaje;
    }
    
    // Creamos el método para mostrar listas
    public void muestraListas(){
        System.out.println("\n--------- BUENOS ---------");
        for (int i = 0; i < countBuenos; i++) {
            System.out.println(buenos[i]);
        }

        System.out.println("\n--------- ORCOS ---------");
        for (int i = 0; i < countOrcos; i++) {
            System.out.println(orcos[i]);
        }
    }
    
    public void iniciaBatalla() {
        System.out.println("\n=== INICIA LA BATALLA ===");

        while (countHeroes > 0 && countOrcos > 0) {

            // Elegir un personaje al azar de cada equipo
            Personaje h = heroes[random.nextInt(countHeroes)];
            Personaje o = orcos[random.nextInt(countOrcos)];

            System.out.println("\nAtaca " + h.getNombre() + " → " + o.getNombre());
            h.atacar(o);

            if (!o.estaVivo()) {
                System.out.println(o.getNombre() + " ha muerto!");
                eliminarOrco(o);
            }

            if (countOrcos == 0) break;

            System.out.println("Ataca " + o.getNombre() + " → " + h.getNombre());
            o.atacar(h);

            if (!h.estaVivo()) {
                System.out.println(h.getNombre() + " ha muerto!");
                eliminarHeroe(h);
            }
        }

        // Mostrar resultado final
        System.out.println("\n=== RESULTADO FINAL ===");
        muestraListas();

        if (countHeroes > 0)
            System.out.println("\n¡GANAN LOS HÉROES!");
        else
            System.out.println("\n¡GANAN LOS ORCOS!");
    }

    // Eliminar un héroe muerto del array
    private void eliminarHeroe(Personaje p) {
        for (int i = 0; i < countBuenos; i++) {
            if (buenos[i] == p) {
                buenos[i] = buenos[countBuenos - 1];
                buenos[countBuenos - 1] = null;
                countBuenos--;
                break;
            }
        }
    }

    // Eliminar un orco muerto del array
    private void eliminarOrco(Personaje p) {
        for (int i = 0; i < countOrcos; i++) {
            if (orcos[i] == p) {
                orcos[i] = orcos[countOrcos - 1];
                orcos[countOrcos - 1] = null;
                countOrcos--;
                break;
            }
        }
    }

    // Mostrar menú
    public void mostrarMenu(){
        
    }
}
