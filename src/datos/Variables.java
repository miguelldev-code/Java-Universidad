package datos;

public class Variables {
    public static void main(String[] args) {

        // VARIABLES EN JAVA

        // Declaración e inicialización de variables
        String miVariable = "Hola desde Java";
        System.out.println(miVariable);

        // Ejemplos de asignaciones
        String nombre = "Juan";
        int edad = 20;
        double altura = 1.75;
        boolean esEstudiante = true;

        System.out.println(nombre); // Imprime: Juan
        System.out.println(edad); // Imprime: 20
        System.out.println(altura); // Imprime: 1.75
        System.out.println(esEstudiante); // Imprime: true

        // Operaciones con variables
        int x = 10;
        int y = 12;
        int z = x + y;
        System.out.println(z); // Imprime: 22

        // Concatenación entre texto y variables
        String usuario = "User1";
        String mensajeBienvenida = "Hola, " + usuario;
        System.out.println(mensajeBienvenida); // Imprime: Hola, User1

        // Distinción entre mayúsculas y minúsculas
        String variable1 = "Hola";
        String Variable1 = "Adiós"; // Diferente por la mayúscula inicial

        System.out.println(variable1); // Imprime: Hola
        System.out.println(Variable1); // Imprime: Adiós

    }

}
