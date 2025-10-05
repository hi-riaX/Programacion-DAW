import java.util.Scanner;

public class Actividad_7 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        int mcd = calcularMCD(a, b);
        int mcm = calcularMCM(a, b);

        System.out.println("El MCD es: " + mcd);
        System.out.println("El MCM es: " + mcm);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    public static int calcularMCM(int a, int b) {
        if (a == 0 || b == 0) return 0; 
        return Math.abs(a * b) / calcularMCD(a, b);
    }
}
