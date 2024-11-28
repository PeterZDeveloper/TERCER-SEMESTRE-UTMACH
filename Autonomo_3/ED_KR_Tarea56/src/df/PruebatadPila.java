package df;
import algoritmos.AlgoritmosPilas;
import tadPila.Pila;
import tadPila.PilaVacia;
import tadPila.TadPila;

public class PruebatadPila {

	public static void main(String[] args) {
		Pila<Integer> pila1 = new TadPila<>("Pila 1");
		Pila<Libro> pila2 = new TadPila<>("Libros");
		Integer dato;
		Libro libro;
		
		pila1.apilar(2);
		pila1.apilar(5);
		pila1.apilar(3);
		pila1.imprimirPila();
		
		System.out.println("Informacion de la pila: " + pila1.getNombre());
		try {
		System.out.println("Cima de la Pila: " + pila1.cima());
		System.out.println("Tiene " + pila1.numElemPila() + " elementos");
		dato = pila1.desapilar();
		System.out.println("Dato desapilado: " + dato);
		pila1.imprimirPila();
		pila1.decapitar();
		System.out.println("Se a eliminado la cima");
		pila1.imprimirPila();
		pila1.eliminarPila();
		System.out.println("Se a eliminado la pila");
		pila1.imprimirPila();
		}catch(PilaVacia e) {
			System.out.println(e.getMessage());
		}
		//PILA DE LIBROS
		pila2.apilar(new Libro("Estructuras de datos", 2021));
		pila2.apilar(new Libro("Huasipungo", 1934));
		pila2.apilar(new Libro("Estructuras de datos para Dummies", 2020));
		pila2.imprimirPila();
		try {
			System.out.println("La pila " + pila2.getNombre() + " tiene " + AlgoritmosPilas.contarPila(pila2) + " elementos");
		} catch (PilaVacia e) {
		}
		libro = new Libro("Cien a�os de Soledad", 1967);
		System.out.println("Sumergir el libro " + libro);
		try {
			AlgoritmosPilas.sumergir(pila2, libro);
			pila2.imprimirPila();
		} catch (PilaVacia e) {
		}
	}

}
