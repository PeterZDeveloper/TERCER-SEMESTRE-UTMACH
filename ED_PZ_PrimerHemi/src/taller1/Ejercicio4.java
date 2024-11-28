package taller1;

public class Ejercicio4 {

	// Método principal (punto de entrada del programa)
    public static void main(String[] args) {
        // Ejemplo de uso
        double[] arreglo = {1.0, 2.0, 3.0, 4.0, 5.0};
        int longitud = arreglo.length; // Obtiene la longitud del arreglo
        double resultado = suma(arreglo, longitud); // Llama a la función suma
        System.out.println("La suma es: " + resultado); // Imprime el resultado
    }

    // Función que realiza la suma según un patrón específico
    static double suma(double[] d, int n) {
        int k = 0; // Inicializa el índice k a 0
        double s = 0; // Inicializa la suma acumulada s a 0

        // Bucle while que recorre el arreglo y realiza la suma
        while (k < n) {
            s += d[k]; // Suma el elemento en la posición k al acumulador s

            // Estructura if que modifica el índice k según un patrón específico
            if (k == 0)
                k = 2; // Si k es 0, asigna 2 a k
            else
                k = 2 * k; // Si k no es 0, multiplica k por 2
        }

        // Retorna el resultado de la suma
        return s;
    }
}

