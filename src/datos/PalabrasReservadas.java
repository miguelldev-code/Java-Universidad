package datos;

public class PalabrasReservadas {
    public static void main(String[] args) {
        /**
         * Este programa demuestra las palabras reservadas (keywords) en Java.
         * Las palabras reservadas tienen un significado especial en el lenguaje
         * y no pueden usarse como nombres de variables, clases o métodos.
         */

        // 1. Tipos de datos primitivos
        // byte ejemploByte = 100; // 8-bit entero con signo (-128 a 127)
        // short ejemploShort = 1000; // 16-bit entero con signo
        int ejemploInt = 100000; // 32-bit entero con signo
        // long ejemploLong = 1000000000L; // 64-bit entero con signo (necesita 'L')
        // float ejemploFloat = 3.14f; // 32-bit decimal (necesita 'f')
        // double ejemploDouble = 3.141592; // 64-bit decimal
        char ejemploChar = 'A'; // Carácter Unicode (16-bit)
        boolean ejemploBoolean = true; // true o false
        // String ejemploString = "Cadena de texto";

        // 2. Control de flujo
        if (ejemploBoolean) { // if: ejecuta si la condición es true
            System.out.println("Es verdadero");
        } else { // else: caso contrario
            System.out.println("Es falso");
        }

        for (int i = 0; i < 3; i++) { // for: bucle con contador
            System.out.println("Iteración " + i);
        }

        while (ejemploInt > 0) { // while: bucle mientras sea true
            ejemploInt--;
        }

        do { // do-while: ejecuta al menos una vez
            System.out.println("Do-while");
        } while (ejemploBoolean);

        switch (ejemploChar) { // switch: estructura de múltiples casos
            case 'A':
                System.out.println("Es A");
                break; // break: sale del switch o bucle
            case 'B':
                System.out.println("Es B");
                break;
            default: // default: caso por defecto
                System.out.println("Otro carácter");
        }

        // 3. Modificadores de acceso
        // public: accesible desde cualquier clase
        // private: solo accesible dentro de su clase
        // protected: accesible dentro del mismo paquete y subclases
        // (no se pueden usar directamente en este ejemplo)

        // 4. Otros importantes
        final double PI = 3.1416; // final: constante (no se puede modificar)
        System.out.println(PI);
        try { // try-catch: manejo de excepciones
            int division = 10 / 0;
            System.out.println(division);

        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }

        // return: devuelve un valor en métodos (no aplica aquí)
    }

}
