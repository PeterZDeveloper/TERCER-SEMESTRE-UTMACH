package algoritmos;

import tadPila.Pila;
import tadPila.PilaVacia;

public class AlgoritmosPilas {
	public static <T> int contarPila(Pila<T> pila) throws PilaVacia {
		int resul;
		T elem;
		if (!pila.pilaVacia()) {
			elem = pila.desapilar();
			resul = 1 + contarPila(pila);
			pila.apilar(elem);
		} else {
			resul = 0;
		}
		return resul;
	}
	
	public static <T> void sumergir(Pila<T> pila, T dato) throws PilaVacia {
		T elem;
		if (!pila.pilaVacia()) {
			elem = pila.desapilar();
			sumergir(pila, dato);
			pila.apilar(elem);
		}else {
			pila.apilar(dato);
		}
	}
}

