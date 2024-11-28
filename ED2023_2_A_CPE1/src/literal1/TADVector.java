package literal1;

import java.util.Arrays;

/**
 * Clase parametrizada para realizar operaciones básicas en un arreglo unidimensional.
 * 
 * @author Pedro Zavala 3ro A
 * @param <T> Tipo de dato genérico.
 */
public class TADVector<T > {
    private T[] vector;
    private int longitud;
    private String nombre;

    /**
     * Constructor de la clase para instanciar la estructura del vector con una
     * longitud y un nombre.
     * 
     * @param nombre   Nombre del vector.
     * @param longitud Tamaño del vector.
     */
    @SuppressWarnings("unchecked")
    public TADVector(String nombre, int longitud) {
        super();
        vector = (T[]) new Object[longitud];
        this.longitud = longitud;
        this.setNombre(nombre);
    }

    /**
     * Obtiene el nombre del vector.
     * 
     * @return Nombre del vector.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del vector.
     * 
     * @param nombre Nombre del vector.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la longitud del vector.
     * 
     * @return Longitud del vector.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Devuelve una representación en cadena del objeto TADVector.
     * 
     * @return Cadena que representa el objeto TADVector.
     */
    @Override
    public String toString() {
        return "TADVector [vector=" + Arrays.toString(vector) + ", longitud=" + longitud + ", nombre=" + nombre + "]";
    }

    /**
     * Ingresa un elemento en la posición especificada del vector.
     * 
     * @param pos  Posición en la que se ingresará el elemento.
     * @param dato Elemento a ingresar.
     * @return true si la operación fue exitosa, false de lo contrario.
     */
    public boolean ingresarElemento(int pos, T dato) {
        boolean resul = false;

        while (pos >= 0 && pos <= vector.length - 1 && !resul) {
            if (leerElemento(pos) == null) {
                vector[pos] = dato;
                resul = true;
            } else
                pos++;
        }
        return resul;
    }

    /**
     * Ingresa un elemento al principio del vector.
     * 
     * @param dato Elemento a ingresar.
     * @return true si la operación fue exitosa, false de lo contrario.
     */
    public boolean ingresarElemento(T dato) {
        return ingresarElemento(0, dato);
    }

    /**
     * Lee el elemento en la posición especificada del vector.
     * 
     * @param pos Posición del elemento a leer.
     * @return Elemento en la posición especificada, o null si la posición es
     *         inválida.
     */
    public T leerElemento(int pos) {
        if (pos >= 0 && pos <= vector.length - 1)
            return vector[pos];
        else
            return null;
    }

    /**
     * Modifica el elemento en la posición especificada del vector.
     * 
     * @param dato Nuevo elemento.
     * @param pos  Posición a modificar.
     * @return true si la operación fue exitosa, false de lo contrario.
     */
    public boolean modificarElemento(T dato, int pos) {
        boolean resul = false;

        if (pos >= 0 && pos <= vector.length - 1 && vector[pos] != null) {
            vector[pos] = dato;
            resul = true;
        }
        return resul;
    }

    /**
     * Elimina el elemento en la posición especificada del vector.
     * 
     * @param pos Posición del elemento a eliminar.
     * @return true si la operación fue exitosa, false de lo contrario.
     */
    public boolean eliminarElemento(int pos) {
        return modificarElemento(null, pos);
    }

    /**
     * Imprime los elementos no nulos del vector.
     */
    public void imprimirVector() {
        for (T elem : vector)
            if (elem != null)
                System.out.println(elem);
    }

    /**
     * Imprime el contenido completo del vector, incluyendo posiciones con elementos
     * nulos.
     */
    public void imprimirVectorCompleto() {
        for (int pos = 0; pos < vector.length; ++pos)
            System.out.println(pos + ": " + leerElemento(pos));
    }

    /**
     * Busca un elemento en el vector.
     * 
     * @param dato Elemento a buscar.
     * @return La posición del elemento si se encuentra, o -1 si no se encuentra.
     */
    public int buscarElemento(T dato) {
    	int resul = -1;
       //comprara usando comparable una interfaz.
    	for (int pos = 0; pos < vector.length; ++pos) {
    		if(dato.equals(vector[pos])) {
    			resul = pos;
    			
    			pos = vector.length; //salida logica anticipada
    		}
    	}
        return resul;
    }

    /**
     * Modifica un elemento en el vector.
     * 
     * @param dato     Elemento a modificar.
     * @param datoNuevo Nuevo elemento.
     * @return true si la operación fue exitosa, false de lo contrario.
     */
    public boolean modificarElementoPorBusqueda(T dato, T datoNuevo) {
        // Implementación pendiente
        return false;
    }

    /**
     * Elimina un elemento del vector.
     * 
     * @param dato Elemento a eliminar.
     * @return true si la operación fue exitosa, false de lo contrario.
     */
    public boolean eliminarElementoPorBusqueda(T dato) {
        // Implementación pendiente
        return false;
        
    }
    


}
