package main;

import algoritmo_fibonacci.FibonacciR;

public class Main_F {

    public static void main(String[] args) {
        long tiempo, fibo;
        int pos = 40; // Aquí se controla hasta donde llega la serie

        FibonacciR fibonacci = new FibonacciR(pos+1); // Corregir el tamaño aquí

        // Comparación de tiempos para el término 40 de la serie de Fibonacci sin
        // memoización
        tiempo = System.nanoTime(); // Inicia al cronómetro
        fibo = FibonacciR.fibonacci(pos);
        tiempo = System.nanoTime() - tiempo; // Detiene al cronómetro
        System.out.println(
                "Termino 40 de la serie de Fibonacci (Prueba): " + fibo + " en " + tiempo + " nanosegundos");

        // Comparación de tiempos para el término 40 de la serie de Fibonacci sin
        // memoización
        tiempo = System.nanoTime(); // Inicia al cronómetro
        fibo = FibonacciR.fibonacci(pos);
        tiempo = System.nanoTime() - tiempo; // Detiene al cronómetro
        System.out.println(
                "Termino 40 de la serie de Fibonacci (sin memoización): " + fibo + " en " + tiempo + " nanosegundos");

        // Comparación de tiempos para el término 40 de la serie de Fibonacci con
        // memoización
        tiempo = System.nanoTime();
        fibo = fibonacci.fibonacciControl(pos);
        tiempo = System.nanoTime() - tiempo;
        System.out.println(
                "Termino 40 de la serie de Fibonacci (con memoización): " + fibo + " en " + tiempo + " nanosegundos");

        // Imprimir la serie hasta la posición indicada y el valor en esa posición
        fibonacci.imprimirSerie(pos);
    }
}
