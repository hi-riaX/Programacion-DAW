import java.util.Scanner;

public class Actividad_5 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intento;
        int contador = 0;

        System.out.println("He pensado un número entre 1 y 100. ¡Adivínalo!");

        do {
            System.out.print("Introduce un número: ");
            intento = sc.nextInt();
            contador++;

            if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + contador + " intentos.");
            }

        } while (intento != numeroSecreto);
    }
}
