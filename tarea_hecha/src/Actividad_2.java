import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.print(num + "! = ");
        for (int i = num; i > 0; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + factorial);
    }   
}