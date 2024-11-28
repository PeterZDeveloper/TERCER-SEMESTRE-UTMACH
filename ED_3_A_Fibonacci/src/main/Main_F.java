package main;

import algoritmo_fibonacci.FibonacciR;

public class Main_F {

	public static void main(String[] args) {
		long tiempo;
		int pos = 8; // Aqui se controla hasta donde llega la serie

		FibonacciR fibonacci = new FibonacciR(); // creando el constructor y llamandolo

		tiempo = System.nanoTime(); // inicia al cronometro
		if (pos > 1) {
			int resulF = fibonacci.fibonacciControl(pos);
			// Imprimir la serie
			System.out.println("Serie de Fibonacci hasta la posición " + (pos + 1) + ":");
			tiempo = System.nanoTime() - tiempo; // para el cronometro
			fibonacci.imprimirSerie();

			// Imprimir el valor en la posición indicada
			System.out.println("Valor en la posición " + (pos + 1) + ": " + resulF);
			System.out.println("La serie se genero en " + tiempo + " nanosegundos");
		} else {
			System.out.println("Error: La posición no puede ser negativa ni 0 o 1.");
		}
	}
}
