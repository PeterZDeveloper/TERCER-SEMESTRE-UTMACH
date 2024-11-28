package df;
import algoritmos.Algoritmos;
import tadCola.Cola;
import tadCola.ColaVacia;
import tadCola.TadCola;
import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class Rutina {

	public static void main(String[] args) {
		Personas dato;
		
		Personas p1 = new Personas(Algoritmos.cedulaAleatorio("07"), "Kevin", 47, 42.62);
		Personas p2 = new Personas(Algoritmos.cedulaAleatorio("07"), "Joel", 53, 49.84);
		Personas p3 = new Personas(Algoritmos.cedulaAleatorio("07"), "Maria", 45, 44.48);
		Personas p4 = new Personas(Algoritmos.cedulaAleatorio("07"), "Isabel", 71, 49.61);
		Personas p5 = new Personas(Algoritmos.cedulaAleatorio("07"), "Pedro", 24, 77.91);
		
		Pila<Personas> pila1 = new TadPila<>("Personas");
		
		System.out.println("--------------------APILANDO PERSONAS--------------------");
		pila1.apilar(p1);
		pila1.apilar(p2);
		pila1.apilar(p3);
		pila1.apilar(p4);
		pila1.apilar(p5);
		pila1.imprimirPila();
		
		try {
			dato = pila1.desapilar();
			System.out.println("DATO DESAPILADO: " + dato);
			pila1.imprimirPila();
			pila1.decapitar();
			System.out.println("ELEMENTO DE LA CIMA DECAPITADO");
			pila1.imprimirPila();
			pila1.eliminarPila();
			System.out.println("PILA ELIMINADA");
		}catch(PilaVacia e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n ");
		Cola<Personas> cola1 = new TadCola<>("Cola");
		
		System.out.println("-------------------ENCOLANDO PERSONAS--------------------");
		cola1.encolar(p1);
		cola1.encolar(p2);
		cola1.encolar(p3);
		cola1.encolar(p4);
		cola1.encolar(p5);
		cola1.imprimirCola();
		
		try {
			dato = cola1.desencolar();
			System.out.println("DATO DESENCOLADO: " + dato);
			cola1.imprimirCola();
			cola1.quitarPrimero();
			System.out.println("PRIMER ELEMENTO DE LA COLA RETIRADO");
			cola1.imprimirCola();
			cola1.eliminarCola();
			System.out.println("COLA ELIMINADA");
		}catch(ColaVacia e) {
			System.out.println(e.getMessage());
		}
	}

}
