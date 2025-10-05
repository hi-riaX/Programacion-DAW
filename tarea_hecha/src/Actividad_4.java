import java.util.Scanner;

public class Actividad_4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int max = -9999; 
        int min = 9999; 
        int suma = 0;    
        int contador = 0; 
        int mayores = 0;  

        System.out.println("Ingresa las edades de los alumnos (escribe -1 para terminar):");

        edad = sc.nextInt();

        while (edad != -1) {
            if (edad > max) {
                max = edad;
            }
            // eddad < min y edad != -1
            if (edad < min) {
                min = edad;
            }

            suma = suma + edad; 
            contador = contador + 1;

            if (edad >= 18) { 
                mayores = mayores + 1;
            }

            edad = sc.nextInt();
        }

        if (contador > 0) { 
            double media = (double) suma / contador; 
            System.out.println("La edad mínima es: " + min);
            System.out.println("La edad máxima es: " + max);
            System.out.println("La suma de edades es: " + suma);
            System.out.println("La media de edades es: " + media);
            System.out.println("Número de alumnos: " + contador);
            System.out.println("Mayores de edad: " + mayores);
        } else {
            System.out.println("No se introdujeron edades.");
        }
    }
}
