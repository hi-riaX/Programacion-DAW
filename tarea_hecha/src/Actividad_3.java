import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int max = -9999; // puse un número muy bajo para empezar
        int min = 9999; // puse un número muy alto para empezar

        System.out.println("Ingresa las edades de los alumnos (para terminar escribe -1):");

        edad = sc.nextInt(); // leer la primera edad

        while (edad != -1) { // mientras no sea -1 seguimos
            if (edad > max) {
                max = edad; // si la edad es mayor que max, actualizamos
            }
            if (edad < min) {
                min = edad; // si la edad es menor que min, actualizamos
            }

            edad = sc.nextInt(); // leer la siguiente edad
        }

        // mostrar resultados
        System.out.println("La edad mínima es: " + min);
        System.out.println("La edad máxima es: " + max);
    }
}
