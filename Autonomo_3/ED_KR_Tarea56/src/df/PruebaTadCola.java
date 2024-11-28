package df;

import algoritmos.Algoritmos;
import algoritmos.AlgoritmosColas;
import tadCola.Cola;
import tadCola.ColaVacia;
import tadCola.TadCola;

public class PruebaTadCola {

	public static void main(String[] args) {
		Cola<Vehiculo> cola = new TadCola<>("Vehiculos");
		Vehiculo vehiculo;
		
		System.out.println("Cola " + cola.getNombre());
		
		for(int i=0;i<=4;i++) {
			cola.encolar(new Vehiculo(Algoritmos.generarPlacaAleatoria()));
		}
		cola.imprimirCola();
		try {
			vehiculo = cola.desencolar();
			System.out.println("Se a desencolado " + vehiculo);
			cola.imprimirCola();
		} catch (ColaVacia e) {
			System.out.println(e.getMessage());
		}
		System.out.println("La cola " + cola.getNombre() + " tiene ahora " + AlgoritmosColas.contarCola(cola) + " elementos");
		cola.imprimirCola();
	}

}
