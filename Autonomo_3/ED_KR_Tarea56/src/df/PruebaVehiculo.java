package df;
import algoritmos.Algoritmos;
import algoritmos.Busqueda;
import algoritmos.Ordenacion;

public class PruebaVehiculo {

	public static void main(String[] args) {
		Vehiculo[] vector2 = new Vehiculo[5];
		long tiempo;
		int pos;
		Vehiculo v1 = new Vehiculo(Algoritmos.generarPlacaAleatoria());
		Vehiculo v2 = new Vehiculo(Algoritmos.generarPlacaAleatoria());
		Vehiculo v3 = new Vehiculo(Algoritmos.generarPlacaAleatoria());
		Vehiculo v4 = new Vehiculo(Algoritmos.generarPlacaAleatoria());
		Vehiculo v5 = new Vehiculo(Algoritmos.generarPlacaAleatoria());

		System.out.println("Placas de automoviles generadas:");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);

		vector2[0] = v1;
		vector2[1] = v2;
		vector2[2] = v3;
		vector2[3] = v4;
		vector2[4] = v5;

		System.out.println("\nVector de vehiculos sin ordenar: ");
		for (Vehiculo elem : vector2)
			System.out.println(elem);

		tiempo = System.nanoTime();
		Ordenacion.seleccionR(vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("\nVector de Vehiculo Ordenados en " + tiempo + " ns"
				+ "\nVector de vehiculos Ordenados por el metodo de Seleccion: ");
		for (Vehiculo elem : vector2)
			System.out.println(elem);
		
		tiempo = System.nanoTime();
		Ordenacion.seleccionR(vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("\nVector de Vehiculo Ordenados en " + tiempo + " ns"
				+ "\nVector de vehiculos Ordenados por el metodo de Seleccion: ");
		for (Vehiculo elem : vector2)
			System.out.println(elem);

		tiempo = System.nanoTime();
		Ordenacion.insercionR(vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("\nVector de Vehiculo Ordenados en " + tiempo + " ns"
				+ "\nVector de vehiculos Ordenados por el metodo de Insercion: ");
		for (Vehiculo elem : vector2)
			System.out.println(elem);

		System.out.println("\nBusqueda de dato por el metodo Secuencial de " + v3);
		tiempo = System.nanoTime();
		pos = Busqueda.busquedaSecuencialR(v3, vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out
				.println((pos == -1 ? "NO ENCONTRADO" : "ENCONTRADO EN LA POSICION " + pos) + " EN " + tiempo + " ns");

		tiempo = System.nanoTime();
		Ordenacion.bubbleSortR(vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println("\nVector de Vehiculo Ordenados por BubbleSort en " + tiempo + " ns"
				+ "\nVector de vehiculos Ordenados por el metodo de BubbleSort: ");
		for (Vehiculo elem : vector2)
			System.out.println(elem);
		
		System.out.println("\nBusqueda de dato por el metodo Binario de " + v3);
		tiempo = System.nanoTime();
		pos = Busqueda.busquedaBinariaR(v3, vector2);
		tiempo = System.nanoTime() - tiempo;
		System.out.println((pos==-1? "NO ENCONTRADO":"ENCONTRADO EN LA POSICION " + pos) + " EN " + tiempo + " ns");
	}
}
