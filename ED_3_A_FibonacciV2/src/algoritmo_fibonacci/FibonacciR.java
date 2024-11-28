package algoritmo_fibonacci;

public class FibonacciR {
    private int[] serieF; // Usamos vector y aquí lo inicializamos
    // SerieF es el nombre del vector
    // Constructor encargado de inicializar el vector y el valor de n
    // de la serieFibonacci
    public FibonacciR() {
        this.serieF = new int[20]; // tamaño del vector
        // Nota: trata de usar arraylist la próxima vez.
        serieFibonacci(0); // ejecuta el siguiente metodo con n = 0
    }

    // Método para calcular la serie de Fibonacci de forma recursiva
    public int fibonacciControl(int pos) {
        for (int i = 0; i <= pos; i++) { // recorre todo el arreglo
            serieF[i] = serieFibonacci(i);
        }
        return serieF[pos]; // Retorna el valor obtenido para la posición indicada
    }

    private int serieFibonacci(int n) {
        // Casos base: si n es 0, el valor de la serie es 0; si n es 1, el valor de la serie es 1
        if (n == 0) {
            serieF[n] = 0;
        } else if (n == 1) {
            serieF[n] = 1;
        }
        // Caso general: n es mayor que 1, calcular la serie de Fibonacci de forma recursiva
        else {
            // Llamada recursiva para calcular el valor de la serie sumando los dos términos
            // anteriores
            serieF[n] = serieFibonacci(n - 1) + serieFibonacci(n - 2);
        }

        // Retorna el valor obtenido para la posición n en la serie de Fibonacci
        return serieF[n];
    }

    public void imprimirSerie() {
        // lazo que recorre todo el vector.
        for (int i = 0; i < serieF.length; i++) {
            // Imprime el elemento actual seguido por un espacio en la misma línea
            System.out.print(serieF[i] + " ");
        }

        // Imprime una nueva línea después de imprimir todos los elementos
        System.out.println();
    }
}
