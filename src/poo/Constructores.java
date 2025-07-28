package poo;

public class Constructores {

    // Atributos (Caracteristicas de Alumno)
    int id;
    String nombre;
    String apellido;

    // Metodos (Acciones del Alumno)
    //Modificador de acceso - Tipo de dato (Muestra procedimeinto pero no recibo respuesta) - Nombre del metodo
    public void mostrarNombre(){
        System.out.println("Nombre Alumno");
    }

    public void saberNota(double calificacion){
        if (calificacion >= 3){
            System.out.println("Aprobo materia");
        }else{
            System.out.println("No aprobo materia");
        }

    }

    // Constructor (Funciones especiales que contiene la clase)
    // public Alumno - Recibe parametros
    public Constructores(int id, String nombre, String apellido){
        // this.id es el atributo de la clase, mientras que id es el parámetro recibido.
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // public Alumno - No recibe parametros y no tiene valor
    public Constructores(){
        /* los atributos del objeto tendrán sus valores por defecto:
            - 0 para números
            - null para objetos/String
            - false para boolean   */
    }

}
