public class Actividad_1 {
       public static void main(String[] args) {
        System.out.println("Números entre 50 y 200 que son múltiplos de 2 y 3:");
        
        for (int i = 50; i <= 200; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
