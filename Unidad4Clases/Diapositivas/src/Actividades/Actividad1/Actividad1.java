package Actividades.Actividad1;

public class Actividad1 {
    
    public static void main(String[] args) {

        Persona persona1 = new Persona(
                "Juan Perez",
                "12345678A",
                "01/01/1990",
                "Calle Falsa 123",
                "Masculino",
                "Soltero"
        );

        CuentaCorriente cuenta1 = new CuentaCorriente(persona1, "ES1234567890", 1500.0);

        System.out.println("Informacion inicial:");
        cuenta1.mostrarInformacion();

        cuenta1.ingresar(500.0);
        cuenta1.retirar(300.0);

        System.out.println("\nInformacion despues de movimientos:");
        cuenta1.mostrarInformacion();
    }
}
    
