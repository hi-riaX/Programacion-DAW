package Actividades.Actividad12TAREA;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
public class Batalla {
    private ArrayList <Personaje> buenos= new ArrayList<>();
    private ArrayList <Personaje> malos = new ArrayList<>();

    // Haremos uso de teclado y random para generar aleatoriamente
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    public Batalla(){
        
    }

    // Mostrar menú
    public void mostrarMenu(){
        int option;
        do {
            System.out.println("==MENU BATALLA==");
            System.out.println("1. Añadir mago");
            System.out.println("2. Añadir Caballero");
            System.out.println("3. Añadir orco");
            System.out.println("4. Iniciar batalla");
            System.out.println("5. Mostrar Listas");
            System.out.println("0. Salir");
            option= Integer.parseInt( teclado.nextLine() );
        
        switch (option) {
            case 1:
                crearPersonaje();
                break;
            case 2:
                crearPersonaje();
                break;
            case 3:
                crearPersonaje();
                break;
                case 4:
                    iniciaBatalla();
                    break;
                    case 5:
                        muestraListas();
                    break;
                    case 0:
                        System.out.println("Saliendo del juego...");
                        break;
            default:
                System.out.println("Esta opcion no existe");
                break;
        }
        } while (option!=0);
    }

    // Creamos el método para crear personaje
    public void crearPersonaje(){
        System.out.println("\n --Crear Personaje--");
        System.out.println("Nombre: ");
        String nombre=teclado.nextLine();
        System.out.println("Vida: ");
        int vida=Integer.parseInt(teclado.nextLine());
        System.out.println("Ataque: ");
        int ataque=Integer.parseInt(teclado.nextLine());
        System.out.println("Defensa: ");
        int defensa=Integer.parseInt(teclado.nextLine());

        System.out.println("Elige 1,2 o 3 si 1. CABALLERO, 2. MAGO, 3. ORCO): ");
        int opc = Integer.parseInt(teclado.nextLine());
        //----------------------------------------------//
        TipoPersonaje tipo = TipoPersonaje.CABALLERO;
        if (opc == 2) tipo = TipoPersonaje.MAGO;
        else if (opc == 3) tipo = TipoPersonaje.ORCO;

        Personaje p = new Personaje(nombre, vida, ataque, defensa, tipo);

         if (tipo == TipoPersonaje.ORCO) {
            this.malos.add(p);
        } else {
            this.buenos.add(p);
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
        for(Personaje h: buenos){
            System.out.println(h);
        }

        System.out.println("\n--------- ORCOS ---------");
        for(Personaje v: malos){
            System.out.println(v);
        }
        }
    
    
    public void iniciaBatalla() {
        System.out.println("\n=== INICIA LA BATALLA ===");

        // Elegir un personaje al azar de cada equipo
            Personaje h = null;
            Personaje o = null;

        while (!buenos.isEmpty() && !malos.isEmpty()) {

            h = this.getPersonajeAleatorio(buenos);
            o = this.getPersonajeAleatorio(malos);
            System.out.println("======COMIENZA LA BATALLA=======");

            

            System.out.println("\nAtaca " + h.getNombre() + " → " + o.getNombre());
            h.atacar(o);

            if (!o.estaVivo()) {
                System.out.println(o.getNombre() + " ha muerto!");
                eliminarOrco(o);
            }

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

        if (h != null)
            System.out.println("\n¡GANAN LOS HÉROES!");
        else
            System.out.println("\n¡GANAN LOS ORCOS!");
    }

    // Eliminar un héroe muerto del array
    private void eliminarHeroe(Personaje p) {
        this.buenos.remove(p);
    }

    // Eliminar un orco muerto del array
    private void eliminarOrco(Personaje p) {
        this.malos.remove(p);
    }

    private Personaje getPersonajeAleatorio( ArrayList<Personaje> lista )
    {
        if (lista.isEmpty()) {
            return null;
        }

        return lista.get( (int) (Math.random() * lista.size() ) );
    }
}
