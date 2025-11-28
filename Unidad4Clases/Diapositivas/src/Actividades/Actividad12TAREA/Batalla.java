package Actividades.Actividad12TAREA;
import java.util.Scanner;
import java.util.Random;

public class Batalla {
    private Personaje[] buenos;     // Serian caballeros y magos
    private Personaje[] orcos;   // Serian los orcos
    private int countBuenos=0;  // Asignamos 0 como valor de las variables
    private int countOrcos=0;

    // Haremos uso de teclado y random para generar aleatoriamente
    Scanner teclado = new Scanner(System.in);
    Random random = new Random();

    public Batalla(){
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
    }


    //test
}
