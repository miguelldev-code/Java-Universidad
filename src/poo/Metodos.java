package poo;
/*  Acciones contenidas en una clase, y definen su comportamiento
    Se detectan como verbos
    Pueden tener Valores de entrada (Parmetros) y Valores de salida (Valores de retorno)
    Pueden existir Procedimientos (No retornar un valor) y Funciones (Retorna un valor)
* */
public class Metodos {

    // Atributos (Caracteristicas de Alumno)
    int id;
    String nombre;
    String apellido;

    //Metodos (Acciones del Alumno)
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

}
