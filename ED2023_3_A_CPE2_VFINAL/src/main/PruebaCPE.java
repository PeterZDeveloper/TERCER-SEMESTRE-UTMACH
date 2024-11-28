package main;

import algoritmos.Algoritmos;
import algoritmos.Ordenacion;
import entidades.Persona;

public class PruebaCPE {
	public static void main(String[] args) {
		long tiempo = 0;
		int pos = 0;

		// Genera 100 objetos de tipo Persona
		Persona[] personas = Algoritmos.generarPersonas(100);
		/**
		 * //Generamos la persona a buscar Persona p1 = new
		 * Persona("9999999999",Algoritmos.aleatorio(60, 110, 1)); personas[0] = p1;
		 */
		// Muestra las personas en pantalla generadas anteriormente
		System.out.println("Personas sin ordenar:");
		Algoritmos.imprimir(personas);

		// Copia el arreglo para preservarlo
		Persona[] copiaPersonas1 = Algoritmos.copiar(personas); // burbuja
		Persona[] copiaPersonas2 = Algoritmos.copiar(personas); // seleccion
		Persona[] copiaPersonas3 = Algoritmos.copiar(personas); // insercion

		// Este ordenamiento solo sirve para que el hardware ejecute bien el resto de
		// algoritmos
		// burbuja
		tiempo = System.nanoTime(); // inicio
		Ordenacion.ordBurbuja(copiaPersonas1); // metodo usado para ordenar
		tiempo = System.nanoTime() - tiempo; // final
		System.out.println("ORDENAMIENTO DE PRUEBA Ha demorado: <" + tiempo + "> nanosegundos");
		System.out.println('\n');
		// Mide y muestra el tiempo de ejecución para el método de ordenamiento de
		// burbuja
		System.out.println("ORDENAMIENTO BURBUJA:");
		tiempo = System.nanoTime(); // inicio
		Ordenacion.ordBurbuja(copiaPersonas1); // metodo usado para ordenar
		tiempo = System.nanoTime() - tiempo; // final
		System.out.println("Tiempo ordenamiento Burbuja: <" + tiempo + "> nanosegundos");
		// Muestra el arreglo ordenado por burbuja
		System.out.println("Personas ordenadas por Burbuja:");
		Algoritmos.imprimir(copiaPersonas1);
		System.out.println('\n');

		// Mide y muestra el tiempo de ejecución para el método de ordenamiento de
		// Seleccion
		System.out.println("ORDENAMIENTO SELECCION:");
		tiempo = System.nanoTime();
		Ordenacion.ordSeleccion(copiaPersonas2); // metodo usado para ordenar
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Tiempo ordenamiento de Seleccion: <" + tiempo + "> nanosegundos");

		// Muestra el arreglo ordenado por Seleccion
		System.out.println("Personas ordenadas por Seleccion:");
		Algoritmos.imprimir(copiaPersonas2);
		System.out.println('\n');

		// Mide y muestra el tiempo de ejecución para el método de ordenamiento de
		// Insercion
		System.out.println("ORDENAMIENTO INSERCION:");
		tiempo = System.nanoTime();
		Ordenacion.ordInsercion(copiaPersonas3); // metodo usado para ordenar
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Tiempo ordenamiento de Insercion: <" + tiempo + "> nanosegundos");

		// Muestra el arreglo ordenado por Insercion
		System.out.println("Personas ordenadas por Insercion:");
		Algoritmos.imprimir(copiaPersonas3);
		System.out.println('\n');

		Algoritmos.generarPersonas(1);
		tiempo = System.nanoTime();
		pos = Ordenacion.busquedaSec(personas, personas[3]);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Búsqueda secuencial sin ordenar:");
		System.out.println("Resultado: " + (pos != -1 ? "Encontrado en la posicion: " + pos : "No encontrado"));
		System.out.println("Tiempo: " + tiempo + " nanosegundos");
		System.out.println('\n');

		// Búsqueda secuencial en el arreglo ordenado
		tiempo = System.nanoTime();
		pos = Ordenacion.busquedaSec(copiaPersonas1, personas[3]);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Búsqueda secuencial en arreglo ordenado:");
		System.out.println("Resultado: " + (pos != -1 ? "Encontrado en la posicion: " + pos : "No encontrado"));
		System.out.println("Tiempo: " + tiempo + " nanosegundos");
		System.out.println('\n');

		// Búsqueda binaria en el arreglo ordenado
		tiempo = System.nanoTime();
		pos = Ordenacion.busquedaBin(copiaPersonas2, personas[3]);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("Búsqueda binaria en arreglo ordenado:");
		System.out.println("Resultado: " + (pos != -1 ? "Encontrado en la posicion: " + pos : "No encontrado"));
		System.out.println("Tiempo: " + tiempo + " nanosegundos");
		System.out.println('\n');
	}

}
