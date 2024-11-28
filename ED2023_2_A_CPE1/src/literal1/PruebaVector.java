package literal1;

import algoritmos.Persona;

/**
 * Esta clase de prueba demuestra el uso de la clase Vector con elementos de tipo Integer y Persona.
 * Utiliza operaciones como ingresar, leer, modificar y eliminar elementos en el vector.
 * 
 * @author Pedro Zavala 3ro A
 */
public class PruebaVector {

    /**
     * Método principal que realiza operaciones de prueba con vectores de enteros y personas.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
    	
        // Crear un vector de enteros llamado "MiVector" con capacidad inicial de 5 elementos.
        Vector<Integer> vector = new Vector<>(5, "MiVector");

        // Crear un vector de personas llamado "Personas" con capacidad inicial de 3 elementos.
        Vector<Persona> personas = new Vector<>(3, "Personas");

        // Crear una persona llamada "Rosita" de 30 años.
        Persona persona = new Persona("Rosita", 30);

        // Ingresar elementos en el vector de enteros.
        System.out.println(vector.ingresarElemento(1, 5));
        System.out.println(vector.ingresarElemento(3, 15));

        // Imprimir el contenido completo del vector de enteros.
        vector.imprimirVectorCompleto();

        // Leer el elemento en la posición 3 del vector de enteros.
        System.out.println("Leer elemento en la posición 3");
        System.out.println(vector.leerElemento(3));

        // Modificar el elemento en la posición 3 del vector de enteros por 99.
        System.out.println("Modificación del elemento en la posición 3 por el 99");
        System.out.println(vector.modificarElemento(3, 99) ? "Modificación exitosa" : "No se pudo modificar");

        // Imprimir el contenido completo del vector de enteros después de la modificación.
        vector.imprimirVectorCompleto();

        // Eliminar el elemento en la posición 3 del vector de enteros.
        System.out.println("Eliminar elemento en la posición 3");
        System.out.println(vector.eliminarElemento(3) ? "Eliminación exitosa" : "No se pudo eliminar");

        // Imprimir el contenido completo del vector de enteros después de la eliminación.
        vector.imprimirVectorCompleto();

        // Ingresar personas en el vector de personas.
        System.out.println("Ingresar personas");
        System.out.println(personas.ingresarElemento(new Persona("Fausto", 51)) ? "Ingreso exitoso" : "No se pudo ingresar");
        System.out.println(personas.ingresarElemento(new Persona("Mateo", 5)) ? "Ingreso exitoso" : "No se pudo ingresar");

        // Imprimir el contenido completo del vector de personas.
        personas.imprimirVectorCompleto();

        // Modificar una persona en el vector de personas.
        System.out.println("Modificar persona " + personas.leerElemento(1) + " por " + persona);
        System.out.println(personas.modificarElemento(1, persona) ? "Modificación exitosa" : "No se pudo modificar");

        // Imprimir el contenido completo del vector de personas después de la modificación.
        personas.imprimirVectorCompleto();
        
        // Buscar un elemento en el vector de enteros.
        System.out.println("Buscar elemento 5 en el vector de enteros");
        int posicionEncontrada = vector.buscarElemento(5);
        if (posicionEncontrada != -1) {
            System.out.println("El elemento 5 se encuentra en la posición: " + posicionEncontrada);
        } else {
            System.out.println("El elemento 5 no se encuentra en el vector de enteros");
        }

        // Buscar una persona en el vector de personas.
        System.out.println("Buscar persona Fausto en el vector de personas");
        int posicionPersona = personas.buscarElemento(persona);
        if (posicionPersona != -1) {
            System.out.println("La persona Fausto se encuentra en la posición: " + posicionPersona);
        } else {
            System.out.println("La persona Fausto no se encuentra en el vector de personas");
        }
    }
}
