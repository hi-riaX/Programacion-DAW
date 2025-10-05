import java.util.Scanner;

public class Actividad_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        System.out.println("=== CALCULADORA SIMPLE ===");

        do {
            System.out.println("\nElige una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número (o -1 para salir): ");
                num1 = sc.nextDouble();
                if (num1 == -1) break;

                System.out.print("Introduce el segundo número (o -1 para salir): ");
                num2 = sc.nextDouble();
                if (num2 == -1) break;

                if (opcion == 1) {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 2) {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 3) {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                } else if (opcion == 4) {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: división entre cero.");
                    }
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        System.out.println("¡Gracias por usar la calculadora!");
    }
}
